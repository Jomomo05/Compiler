package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.YaulLexer;
import antlr.YaulParser;
import expression.AntlrToProgram;
import expression.ErrorListener;

public class ExpressionMain {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.print("Error al cargar archivo, cambie a una ruta valida\n");
		} else {
			String fileName = args[0];
			YaulParser parser = getParser(fileName);
			
			ParseTree antlrAST = parser.prog();
			
			if(ErrorListener.hasError) {
				
			} else {
				AntlrToProgram progVisitor = new AntlrToProgram();
				progVisitor.visit(antlrAST);
				
				boolean noErrors = true;
				
				if(progVisitor.semanticErrors.isEmpty()) {
					try {
						noErrors = runProcess("javac C:\\YaulCompiler\\*.java", noErrors);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if(noErrors) {
						System.out.println("C:\\> java -cp C:\\YaulCompiler Main \n");
						try {
							runProcess("java -cp C:\\YaulCompiler Main", noErrors);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} else {
					for(String err: progVisitor.semanticErrors) {
						System.err.println(err);
					}
				}
			}
		}
	}
	
	private static YaulParser getParser(String fileName) {
		YaulParser parser = null;
		
		try {
			CharStream input = CharStreams.fromFileName(fileName);
			YaulLexer lexer = new YaulLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new YaulParser(tokens);
			
			parser.removeErrorListeners();
			parser.addErrorListener(new ErrorListener());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return parser;
	}
	
    private static boolean runProcess(String command, boolean noErrors) throws Exception {
    	String line = null;
        Process pro = Runtime.getRuntime().exec(command);
        BufferedReader err = new BufferedReader(new InputStreamReader(pro.getErrorStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(pro.getInputStream()));
        while ((line = in.readLine()) != null) {
        	noErrors = false;
        	System.out.println(line);
        }
        line = null;
        while ((line = err.readLine()) != null) {
        	noErrors = false;
        	System.err.println(line);
        }
        
        pro.waitFor();
        return noErrors;
      }

}
