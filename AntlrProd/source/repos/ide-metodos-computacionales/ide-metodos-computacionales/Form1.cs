using System;
using System.Drawing;
using System.Windows.Forms;
using Bunifu.Utils;
using System.Text.RegularExpressions;
using System.IO;
using ScintillaNET;
using System.Collections.Generic;
using System.Data;
using System.Linq;

namespace ide_metodos_computacionales
{
    public partial class Form1 : BunifuForm
    {
        string activefileRoute;
        string fileName;

        static Form f0;

        private SaveFileDialog saveDialog;
        private OpenFileDialog openDialog;

        private CSharpLexer cSharpLexer = new CSharpLexer("main WRITE MATRIX INT");

        public Form1(){
            InitializeComponent();
            saveDialog = new SaveFileDialog();
            openDialog = new OpenFileDialog();
            f0 = this;
        }

        private void Form1_Load(object sender, EventArgs e){
            button1.TabStop = false;
            button1.FlatStyle = FlatStyle.Flat;
            button1.FlatAppearance.BorderSize = 0;
            button2.FlatStyle = FlatStyle.Flat;
            button2.FlatAppearance.BorderSize = 0;
            button3.FlatStyle = FlatStyle.Flat;
            button3.FlatAppearance.BorderSize = 0;

            scintilla1.StyleResetDefault();
            scintilla1.Styles[Style.Default].Font = "Consolas";
            scintilla1.Styles[Style.Default].Size = 12;
            scintilla1.Styles[Style.Default].BackColor = Color.FromArgb(38, 42, 51);
            scintilla1.StyleClearAll();

            scintilla1.Styles[CSharpLexer.StyleDefault].ForeColor = Color.White;
            scintilla1.Styles[CSharpLexer.StyleKeyword].ForeColor = Color.FromArgb(red: 199, green: 68, blue: 170);
            scintilla1.Styles[CSharpLexer.StyleIdentifier].ForeColor = Color.FromArgb(red: 68, green: 199, blue: 170);
            scintilla1.Styles[CSharpLexer.StyleSymbols].ForeColor = Color.FromArgb(red: 238, green: 72, blue: 55);
            scintilla1.Styles[CSharpLexer.StyleNumber].ForeColor = Color.FromArgb(red: 243, green: 125, blue: 44);
            scintilla1.Styles[CSharpLexer.StyleParemthesisBrackets].ForeColor = Color.FromArgb(red: 199, green: 201, blue: 0);
            scintilla1.Styles[CSharpLexer.StyleString].ForeColor = Color.FromArgb(red: 150, green: 224, blue: 114);

            richTextBox1.Visible = false;
            richTextBox2.Visible = false;
            panel2.Visible = false;

            scintilla1.Lexer = Lexer.Container;

            f0.Text = "IDE Metodos Computacionales";
        }

        private void button1_Click(object sender, EventArgs e){
            contextMenuStrip1.Show(MousePosition);
        }

        private void salirToolStripMenuItem_Click(object sender, EventArgs e){
            Application.Exit();
        }

        private void abrirCarpetaToolStripMenuItem_Click(object sender, EventArgs e){
            if(folderBrowserDialog1.ShowDialog() == DialogResult.OK)
            {
                Cursor.Current = Cursors.WaitCursor;

                DirectoryViewer.Nodes.Clear();

                foreach (var item in Directory.GetDirectories(folderBrowserDialog1.SelectedPath))
                {
                    DirectoryInfo directoryInfo = new DirectoryInfo(item);
                    var directoryNode = DirectoryViewer.Nodes.Add(directoryInfo.Name);
                    directoryNode.ImageIndex = 0;
                    directoryNode.SelectedImageIndex = 0;
                    directoryNode.Tag = directoryInfo;
                }

                foreach (var item in Directory.GetFiles(folderBrowserDialog1.SelectedPath))
                {
                    FileInfo fileInfo = new FileInfo(item);
                    var fileNode = DirectoryViewer.Nodes.Add(fileInfo.Name);
                    fileNode.ImageIndex = 1;
                    fileNode.SelectedImageIndex = 1;
                    fileNode.Tag = fileInfo;
                }

                Cursor.Current = Cursors.Default;
            }
        }

        private void DirectoryViewer_NodeMouseDoubleClick(object sender, TreeNodeMouseClickEventArgs e){

            if(e.Node.Tag == null){
            }
            else if(e.Node.Tag.GetType() == typeof(DirectoryInfo)){

                e.Node.Nodes.Clear();

                foreach (var item in Directory.GetDirectories(((DirectoryInfo)e.Node.Tag).FullName)){
                    DirectoryInfo directoryInfo = new DirectoryInfo(item);
                    var directoryNode = e.Node.Nodes.Add(directoryInfo.Name);
                    directoryNode.ImageIndex = 0;
                    directoryNode.SelectedImageIndex = 0;
                    directoryNode.Tag = directoryInfo;
                }
                foreach (var item in Directory.GetFiles(((DirectoryInfo)e.Node.Tag).FullName)){
                    FileInfo fileInfo = new FileInfo(item);
                    var fileNode = e.Node.Nodes.Add(fileInfo.Name);
                    fileNode.ImageIndex = 1;
                    fileNode.SelectedImageIndex = 1;
                    fileNode.Tag = fileInfo;
                }
                e.Node.Expand();
            } else {

                Console.WriteLine(File.ReadAllText(((FileInfo)e.Node.Tag).FullName));
                scintilla1.Text = File.ReadAllText(((FileInfo)e.Node.Tag).FullName);
                activefileRoute = ((FileInfo)e.Node.Tag).FullName;
                fileName = ((FileInfo)e.Node.Tag).Name;
                fileNameText.Text = ((FileInfo)e.Node.Tag).Name;
            }
        }

        private void nuevoArchivoToolStripMenuItem_Click(object sender, EventArgs e){
            scintilla1.Text = "";
            fileNameText.Text = "Untitled-1 ●";
        }

        private void scintilla1_StyleNeeded(object sender, StyleNeededEventArgs e){
            var startPos = scintilla1.GetEndStyled();
            var endPos = e.Position;

            if(activefileRoute != null){ 
                if (File.ReadAllText(activefileRoute) != scintilla1.Text)
                {
                    fileNameText.Text = fileName + " ●";
                }
                else
                {
                    fileNameText.Text = fileName;
                }
            }

            cSharpLexer.Style(scintilla1, startPos, endPos);
        }

        public class CSharpLexer{
            public const int StyleDefault = 0;
            public const int StyleKeyword = 1;
            public const int StyleIdentifier = 2;
            public const int StyleNumber = 3;
            public const int StyleString = 4;
            public const int StyleParemthesisBrackets = 5;
            public const int StyleSymbols = 6;

            private const int STATE_UNKNOWN = 0;
            private const int STATE_IDENTIFIER = 1;
            private const int STATE_NUMBER = 2;
            private const int STATE_STRING = 3;
            private const int STATE_IDENTIFIER_SYMBOLS = 4;

            private HashSet<string> keywords;

            public void Style(Scintilla scintilla, int startPos, int endPos){

                var line = scintilla.LineFromPosition(startPos);
                startPos = scintilla.Lines[line].Position;

                var length = 0;
                var state = STATE_UNKNOWN;

                scintilla.StartStyling(startPos);

                while (startPos < endPos){
                    
                    var c = (char)scintilla.GetCharAt(startPos);
                
                REPROCESS:
                    switch (state){
                        case STATE_UNKNOWN:
                            if (c == '"' || c == '\''){
                                scintilla.SetStyling(1, StyleString);
                                state = STATE_STRING;
                            } else if (c == '{' || c == '[' || c == '}' || c == ']' || c == '(' || c == ')'){
                                scintilla.SetStyling(1, StyleParemthesisBrackets);
                            } else if (Char.IsDigit(c)){
                                state = STATE_NUMBER;
                                goto REPROCESS;
                            } else if (Char.IsLetter(c)){                             
                                state = STATE_IDENTIFIER;
                                goto REPROCESS;
                            } else if (Char.IsSymbol(c) || Char.IsSeparator(c) || Char.IsPunctuation(c)){
                                Console.WriteLine(c);
                                state = STATE_IDENTIFIER_SYMBOLS;
                                goto REPROCESS;
                            }
                            else {
                                scintilla.SetStyling(1, StyleDefault);
                            }
                            break;

                        case STATE_STRING:
                            if (c == '"' || c == '\''){
                                length++;
                                scintilla.SetStyling(length, StyleString);
                                length = 0;
                                state = STATE_UNKNOWN;
                            } else {
                                length++;
                            }
                            break;

                        case STATE_NUMBER:
                            if (Char.IsDigit(c) || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F') || c == 'x'){
                                length++;
                            } else {
                                scintilla.SetStyling(length, StyleNumber);
                                length = 0;
                                state = STATE_UNKNOWN;
                                goto REPROCESS;
                            }
                            break;

                        case STATE_IDENTIFIER:
                            if (Char.IsLetterOrDigit(c)){
                                length++;
                            } else {
                                var style = StyleIdentifier;
                                var identifier = scintilla.GetTextRange(startPos - length, length);
                                if (keywords.Contains(identifier)){
                                    style = StyleKeyword;
                                }
                                scintilla.SetStyling(length, style);
                                length = 0;
                                state = STATE_UNKNOWN;
                                goto REPROCESS;
                            }
                            break;

                        case STATE_IDENTIFIER_SYMBOLS:
                            length++;
                            scintilla.SetStyling(length, StyleSymbols);
                            length = 0;
                            state = STATE_UNKNOWN;
                       
                            break;
                    }
                    startPos++;
                }
            }

            public CSharpLexer(string keywords)
            {
                var list = Regex.Split(keywords ?? string.Empty, @"\s+").Where(l => !string.IsNullOrEmpty(l));
                this.keywords = new HashSet<string>(list);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (activefileRoute != null)
            {
                File.WriteAllText(activefileRoute, scintilla1.Text);

                if (File.ReadAllText(activefileRoute) != scintilla1.Text)
                {
                    fileNameText.Text = fileName + " ●";
                }
                else
                {
                    fileNameText.Text = fileName;
                }

            }

            richTextBox1.Text = "";
            string argument = (@"/C java -jar " + Application.StartupPath + "\\YaulCompilator.jar " + activefileRoute);
            System.Diagnostics.Process process = new System.Diagnostics.Process();
            process.StartInfo.WindowStyle = System.Diagnostics.ProcessWindowStyle.Hidden;
            process.StartInfo.FileName = "cmd.exe";
            process.StartInfo.Arguments = argument;
            process.StartInfo.UseShellExecute = false;
            process.StartInfo.CreateNoWindow = true;
            process.StartInfo.RedirectStandardOutput = true;
            process.StartInfo.RedirectStandardInput = true;
            process.StartInfo.RedirectStandardError = true;
            process.Start();
            string q = "";
            StreamReader myStreamReader = process.StandardError;
            while (!process.HasExited)
            {
                q += process.StandardOutput.ReadToEnd();
            }
            if(q == "")
            {
                richTextBox1.Text = myStreamReader.ReadToEnd();
                richTextBox1.ForeColor = Color.Red;

            } else
            {
                richTextBox1.Text = q;
                richTextBox1.ForeColor = Color.White;
            }
            
            richTextBox1.Visible = true;
            richTextBox2.Visible = true;
            panel2.Visible = true;
            scintilla1.Size = new System.Drawing.Size(1399, 450);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            richTextBox1.Visible = false;
            richTextBox2.Visible = false;
            panel2.Visible = false;
            scintilla1.Size = new System.Drawing.Size(1399, 718);
        }

        private void guardarArchivoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if(activefileRoute != null)
            {
                File.WriteAllText(activefileRoute, scintilla1.Text);

                if (File.ReadAllText(activefileRoute) != scintilla1.Text)
                {
                    fileNameText.Text = fileName + " ●";
                }
                else
                {
                    fileNameText.Text = fileName;
                }

            } else
            {
                string sfdname = saveDialog.FileName;
                if (saveDialog.ShowDialog() == DialogResult.OK)
                {
                    sfdname = saveDialog.FileName;
                    TextWriter txt = new StreamWriter(saveDialog.FileName);
                    txt.Write(scintilla1.Text);
                    txt.Close();
                    activefileRoute = sfdname;
                    fileName = Path.GetFileName(activefileRoute);
                    fileNameText.Text = fileName;
                }
            }
        }

        private void abrirArchivoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string sfdname = openDialog.FileName;
            if (openDialog.ShowDialog() == DialogResult.OK)
            {
                sfdname = openDialog.FileName;
                activefileRoute = sfdname;
                fileName = Path.GetFileName(activefileRoute);
                fileNameText.Text = fileName;
                scintilla1.Text = File.ReadAllText(sfdname);
            }
        }
    }
}
