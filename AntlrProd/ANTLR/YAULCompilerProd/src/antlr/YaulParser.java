// Generated from Yaul.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YaulParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WRITE=9, 
		SEMICOLON=10, ID=11, NUM=12, MATRIX=13, INT_TYPE=14, MATRIX_TYPE=15, COMMENT=16, 
		WS=17, TRANSPOSE=18;
	public static final int
		RULE_prog = 0, RULE_function = 1, RULE_decl = 2, RULE_expr = 3, RULE_writeExpressions = 4, 
		RULE_writeNormals = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "function", "decl", "expr", "writeExpressions", "writeNormals"
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

	@Override
	public String getGrammarFileName() { return "Yaul.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YaulParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(YaulParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				function();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclarationContext extends FunctionContext {
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<WriteExpressionsContext> writeExpressions() {
			return getRuleContexts(WriteExpressionsContext.class);
		}
		public WriteExpressionsContext writeExpressions(int i) {
			return getRuleContext(WriteExpressionsContext.class,i);
		}
		public List<WriteNormalsContext> writeNormals() {
			return getRuleContexts(WriteNormalsContext.class);
		}
		public WriteNormalsContext writeNormals(int i) {
			return getRuleContext(WriteNormalsContext.class,i);
		}
		public FunctionDeclarationContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			_localctx = new FunctionDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(ID);
			setState(20);
			match(T__0);
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(25);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(21);
					decl();
					}
					break;
				case 2:
					{
					setState(22);
					expr(0);
					}
					break;
				case 3:
					{
					setState(23);
					writeExpressions();
					}
					break;
				case 4:
					{
					setState(24);
					writeNormals();
					}
					break;
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << ID) | (1L << NUM) | (1L << INT_TYPE) | (1L << MATRIX_TYPE))) != 0) );
			setState(29);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransposedMatrixDeclarationContext extends DeclContext {
		public List<TerminalNode> ID() { return getTokens(YaulParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(YaulParser.ID, i);
		}
		public TerminalNode TRANSPOSE() { return getToken(YaulParser.TRANSPOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public TransposedMatrixDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterTransposedMatrixDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitTransposedMatrixDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitTransposedMatrixDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationMatrixContext extends DeclContext {
		public TerminalNode MATRIX_TYPE() { return getToken(YaulParser.MATRIX_TYPE, 0); }
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode MATRIX() { return getToken(YaulParser.MATRIX, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public DeclarationMatrixContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterDeclarationMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitDeclarationMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitDeclarationMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationEmptyMatrixContext extends DeclContext {
		public TerminalNode MATRIX_TYPE() { return getToken(YaulParser.MATRIX_TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(YaulParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(YaulParser.ID, i);
		}
		public DeclarationEmptyMatrixContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterDeclarationEmptyMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitDeclarationEmptyMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitDeclarationEmptyMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationExprMultContext extends DeclContext {
		public TerminalNode MATRIX_TYPE() { return getToken(YaulParser.MATRIX_TYPE, 0); }
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TRANSPOSE() { return getTokens(YaulParser.TRANSPOSE); }
		public TerminalNode TRANSPOSE(int i) {
			return getToken(YaulParser.TRANSPOSE, i);
		}
		public VariableDeclarationExprMultContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterVariableDeclarationExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitVariableDeclarationExprMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitVariableDeclarationExprMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationExprivisionContext extends DeclContext {
		public TerminalNode MATRIX_TYPE() { return getToken(YaulParser.MATRIX_TYPE, 0); }
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TRANSPOSE() { return getTokens(YaulParser.TRANSPOSE); }
		public TerminalNode TRANSPOSE(int i) {
			return getToken(YaulParser.TRANSPOSE, i);
		}
		public VariableDeclarationExprivisionContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterVariableDeclarationExprivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitVariableDeclarationExprivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitVariableDeclarationExprivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlreadyDeclaredMatrixContext extends DeclContext {
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode MATRIX() { return getToken(YaulParser.MATRIX, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public AlreadyDeclaredMatrixContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterAlreadyDeclaredMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitAlreadyDeclaredMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitAlreadyDeclaredMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationExprSubtractionContext extends DeclContext {
		public TerminalNode MATRIX_TYPE() { return getToken(YaulParser.MATRIX_TYPE, 0); }
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TRANSPOSE() { return getTokens(YaulParser.TRANSPOSE); }
		public TerminalNode TRANSPOSE(int i) {
			return getToken(YaulParser.TRANSPOSE, i);
		}
		public VariableDeclarationExprSubtractionContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterVariableDeclarationExprSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitVariableDeclarationExprSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitVariableDeclarationExprSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlreadyDeclaredIntContext extends DeclContext {
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode NUM() { return getToken(YaulParser.NUM, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public AlreadyDeclaredIntContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterAlreadyDeclaredInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitAlreadyDeclaredInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitAlreadyDeclaredInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationEmptyIntContext extends DeclContext {
		public TerminalNode INT_TYPE() { return getToken(YaulParser.INT_TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(YaulParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(YaulParser.ID, i);
		}
		public DeclarationEmptyIntContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterDeclarationEmptyInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitDeclarationEmptyInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitDeclarationEmptyInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationContext extends DeclContext {
		public TerminalNode INT_TYPE() { return getToken(YaulParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode NUM() { return getToken(YaulParser.NUM, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public DeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclarationExprAdditionContext extends DeclContext {
		public TerminalNode MATRIX_TYPE() { return getToken(YaulParser.MATRIX_TYPE, 0); }
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TRANSPOSE() { return getTokens(YaulParser.TRANSPOSE); }
		public TerminalNode TRANSPOSE(int i) {
			return getToken(YaulParser.TRANSPOSE, i);
		}
		public VariableDeclarationExprAdditionContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterVariableDeclarationExprAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitVariableDeclarationExprAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitVariableDeclarationExprAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(INT_TYPE);
				setState(32);
				match(ID);
				setState(33);
				match(T__2);
				setState(34);
				match(NUM);
				setState(35);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new DeclarationMatrixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(MATRIX_TYPE);
				setState(37);
				match(ID);
				setState(38);
				match(T__2);
				setState(39);
				match(MATRIX);
				setState(40);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new DeclarationEmptyMatrixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(MATRIX_TYPE);
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(42);
						match(T__3);
						}
					}

					setState(45);
					match(ID);
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 || _la==ID );
				setState(50);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new AlreadyDeclaredMatrixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(ID);
				setState(52);
				match(T__2);
				setState(53);
				match(MATRIX);
				setState(54);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new DeclarationEmptyIntContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(INT_TYPE);
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(56);
						match(T__3);
						}
					}

					setState(59);
					match(ID);
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 || _la==ID );
				setState(64);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new AlreadyDeclaredIntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__2);
				setState(67);
				match(NUM);
				setState(68);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new TransposedMatrixDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				match(ID);
				setState(70);
				match(T__2);
				setState(71);
				match(ID);
				setState(72);
				match(TRANSPOSE);
				setState(73);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new VariableDeclarationExprMultContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				match(MATRIX_TYPE);
				setState(75);
				match(ID);
				setState(76);
				match(T__2);
				{
				setState(77);
				expr(0);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSPOSE) {
					{
					setState(78);
					match(TRANSPOSE);
					}
				}

				}
				setState(81);
				match(T__4);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					expr(0);
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TRANSPOSE) {
						{
						setState(83);
						match(TRANSPOSE);
						}
					}

					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(90);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new VariableDeclarationExprivisionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
				match(MATRIX_TYPE);
				setState(93);
				match(ID);
				setState(94);
				match(T__2);
				{
				setState(95);
				expr(0);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSPOSE) {
					{
					setState(96);
					match(TRANSPOSE);
					}
				}

				}
				setState(99);
				match(T__5);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					expr(0);
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TRANSPOSE) {
						{
						setState(101);
						match(TRANSPOSE);
						}
					}

					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(108);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new VariableDeclarationExprAdditionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				match(MATRIX_TYPE);
				setState(111);
				match(ID);
				setState(112);
				match(T__2);
				{
				setState(113);
				expr(0);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSPOSE) {
					{
					setState(114);
					match(TRANSPOSE);
					}
				}

				}
				setState(117);
				match(T__6);
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					expr(0);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TRANSPOSE) {
						{
						setState(119);
						match(TRANSPOSE);
						}
					}

					}
					}
					setState(124); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(126);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new VariableDeclarationExprSubtractionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(128);
				match(MATRIX_TYPE);
				setState(129);
				match(ID);
				setState(130);
				match(T__2);
				{
				setState(131);
				expr(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSPOSE) {
					{
					setState(132);
					match(TRANSPOSE);
					}
				}

				}
				setState(135);
				match(T__7);
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					expr(0);
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TRANSPOSE) {
						{
						setState(137);
						match(TRANSPOSE);
						}
					}

					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(144);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubtractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUM() { return getToken(YaulParser.NUM, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(149);
				match(ID);
				}
				break;
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(154);
						match(T__4);
						setState(156); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(155);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(158); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(161);
						match(T__5);
						setState(163); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(162);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(165); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(168);
						match(T__6);
						setState(170); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(169);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(172); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(175);
						match(T__7);
						setState(177); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(176);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(179); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WriteExpressionsContext extends ParserRuleContext {
		public WriteExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeExpressions; }
	 
		public WriteExpressionsContext() { }
		public void copyFrom(WriteExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteAdditionTransposedContext extends WriteExpressionsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TRANSPOSE() { return getTokens(YaulParser.TRANSPOSE); }
		public TerminalNode TRANSPOSE(int i) {
			return getToken(YaulParser.TRANSPOSE, i);
		}
		public WriteAdditionTransposedContext(WriteExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteAdditionTransposed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteAdditionTransposed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteAdditionTransposed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteDivisionContext extends WriteExpressionsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public WriteDivisionContext(WriteExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteDivisionTransposedContext extends WriteExpressionsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TRANSPOSE() { return getTokens(YaulParser.TRANSPOSE); }
		public TerminalNode TRANSPOSE(int i) {
			return getToken(YaulParser.TRANSPOSE, i);
		}
		public WriteDivisionTransposedContext(WriteExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteDivisionTransposed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteDivisionTransposed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteDivisionTransposed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteMultiplicationTransposedContext extends WriteExpressionsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TRANSPOSE() { return getTokens(YaulParser.TRANSPOSE); }
		public TerminalNode TRANSPOSE(int i) {
			return getToken(YaulParser.TRANSPOSE, i);
		}
		public WriteMultiplicationTransposedContext(WriteExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteMultiplicationTransposed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteMultiplicationTransposed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteMultiplicationTransposed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteSubtractionTransposedContext extends WriteExpressionsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TRANSPOSE() { return getTokens(YaulParser.TRANSPOSE); }
		public TerminalNode TRANSPOSE(int i) {
			return getToken(YaulParser.TRANSPOSE, i);
		}
		public WriteSubtractionTransposedContext(WriteExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteSubtractionTransposed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteSubtractionTransposed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteSubtractionTransposed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteMultiplicationContext extends WriteExpressionsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public WriteMultiplicationContext(WriteExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteAdditionContext extends WriteExpressionsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public WriteAdditionContext(WriteExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteSubtractionContext extends WriteExpressionsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public WriteSubtractionContext(WriteExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteExpressionsContext writeExpressions() throws RecognitionException {
		WriteExpressionsContext _localctx = new WriteExpressionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_writeExpressions);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new WriteMultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(WRITE);
				setState(187);
				expr(0);
				setState(188);
				match(T__4);
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(189);
					expr(0);
					}
					}
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(194);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new WriteDivisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(WRITE);
				setState(197);
				expr(0);
				setState(198);
				match(T__5);
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					expr(0);
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(204);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new WriteAdditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(WRITE);
				setState(207);
				expr(0);
				setState(208);
				match(T__6);
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					expr(0);
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(214);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new WriteSubtractionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(WRITE);
				setState(217);
				expr(0);
				setState(218);
				match(T__7);
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(219);
					expr(0);
					}
					}
					setState(222); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(224);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new WriteMultiplicationTransposedContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(WRITE);
				{
				setState(227);
				expr(0);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSPOSE) {
					{
					setState(228);
					match(TRANSPOSE);
					}
				}

				}
				setState(231);
				match(T__4);
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					expr(0);
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TRANSPOSE) {
						{
						setState(233);
						match(TRANSPOSE);
						}
					}

					}
					}
					setState(238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(240);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new WriteDivisionTransposedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(WRITE);
				{
				setState(243);
				expr(0);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSPOSE) {
					{
					setState(244);
					match(TRANSPOSE);
					}
				}

				}
				setState(247);
				match(T__5);
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(248);
					expr(0);
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TRANSPOSE) {
						{
						setState(249);
						match(TRANSPOSE);
						}
					}

					}
					}
					setState(254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(256);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new WriteAdditionTransposedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				match(WRITE);
				{
				setState(259);
				expr(0);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSPOSE) {
					{
					setState(260);
					match(TRANSPOSE);
					}
				}

				}
				setState(263);
				match(T__6);
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(264);
					expr(0);
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TRANSPOSE) {
						{
						setState(265);
						match(TRANSPOSE);
						}
					}

					}
					}
					setState(270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(272);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new WriteSubtractionTransposedContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(274);
				match(WRITE);
				{
				setState(275);
				expr(0);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSPOSE) {
					{
					setState(276);
					match(TRANSPOSE);
					}
				}

				}
				setState(279);
				match(T__7);
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(280);
					expr(0);
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TRANSPOSE) {
						{
						setState(281);
						match(TRANSPOSE);
						}
					}

					}
					}
					setState(286); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==NUM );
				setState(288);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteNormalsContext extends ParserRuleContext {
		public WriteNormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeNormals; }
	 
		public WriteNormalsContext() { }
		public void copyFrom(WriteNormalsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteNumberContext extends WriteNormalsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public TerminalNode NUM() { return getToken(YaulParser.NUM, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public WriteNumberContext(WriteNormalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteTransposedMatrixContext extends WriteNormalsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode TRANSPOSE() { return getToken(YaulParser.TRANSPOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public WriteTransposedMatrixContext(WriteNormalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteTransposedMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteTransposedMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteTransposedMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteVariableContext extends WriteNormalsContext {
		public TerminalNode WRITE() { return getToken(YaulParser.WRITE, 0); }
		public TerminalNode ID() { return getToken(YaulParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(YaulParser.SEMICOLON, 0); }
		public WriteVariableContext(WriteNormalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).enterWriteVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaulListener ) ((YaulListener)listener).exitWriteVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YaulVisitor ) return ((YaulVisitor<? extends T>)visitor).visitWriteVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteNormalsContext writeNormals() throws RecognitionException {
		WriteNormalsContext _localctx = new WriteNormalsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_writeNormals);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new WriteVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(WRITE);
				setState(293);
				match(ID);
				setState(294);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new WriteNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(WRITE);
				setState(296);
				match(NUM);
				setState(297);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new WriteTransposedMatrixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(WRITE);
				setState(299);
				match(ID);
				setState(300);
				match(TRANSPOSE);
				setState(301);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012\u0131\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000"+
		"\f\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001a\b\u0001\u000b\u0001"+
		"\f\u0001\u001b\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0002"+
		"\u0004\u0002/\b\u0002\u000b\u0002\f\u00020\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002:\b"+
		"\u0002\u0001\u0002\u0004\u0002=\b\u0002\u000b\u0002\f\u0002>\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002U\b\u0002\u0004\u0002W\b\u0002\u000b\u0002\f\u0002"+
		"X\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002b\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002g\b\u0002\u0004\u0002i\b\u0002\u000b\u0002\f\u0002j\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002t\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002y\b\u0002\u0004\u0002{\b\u0002\u000b\u0002\f\u0002|\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0086\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u008b\b\u0002\u0004\u0002\u008d\b\u0002\u000b\u0002\f\u0002\u008e\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0093\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0098\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003\u009d\b\u0003\u000b\u0003\f\u0003\u009e\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003\u00a4\b\u0003\u000b\u0003\f\u0003\u00a5\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u00ab\b\u0003\u000b\u0003\f"+
		"\u0003\u00ac\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u00b2\b\u0003"+
		"\u000b\u0003\f\u0003\u00b3\u0005\u0003\u00b6\b\u0003\n\u0003\f\u0003\u00b9"+
		"\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00bf"+
		"\b\u0004\u000b\u0004\f\u0004\u00c0\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00c9\b\u0004\u000b\u0004"+
		"\f\u0004\u00ca\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004\u00d3\b\u0004\u000b\u0004\f\u0004\u00d4\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u00dd\b\u0004\u000b\u0004\f\u0004\u00de\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e6\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00eb\b\u0004\u0004\u0004\u00ed\b"+
		"\u0004\u000b\u0004\f\u0004\u00ee\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00f6\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00fb\b\u0004\u0004\u0004\u00fd\b\u0004\u000b\u0004"+
		"\f\u0004\u00fe\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0106\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u010b\b\u0004\u0004\u0004\u010d\b\u0004\u000b\u0004\f\u0004\u010e\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0116"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u011b\b\u0004"+
		"\u0004\u0004\u011d\b\u0004\u000b\u0004\f\u0004\u011e\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0123\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u012f\b\u0005\u0001\u0005\u0000\u0001\u0006\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0000\u016b\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0002\u0013\u0001\u0000\u0000\u0000\u0004\u0092\u0001\u0000\u0000\u0000"+
		"\u0006\u0097\u0001\u0000\u0000\u0000\b\u0122\u0001\u0000\u0000\u0000\n"+
		"\u012e\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0005\u000b\u0000\u0000\u0014\u0019\u0005\u0001"+
		"\u0000\u0000\u0015\u001a\u0003\u0004\u0002\u0000\u0016\u001a\u0003\u0006"+
		"\u0003\u0000\u0017\u001a\u0003\b\u0004\u0000\u0018\u001a\u0003\n\u0005"+
		"\u0000\u0019\u0015\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u0003\u0001\u0000\u0000"+
		"\u0000\u001f \u0005\u000e\u0000\u0000 !\u0005\u000b\u0000\u0000!\"\u0005"+
		"\u0003\u0000\u0000\"#\u0005\f\u0000\u0000#\u0093\u0005\n\u0000\u0000$"+
		"%\u0005\u000f\u0000\u0000%&\u0005\u000b\u0000\u0000&\'\u0005\u0003\u0000"+
		"\u0000\'(\u0005\r\u0000\u0000(\u0093\u0005\n\u0000\u0000).\u0005\u000f"+
		"\u0000\u0000*,\u0005\u0004\u0000\u0000+*\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0005\u000b\u0000\u0000"+
		".+\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0093\u0005"+
		"\n\u0000\u000034\u0005\u000b\u0000\u000045\u0005\u0003\u0000\u000056\u0005"+
		"\r\u0000\u00006\u0093\u0005\n\u0000\u00007<\u0005\u000e\u0000\u00008:"+
		"\u0005\u0004\u0000\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;=\u0005\u000b\u0000\u0000<9\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0093\u0005\n\u0000\u0000"+
		"AB\u0005\u000b\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0005\f\u0000\u0000"+
		"D\u0093\u0005\n\u0000\u0000EF\u0005\u000b\u0000\u0000FG\u0005\u0003\u0000"+
		"\u0000GH\u0005\u000b\u0000\u0000HI\u0005\u0012\u0000\u0000I\u0093\u0005"+
		"\n\u0000\u0000JK\u0005\u000f\u0000\u0000KL\u0005\u000b\u0000\u0000LM\u0005"+
		"\u0003\u0000\u0000MO\u0003\u0006\u0003\u0000NP\u0005\u0012\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QV\u0005\u0005\u0000\u0000RT\u0003\u0006\u0003\u0000SU\u0005\u0012"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001"+
		"\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0005\n\u0000\u0000[\u0093\u0001\u0000\u0000\u0000\\]\u0005\u000f"+
		"\u0000\u0000]^\u0005\u000b\u0000\u0000^_\u0005\u0003\u0000\u0000_a\u0003"+
		"\u0006\u0003\u0000`b\u0005\u0012\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ch\u0005\u0006\u0000"+
		"\u0000df\u0003\u0006\u0003\u0000eg\u0005\u0012\u0000\u0000fe\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hd\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005\n\u0000\u0000"+
		"m\u0093\u0001\u0000\u0000\u0000no\u0005\u000f\u0000\u0000op\u0005\u000b"+
		"\u0000\u0000pq\u0005\u0003\u0000\u0000qs\u0003\u0006\u0003\u0000rt\u0005"+
		"\u0012\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uz\u0005\u0007\u0000\u0000vx\u0003\u0006\u0003"+
		"\u0000wy\u0005\u0012\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y{\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u007f\u0005\n\u0000\u0000\u007f\u0093\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u000f\u0000\u0000\u0081\u0082\u0005"+
		"\u000b\u0000\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0085\u0003"+
		"\u0006\u0003\u0000\u0084\u0086\u0005\u0012\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u008c\u0005\b\u0000\u0000\u0088\u008a\u0003\u0006"+
		"\u0003\u0000\u0089\u008b\u0005\u0012\u0000\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000"+
		"\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005\n\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u001f\u0001\u0000\u0000"+
		"\u0000\u0092$\u0001\u0000\u0000\u0000\u0092)\u0001\u0000\u0000\u0000\u0092"+
		"3\u0001\u0000\u0000\u0000\u00927\u0001\u0000\u0000\u0000\u0092A\u0001"+
		"\u0000\u0000\u0000\u0092E\u0001\u0000\u0000\u0000\u0092J\u0001\u0000\u0000"+
		"\u0000\u0092\\\u0001\u0000\u0000\u0000\u0092n\u0001\u0000\u0000\u0000"+
		"\u0092\u0080\u0001\u0000\u0000\u0000\u0093\u0005\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0006\u0003\uffff\uffff\u0000\u0095\u0098\u0005\u000b\u0000"+
		"\u0000\u0096\u0098\u0005\f\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u00b7\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\n\u0006\u0000\u0000\u009a\u009c\u0005\u0005\u0000\u0000\u009b"+
		"\u009d\u0003\u0006\u0003\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00b6\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\n\u0005\u0000\u0000\u00a1\u00a3\u0005\u0006\u0000\u0000\u00a2\u00a4"+
		"\u0003\u0006\u0003\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00b6\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\n\u0004\u0000\u0000\u00a8\u00aa\u0005\u0007\u0000\u0000\u00a9\u00ab\u0003"+
		"\u0006\u0003\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b6\u0001\u0000\u0000\u0000\u00ae\u00af\n\u0003"+
		"\u0000\u0000\u00af\u00b1\u0005\b\u0000\u0000\u00b0\u00b2\u0003\u0006\u0003"+
		"\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u0099\u0001\u0000\u0000"+
		"\u0000\u00b5\u00a0\u0001\u0000\u0000\u0000\u00b5\u00a7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u0007\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005\t\u0000\u0000\u00bb\u00bc\u0003\u0006\u0003\u0000"+
		"\u00bc\u00be\u0005\u0005\u0000\u0000\u00bd\u00bf\u0003\u0006\u0003\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\n\u0000\u0000\u00c3"+
		"\u0123\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\t\u0000\u0000\u00c5\u00c6"+
		"\u0003\u0006\u0003\u0000\u00c6\u00c8\u0005\u0006\u0000\u0000\u00c7\u00c9"+
		"\u0003\u0006\u0003\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005\n\u0000\u0000\u00cd\u0123\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\t\u0000\u0000\u00cf\u00d0\u0003\u0006\u0003\u0000\u00d0\u00d2\u0005\u0007"+
		"\u0000\u0000\u00d1\u00d3\u0003\u0006\u0003\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005\n\u0000\u0000\u00d7\u0123\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\t\u0000\u0000\u00d9\u00da\u0003\u0006\u0003\u0000"+
		"\u00da\u00dc\u0005\b\u0000\u0000\u00db\u00dd\u0003\u0006\u0003\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\n\u0000\u0000\u00e1\u0123"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\t\u0000\u0000\u00e3\u00e5\u0003"+
		"\u0006\u0003\u0000\u00e4\u00e6\u0005\u0012\u0000\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ec\u0005\u0005\u0000\u0000\u00e8\u00ea\u0003"+
		"\u0006\u0003\u0000\u00e9\u00eb\u0005\u0012\u0000\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005"+
		"\n\u0000\u0000\u00f1\u0123\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\t"+
		"\u0000\u0000\u00f3\u00f5\u0003\u0006\u0003\u0000\u00f4\u00f6\u0005\u0012"+
		"\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fc\u0005\u0006"+
		"\u0000\u0000\u00f8\u00fa\u0003\u0006\u0003\u0000\u00f9\u00fb\u0005\u0012"+
		"\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0005\n\u0000\u0000\u0101\u0123\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005\t\u0000\u0000\u0103\u0105\u0003\u0006\u0003\u0000"+
		"\u0104\u0106\u0005\u0012\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u010c\u0005\u0007\u0000\u0000\u0108\u010a\u0003\u0006\u0003\u0000"+
		"\u0109\u010b\u0005\u0012\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000"+
		"\u010c\u0108\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0005\n\u0000\u0000\u0111"+
		"\u0123\u0001\u0000\u0000\u0000\u0112\u0113\u0005\t\u0000\u0000\u0113\u0115"+
		"\u0003\u0006\u0003\u0000\u0114\u0116\u0005\u0012\u0000\u0000\u0115\u0114"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0001\u0000\u0000\u0000\u0117\u011c\u0005\b\u0000\u0000\u0118\u011a\u0003"+
		"\u0006\u0003\u0000\u0119\u011b\u0005\u0012\u0000\u0000\u011a\u0119\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001"+
		"\u0000\u0000\u0000\u011c\u0118\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"\n\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u00ba\u0001\u0000"+
		"\u0000\u0000\u0122\u00c4\u0001\u0000\u0000\u0000\u0122\u00ce\u0001\u0000"+
		"\u0000\u0000\u0122\u00d8\u0001\u0000\u0000\u0000\u0122\u00e2\u0001\u0000"+
		"\u0000\u0000\u0122\u00f2\u0001\u0000\u0000\u0000\u0122\u0102\u0001\u0000"+
		"\u0000\u0000\u0122\u0112\u0001\u0000\u0000\u0000\u0123\t\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005\t\u0000\u0000\u0125\u0126\u0005\u000b\u0000\u0000"+
		"\u0126\u012f\u0005\n\u0000\u0000\u0127\u0128\u0005\t\u0000\u0000\u0128"+
		"\u0129\u0005\f\u0000\u0000\u0129\u012f\u0005\n\u0000\u0000\u012a\u012b"+
		"\u0005\t\u0000\u0000\u012b\u012c\u0005\u000b\u0000\u0000\u012c\u012d\u0005"+
		"\u0012\u0000\u0000\u012d\u012f\u0005\n\u0000\u0000\u012e\u0124\u0001\u0000"+
		"\u0000\u0000\u012e\u0127\u0001\u0000\u0000\u0000\u012e\u012a\u0001\u0000"+
		"\u0000\u0000\u012f\u000b\u0001\u0000\u0000\u0000-\u000f\u0019\u001b+0"+
		"9>OTXafjsx|\u0085\u008a\u008e\u0092\u0097\u009e\u00a5\u00ac\u00b3\u00b5"+
		"\u00b7\u00c0\u00ca\u00d4\u00de\u00e5\u00ea\u00ee\u00f5\u00fa\u00fe\u0105"+
		"\u010a\u010e\u0115\u011a\u011e\u0122\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}