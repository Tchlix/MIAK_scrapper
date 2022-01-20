// Generated from C:/Users/Tchlix/Desktop/TW/1DMeshParallel-master/MIAK_scrapper/src/main/resources/antlr/v4\Scrapper.g4 by ANTLR 4.9.2
package antlr.v4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScrapperParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, COMMENT=26, SINGLE_QUOTATION=27, DOUBLE_QUOTATION=28, WS=29, 
		ELEMENTS_TYPE=30, PARSE_OPTION=31, END=32, OPERATOR=33, IF_OPERATOR=34, 
		VAR=35, NUMBER=36;
	public static final int
		RULE_start = 0, RULE_codeBlock = 1, RULE_mainFunction = 2, RULE_create = 3, 
		RULE_assign = 4, RULE_assignable = 5, RULE_log = 6, RULE_parse = 7, RULE_replace = 8, 
		RULE_fchildren = 9, RULE_arrayElement = 10, RULE_string = 11, RULE_getAttribute = 12, 
		RULE_innerText = 13, RULE_ifBlock = 14, RULE_forLoop = 15, RULE_number = 16, 
		RULE_operation = 17, RULE_length = 18, RULE_operable = 19, RULE_request = 20, 
		RULE_primitive = 21, RULE_elements = 22, RULE_documents = 23, RULE_var = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "codeBlock", "mainFunction", "create", "assign", "assignable", 
			"log", "parse", "replace", "fchildren", "arrayElement", "string", "getAttribute", 
			"innerText", "ifBlock", "forLoop", "number", "operation", "length", "operable", 
			"request", "primitive", "elements", "documents", "var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'SET'", "'LOG'", "'PARSE'", "'TO'", "'REPLACE'", "'WITH'", 
			"'CHILDREN'", "'('", "')'", "'['", "']'", "'GET'", "'ATTRIBUTE'", "'INNER'", 
			"'TEXT'", "'IF'", "'END'", "'FOR'", "'LOOP'", "'FROM'", "'LENGTH'", "'WEB'", 
			"'ELEMENTS'", "'BY'", null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "COMMENT", "SINGLE_QUOTATION", "DOUBLE_QUOTATION", "WS", 
			"ELEMENTS_TYPE", "PARSE_OPTION", "END", "OPERATOR", "IF_OPERATOR", "VAR", 
			"NUMBER"
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
	public String getGrammarFileName() { return "Scrapper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScrapperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			codeBlock();
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

	public static class CodeBlockContext extends ParserRuleContext {
		public List<MainFunctionContext> mainFunction() {
			return getRuleContexts(MainFunctionContext.class);
		}
		public MainFunctionContext mainFunction(int i) {
			return getRuleContext(MainFunctionContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(ScrapperParser.END); }
		public TerminalNode END(int i) {
			return getToken(ScrapperParser.END, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ScrapperParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ScrapperParser.COMMENT, i);
		}
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codeBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(57);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__2:
					case T__7:
					case T__16:
					case T__18:
					case VAR:
						{
						setState(52);
						mainFunction();
						setState(53);
						match(END);
						}
						break;
					case COMMENT:
						{
						setState(55);
						match(COMMENT);
						}
						break;
					case WS:
						{
						setState(56);
						match(WS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
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

	public static class MainFunctionContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(62);
				ifBlock();
				}
				break;
			case T__0:
				{
				setState(63);
				create();
				}
				break;
			case T__7:
			case VAR:
				{
				setState(64);
				assign();
				}
				break;
			case T__2:
				{
				setState(65);
				log();
				}
				break;
			case T__18:
				{
				setState(66);
				forLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class CreateContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ScrapperParser.WS, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
			setState(70);
			match(WS);
			setState(71);
			assign();
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

	public static class AssignContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public RequestContext request() {
			return getRuleContext(RequestContext.class,0);
		}
		public FchildrenContext fchildren() {
			return getRuleContext(FchildrenContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			assignable();
			setState(74);
			match(WS);
			setState(75);
			match(T__1);
			setState(76);
			match(WS);
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(77);
				operation();
				}
				break;
			case 2:
				{
				setState(78);
				request();
				}
				break;
			case 3:
				{
				setState(79);
				fchildren();
				}
				break;
			}
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

	public static class AssignableContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(82);
				var();
				}
				break;
			case 2:
				{
				setState(83);
				arrayElement();
				}
				break;
			}
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ScrapperParser.WS, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__2);
			setState(87);
			match(WS);
			setState(88);
			operation();
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

	public static class ParseContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode PARSE_OPTION() { return getToken(ScrapperParser.PARSE_OPTION, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__3);
			setState(91);
			match(WS);
			setState(92);
			operation();
			setState(93);
			match(WS);
			setState(94);
			match(T__4);
			setState(95);
			match(WS);
			setState(96);
			match(PARSE_OPTION);
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

	public static class ReplaceContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public ReplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterReplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitReplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitReplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceContext replace() throws RecognitionException {
		ReplaceContext _localctx = new ReplaceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_replace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			string();
			setState(99);
			match(WS);
			setState(100);
			match(T__5);
			setState(101);
			match(WS);
			setState(102);
			string();
			setState(103);
			match(WS);
			setState(104);
			match(T__6);
			setState(105);
			match(WS);
			setState(106);
			string();
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

	public static class FchildrenContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public FchildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fchildren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterFchildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitFchildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitFchildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FchildrenContext fchildren() throws RecognitionException {
		FchildrenContext _localctx = new FchildrenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fchildren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__7);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(109);
				match(WS);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__8);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(116);
				match(WS);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			assignable();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(123);
				match(WS);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(T__9);
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

	public static class ArrayElementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FchildrenContext fchildren() {
			return getRuleContext(FchildrenContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(131);
				var();
				}
				break;
			case T__7:
				{
				setState(132);
				fchildren();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				match(T__10);
				setState(136);
				operation();
				setState(137);
				match(T__11);
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTATION() { return getToken(ScrapperParser.SINGLE_QUOTATION, 0); }
		public TerminalNode DOUBLE_QUOTATION() { return getToken(ScrapperParser.DOUBLE_QUOTATION, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public InnerTextContext innerText() {
			return getRuleContext(InnerTextContext.class,0);
		}
		public GetAttributeContext getAttribute() {
			return getRuleContext(GetAttributeContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(143);
				match(SINGLE_QUOTATION);
				}
				break;
			case 2:
				{
				setState(144);
				match(DOUBLE_QUOTATION);
				}
				break;
			case 3:
				{
				setState(145);
				var();
				}
				break;
			case 4:
				{
				setState(146);
				arrayElement();
				}
				break;
			case 5:
				{
				setState(147);
				innerText();
				}
				break;
			case 6:
				{
				setState(148);
				getAttribute();
				}
				break;
			}
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

	public static class GetAttributeContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public GetAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterGetAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitGetAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitGetAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetAttributeContext getAttribute() throws RecognitionException {
		GetAttributeContext _localctx = new GetAttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_getAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			assignable();
			setState(152);
			match(WS);
			setState(153);
			match(T__12);
			setState(154);
			match(WS);
			setState(155);
			match(T__13);
			setState(156);
			match(WS);
			setState(157);
			string();
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

	public static class InnerTextContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public InnerTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterInnerText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitInnerText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitInnerText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerTextContext innerText() throws RecognitionException {
		InnerTextContext _localctx = new InnerTextContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_innerText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			assignable();
			setState(160);
			match(WS);
			setState(161);
			match(T__14);
			setState(162);
			match(WS);
			setState(163);
			match(T__15);
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

	public static class IfBlockContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
		}
		public TerminalNode IF_OPERATOR() { return getToken(ScrapperParser.IF_OPERATOR, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__16);
			setState(166);
			match(WS);
			setState(167);
			operable();
			setState(168);
			match(WS);
			setState(169);
			match(IF_OPERATOR);
			setState(170);
			match(WS);
			setState(171);
			operable();
			setState(172);
			match(WS);
			setState(173);
			codeBlock();
			setState(174);
			match(T__17);
			setState(175);
			match(WS);
			setState(176);
			match(T__16);
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

	public static class ForLoopContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public TerminalNode VAR() { return getToken(ScrapperParser.VAR, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__18);
			setState(179);
			match(WS);
			setState(180);
			match(T__19);
			setState(181);
			match(WS);
			setState(182);
			match(VAR);
			setState(183);
			match(WS);
			setState(184);
			match(T__20);
			setState(185);
			match(WS);
			setState(186);
			number();
			setState(187);
			match(WS);
			setState(188);
			match(T__4);
			setState(189);
			match(WS);
			setState(190);
			number();
			setState(191);
			match(WS);
			setState(192);
			codeBlock();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(193);
				match(WS);
				}
			}

			setState(196);
			match(T__17);
			setState(197);
			match(WS);
			setState(198);
			match(T__18);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ScrapperParser.NUMBER, 0); }
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(200);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(201);
				arrayElement();
				}
				break;
			case 3:
				{
				setState(202);
				length();
				}
				break;
			}
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

	public static class OperationContext extends ParserRuleContext {
		public List<OperableContext> operable() {
			return getRuleContexts(OperableContext.class);
		}
		public OperableContext operable(int i) {
			return getRuleContext(OperableContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(ScrapperParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(ScrapperParser.OPERATOR, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(210);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__3:
					case T__7:
					case T__12:
					case SINGLE_QUOTATION:
					case DOUBLE_QUOTATION:
					case VAR:
					case NUMBER:
						{
						setState(205);
						operable();
						}
						break;
					case WS:
						{
						setState(206);
						match(WS);
						setState(207);
						match(OPERATOR);
						setState(208);
						match(WS);
						setState(209);
						operation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ScrapperParser.WS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(214);
				var();
				}
				break;
			case 2:
				{
				setState(215);
				arrayElement();
				}
				break;
			case 3:
				{
				setState(216);
				elements();
				}
				break;
			case 4:
				{
				setState(217);
				string();
				}
				break;
			}
			setState(220);
			match(WS);
			setState(221);
			match(T__21);
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

	public static class OperableContext extends ParserRuleContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ParseContext parse() {
			return getRuleContext(ParseContext.class,0);
		}
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public InnerTextContext innerText() {
			return getRuleContext(InnerTextContext.class,0);
		}
		public ReplaceContext replace() {
			return getRuleContext(ReplaceContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public GetAttributeContext getAttribute() {
			return getRuleContext(GetAttributeContext.class,0);
		}
		public OperableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterOperable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitOperable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitOperable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperableContext operable() throws RecognitionException {
		OperableContext _localctx = new OperableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(223);
				primitive();
				}
				break;
			case 2:
				{
				setState(224);
				elements();
				}
				break;
			case 3:
				{
				setState(225);
				parse();
				}
				break;
			case 4:
				{
				setState(226);
				arrayElement();
				}
				break;
			case 5:
				{
				setState(227);
				innerText();
				}
				break;
			case 6:
				{
				setState(228);
				replace();
				}
				break;
			case 7:
				{
				setState(229);
				length();
				}
				break;
			case 8:
				{
				setState(230);
				getAttribute();
				}
				break;
			}
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

	public static class RequestContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public RequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_request; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitRequest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitRequest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestContext request() throws RecognitionException {
		RequestContext _localctx = new RequestContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_request);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__12);
			setState(234);
			match(WS);
			setState(235);
			match(T__22);
			setState(236);
			match(WS);
			setState(237);
			string();
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

	public static class PrimitiveContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ScrapperParser.VAR, 0); }
		public TerminalNode SINGLE_QUOTATION() { return getToken(ScrapperParser.SINGLE_QUOTATION, 0); }
		public TerminalNode DOUBLE_QUOTATION() { return getToken(ScrapperParser.DOUBLE_QUOTATION, 0); }
		public TerminalNode NUMBER() { return getToken(ScrapperParser.NUMBER, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_QUOTATION) | (1L << DOUBLE_QUOTATION) | (1L << VAR) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ElementsContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(ScrapperParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ScrapperParser.WS, i);
		}
		public TerminalNode ELEMENTS_TYPE() { return getToken(ScrapperParser.ELEMENTS_TYPE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DocumentsContext documents() {
			return getRuleContext(DocumentsContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(241);
				documents();
				}
				break;
			}
			setState(244);
			match(T__12);
			setState(245);
			match(WS);
			setState(246);
			match(T__23);
			setState(247);
			match(WS);
			setState(248);
			match(T__24);
			setState(249);
			match(WS);
			setState(250);
			match(ELEMENTS_TYPE);
			setState(251);
			match(WS);
			setState(252);
			string();
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

	public static class DocumentsContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ScrapperParser.WS, 0); }
		public TerminalNode VAR() { return getToken(ScrapperParser.VAR, 0); }
		public RequestContext request() {
			return getRuleContext(RequestContext.class,0);
		}
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public DocumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterDocuments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitDocuments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitDocuments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentsContext documents() throws RecognitionException {
		DocumentsContext _localctx = new DocumentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_documents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(254);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(255);
				request();
				}
				break;
			case 3:
				{
				setState(256);
				arrayElement();
				}
				break;
			}
			setState(259);
			match(WS);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ScrapperParser.VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScrapperListener ) ((ScrapperListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScrapperVisitor ) return ((ScrapperVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(VAR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u010a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"S\n\6\3\7\3\7\5\7W\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13q\n\13\f\13\16"+
		"\13t\13\13\3\13\3\13\7\13x\n\13\f\13\16\13{\13\13\3\13\3\13\7\13\177\n"+
		"\13\f\13\16\13\u0082\13\13\3\13\3\13\3\f\3\f\5\f\u0088\n\f\3\f\3\f\3\f"+
		"\3\f\6\f\u008e\n\f\r\f\16\f\u008f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0098\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00c5\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00ce"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\6\23\u00d5\n\23\r\23\16\23\u00d6\3\24\3"+
		"\24\3\24\3\24\5\24\u00dd\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00ea\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\5\30\u00f5\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\5\31\u0104\n\31\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\4\2\35\36%&\2\u0116"+
		"\2\64\3\2\2\2\4=\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nK\3\2\2\2\fV\3\2\2\2\16"+
		"X\3\2\2\2\20\\\3\2\2\2\22d\3\2\2\2\24n\3\2\2\2\26\u0087\3\2\2\2\30\u0097"+
		"\3\2\2\2\32\u0099\3\2\2\2\34\u00a1\3\2\2\2\36\u00a7\3\2\2\2 \u00b4\3\2"+
		"\2\2\"\u00cd\3\2\2\2$\u00d4\3\2\2\2&\u00dc\3\2\2\2(\u00e9\3\2\2\2*\u00eb"+
		"\3\2\2\2,\u00f1\3\2\2\2.\u00f4\3\2\2\2\60\u0103\3\2\2\2\62\u0107\3\2\2"+
		"\2\64\65\5\4\3\2\65\3\3\2\2\2\66\67\5\6\4\2\678\7\"\2\28<\3\2\2\29<\7"+
		"\34\2\2:<\7\37\2\2;\66\3\2\2\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>\5\3\2\2\2?=\3\2\2\2@F\5\36\20\2AF\5\b\5\2BF\5\n\6\2CF\5\16"+
		"\b\2DF\5 \21\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\7\3"+
		"\2\2\2GH\7\3\2\2HI\7\37\2\2IJ\5\n\6\2J\t\3\2\2\2KL\5\f\7\2LM\7\37\2\2"+
		"MN\7\4\2\2NR\7\37\2\2OS\5$\23\2PS\5*\26\2QS\5\24\13\2RO\3\2\2\2RP\3\2"+
		"\2\2RQ\3\2\2\2S\13\3\2\2\2TW\5\62\32\2UW\5\26\f\2VT\3\2\2\2VU\3\2\2\2"+
		"W\r\3\2\2\2XY\7\5\2\2YZ\7\37\2\2Z[\5$\23\2[\17\3\2\2\2\\]\7\6\2\2]^\7"+
		"\37\2\2^_\5$\23\2_`\7\37\2\2`a\7\7\2\2ab\7\37\2\2bc\7!\2\2c\21\3\2\2\2"+
		"de\5\30\r\2ef\7\37\2\2fg\7\b\2\2gh\7\37\2\2hi\5\30\r\2ij\7\37\2\2jk\7"+
		"\t\2\2kl\7\37\2\2lm\5\30\r\2m\23\3\2\2\2nr\7\n\2\2oq\7\37\2\2po\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uy\7\13\2\2vx\7\37"+
		"\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|\u0080"+
		"\5\f\7\2}\177\7\37\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\f"+
		"\2\2\u0084\25\3\2\2\2\u0085\u0088\5\62\32\2\u0086\u0088\5\24\13\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u008a\7\r"+
		"\2\2\u008a\u008b\5$\23\2\u008b\u008c\7\16\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\27\3\2\2\2\u0091\u0098\7\35\2\2\u0092\u0098\7\36\2\2\u0093"+
		"\u0098\5\62\32\2\u0094\u0098\5\26\f\2\u0095\u0098\5\34\17\2\u0096\u0098"+
		"\5\32\16\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2"+
		"\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\31"+
		"\3\2\2\2\u0099\u009a\5\f\7\2\u009a\u009b\7\37\2\2\u009b\u009c\7\17\2\2"+
		"\u009c\u009d\7\37\2\2\u009d\u009e\7\20\2\2\u009e\u009f\7\37\2\2\u009f"+
		"\u00a0\5\30\r\2\u00a0\33\3\2\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\37"+
		"\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\7\22\2\2\u00a6"+
		"\35\3\2\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\7\37\2\2\u00a9\u00aa\5(\25"+
		"\2\u00aa\u00ab\7\37\2\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\7\37\2\2\u00ad"+
		"\u00ae\5(\25\2\u00ae\u00af\7\37\2\2\u00af\u00b0\5\4\3\2\u00b0\u00b1\7"+
		"\24\2\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3\7\23\2\2\u00b3\37\3\2\2\2\u00b4"+
		"\u00b5\7\25\2\2\u00b5\u00b6\7\37\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8"+
		"\7\37\2\2\u00b8\u00b9\7%\2\2\u00b9\u00ba\7\37\2\2\u00ba\u00bb\7\27\2\2"+
		"\u00bb\u00bc\7\37\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be\7\37\2\2\u00be"+
		"\u00bf\7\7\2\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7"+
		"\37\2\2\u00c2\u00c4\5\4\3\2\u00c3\u00c5\7\37\2\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00c8\7"+
		"\37\2\2\u00c8\u00c9\7\25\2\2\u00c9!\3\2\2\2\u00ca\u00ce\7&\2\2\u00cb\u00ce"+
		"\5\26\f\2\u00cc\u00ce\5&\24\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00cd\u00cc\3\2\2\2\u00ce#\3\2\2\2\u00cf\u00d5\5(\25\2\u00d0\u00d1\7"+
		"\37\2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\7\37\2\2\u00d3\u00d5\5$\23\2\u00d4"+
		"\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7%\3\2\2\2\u00d8\u00dd\5\62\32\2\u00d9\u00dd"+
		"\5\26\f\2\u00da\u00dd\5.\30\2\u00db\u00dd\5\30\r\2\u00dc\u00d8\3\2\2\2"+
		"\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\7\37\2\2\u00df\u00e0\7\30\2\2\u00e0\'\3\2\2\2\u00e1"+
		"\u00ea\5,\27\2\u00e2\u00ea\5.\30\2\u00e3\u00ea\5\20\t\2\u00e4\u00ea\5"+
		"\26\f\2\u00e5\u00ea\5\34\17\2\u00e6\u00ea\5\22\n\2\u00e7\u00ea\5&\24\2"+
		"\u00e8\u00ea\5\32\16\2\u00e9\u00e1\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3"+
		"\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea)\3\2\2\2\u00eb\u00ec\7\17\2\2"+
		"\u00ec\u00ed\7\37\2\2\u00ed\u00ee\7\31\2\2\u00ee\u00ef\7\37\2\2\u00ef"+
		"\u00f0\5\30\r\2\u00f0+\3\2\2\2\u00f1\u00f2\t\2\2\2\u00f2-\3\2\2\2\u00f3"+
		"\u00f5\5\60\31\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f7\7\17\2\2\u00f7\u00f8\7\37\2\2\u00f8\u00f9\7\32\2\2"+
		"\u00f9\u00fa\7\37\2\2\u00fa\u00fb\7\33\2\2\u00fb\u00fc\7\37\2\2\u00fc"+
		"\u00fd\7 \2\2\u00fd\u00fe\7\37\2\2\u00fe\u00ff\5\30\r\2\u00ff/\3\2\2\2"+
		"\u0100\u0104\7%\2\2\u0101\u0104\5*\26\2\u0102\u0104\5\26\f\2\u0103\u0100"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\7\37\2\2\u0106\61\3\2\2\2\u0107\u0108\7%\2\2\u0108\63\3\2\2\2\25"+
		";=ERVry\u0080\u0087\u008f\u0097\u00c4\u00cd\u00d4\u00d6\u00dc\u00e9\u00f4"+
		"\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}