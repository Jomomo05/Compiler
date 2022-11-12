// Generated from Yaul.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YaulLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WRITE=9, 
		SEMICOLON=10, ID=11, NUM=12, MATRIX=13, INT_TYPE=14, MATRIX_TYPE=15, COMMENT=16, 
		WS=17, TRANSPOSE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "WRITE", 
			"SEMICOLON", "ID", "NUM", "MATRIX", "INT_TYPE", "MATRIX_TYPE", "COMMENT", 
			"WS", "TRANSPOSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "','", "'*'", "'/'", "'+'", "'-'", "'WRITE'", 
			"';'", null, null, null, null, null, null, null, "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "WRITE", "SEMICOLON", 
			"ID", "NUM", "MATRIX", "INT_TYPE", "MATRIX_TYPE", "COMMENT", "WS", "TRANSPOSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public YaulLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Yaul.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n@\b"+
		"\n\n\n\f\nC\t\n\u0001\u000b\u0001\u000b\u0003\u000bG\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000bK\b\u000b\n\u000b\f\u000bN\t\u000b\u0003\u000b"+
		"P\b\u000b\u0001\f\u0001\f\u0003\fT\b\f\u0001\f\u0001\f\u0005\fX\b\f\n"+
		"\f\f\f[\t\f\u0001\f\u0003\f^\b\f\u0005\f`\b\f\n\f\f\fc\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rm\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e{\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0081\b\u000f\n\u000f\f\u000f\u0084\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0004\u0010\u0089\b\u0010\u000b\u0010\f\u0010\u008a\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001Y\u0000\u0012\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012\u0001\u0000\u0006\u0001\u0000az\u0003\u0000"+
		"09AZaz\u0001\u000019\u0001\u000009\u0002\u0000\n\n\r\r\u0003\u0000\t\n"+
		"\r\r  \u009b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%"+
		"\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001"+
		"\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000"+
		"\u0000\u000b/\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f"+
		"3\u0001\u0000\u0000\u0000\u00115\u0001\u0000\u0000\u0000\u0013;\u0001"+
		"\u0000\u0000\u0000\u0015=\u0001\u0000\u0000\u0000\u0017O\u0001\u0000\u0000"+
		"\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bl\u0001\u0000\u0000\u0000\u001d"+
		"z\u0001\u0000\u0000\u0000\u001f|\u0001\u0000\u0000\u0000!\u0088\u0001"+
		"\u0000\u0000\u0000#\u008e\u0001\u0000\u0000\u0000%&\u0005{\u0000\u0000"+
		"&\u0002\u0001\u0000\u0000\u0000\'(\u0005}\u0000\u0000(\u0004\u0001\u0000"+
		"\u0000\u0000)*\u0005=\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005"+
		",\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005*\u0000\u0000.\n\u0001"+
		"\u0000\u0000\u0000/0\u0005/\u0000\u00000\f\u0001\u0000\u0000\u000012\u0005"+
		"+\u0000\u00002\u000e\u0001\u0000\u0000\u000034\u0005-\u0000\u00004\u0010"+
		"\u0001\u0000\u0000\u000056\u0005W\u0000\u000067\u0005R\u0000\u000078\u0005"+
		"I\u0000\u000089\u0005T\u0000\u00009:\u0005E\u0000\u0000:\u0012\u0001\u0000"+
		"\u0000\u0000;<\u0005;\u0000\u0000<\u0014\u0001\u0000\u0000\u0000=A\u0007"+
		"\u0000\u0000\u0000>@\u0007\u0001\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000B\u0016\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DP\u0005"+
		"0\u0000\u0000EG\u0005-\u0000\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HL\u0007\u0002\u0000\u0000IK\u0007"+
		"\u0003\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000OD\u0001\u0000\u0000\u0000OF\u0001\u0000"+
		"\u0000\u0000P\u0018\u0001\u0000\u0000\u0000Qa\u0005[\u0000\u0000RT\u0005"+
		",\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UY\u0007\u0002\u0000\u0000VX\u0007\u0003\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\^\u0005;\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_S\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005]\u0000"+
		"\u0000e\u001a\u0001\u0000\u0000\u0000fg\u0005i\u0000\u0000gh\u0005n\u0000"+
		"\u0000hm\u0005t\u0000\u0000ij\u0005I\u0000\u0000jk\u0005N\u0000\u0000"+
		"km\u0005T\u0000\u0000lf\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000"+
		"m\u001c\u0001\u0000\u0000\u0000no\u0005m\u0000\u0000op\u0005a\u0000\u0000"+
		"pq\u0005t\u0000\u0000qr\u0005r\u0000\u0000rs\u0005i\u0000\u0000s{\u0005"+
		"x\u0000\u0000tu\u0005M\u0000\u0000uv\u0005A\u0000\u0000vw\u0005T\u0000"+
		"\u0000wx\u0005R\u0000\u0000xy\u0005I\u0000\u0000y{\u0005X\u0000\u0000"+
		"zn\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000{\u001e\u0001\u0000"+
		"\u0000\u0000|}\u0005/\u0000\u0000}~\u0005/\u0000\u0000~\u0082\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\b\u0004\u0000\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0006\u000f\u0000"+
		"\u0000\u0086 \u0001\u0000\u0000\u0000\u0087\u0089\u0007\u0005\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0006\u0010\u0000\u0000"+
		"\u008d\"\u0001\u0000\u0000\u0000\u008e\u008f\u0005^\u0000\u0000\u008f"+
		"$\u0001\u0000\u0000\u0000\r\u0000AFLOSY]alz\u0082\u008a\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}