// Generated from C:/Users/Tchlix/Desktop/TW/1DMeshParallel-master/MIAK_scrapper/src/main/resources/antlr/v4\Scrapper.g4 by ANTLR 4.9.2
package antlr.v4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScrapperLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"COMMENT", "SINGLE_QUOTATION", "DOUBLE_QUOTATION", "WS", "ELEMENTS_TYPE", 
			"PARSE_OPTION", "END", "OPERATOR", "IF_OPERATOR", "VAR", "NUMBER"
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


	public ScrapperLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scrapper.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0131\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\7\33\u00c9\n\33\f\33\16\33"+
		"\u00cc\13\33\3\33\3\33\3\34\3\34\7\34\u00d2\n\34\f\34\16\34\u00d5\13\34"+
		"\3\34\3\34\3\35\3\35\7\35\u00db\n\35\f\35\16\35\u00de\13\35\3\35\3\35"+
		"\3\36\6\36\u00e3\n\36\r\36\16\36\u00e4\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00f9"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0109\n \3!\3!\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0118\n#\3$\3$\7$\u011c\n$\f$\16$\u011f"+
		"\13$\3%\5%\u0122\n%\3%\7%\u0125\n%\f%\16%\u0128\13%\3%\5%\u012b\n%\3%"+
		"\6%\u012e\n%\r%\16%\u012f\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\r\4\2\f\f\17\17\3\2)"+
		")\3\2$$\5\2\13\f\17\17\"\"\5\2,-//\61\61\4\2>>@@\4\2C\\c|\5\2\62;C\\c"+
		"|\4\2--//\3\2\62;\3\2\60\60\2\u0140\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5R\3\2\2\2"+
		"\7V\3\2\2\2\tZ\3\2\2\2\13`\3\2\2\2\rc\3\2\2\2\17k\3\2\2\2\21p\3\2\2\2"+
		"\23y\3\2\2\2\25{\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u0081\3\2\2\2\35"+
		"\u0085\3\2\2\2\37\u008f\3\2\2\2!\u0095\3\2\2\2#\u009a\3\2\2\2%\u009d\3"+
		"\2\2\2\'\u00a1\3\2\2\2)\u00a5\3\2\2\2+\u00aa\3\2\2\2-\u00af\3\2\2\2/\u00b6"+
		"\3\2\2\2\61\u00ba\3\2\2\2\63\u00c3\3\2\2\2\65\u00c6\3\2\2\2\67\u00cf\3"+
		"\2\2\29\u00d8\3\2\2\2;\u00e2\3\2\2\2=\u00f8\3\2\2\2?\u0108\3\2\2\2A\u010a"+
		"\3\2\2\2C\u010c\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I\u0121\3\2\2\2K"+
		"L\7E\2\2LM\7T\2\2MN\7G\2\2NO\7C\2\2OP\7V\2\2PQ\7G\2\2Q\4\3\2\2\2RS\7U"+
		"\2\2ST\7G\2\2TU\7V\2\2U\6\3\2\2\2VW\7N\2\2WX\7Q\2\2XY\7I\2\2Y\b\3\2\2"+
		"\2Z[\7R\2\2[\\\7C\2\2\\]\7T\2\2]^\7U\2\2^_\7G\2\2_\n\3\2\2\2`a\7V\2\2"+
		"ab\7Q\2\2b\f\3\2\2\2cd\7T\2\2de\7G\2\2ef\7R\2\2fg\7N\2\2gh\7C\2\2hi\7"+
		"E\2\2ij\7G\2\2j\16\3\2\2\2kl\7Y\2\2lm\7K\2\2mn\7V\2\2no\7J\2\2o\20\3\2"+
		"\2\2pq\7E\2\2qr\7J\2\2rs\7K\2\2st\7N\2\2tu\7F\2\2uv\7T\2\2vw\7G\2\2wx"+
		"\7P\2\2x\22\3\2\2\2yz\7*\2\2z\24\3\2\2\2{|\7+\2\2|\26\3\2\2\2}~\7]\2\2"+
		"~\30\3\2\2\2\177\u0080\7_\2\2\u0080\32\3\2\2\2\u0081\u0082\7I\2\2\u0082"+
		"\u0083\7G\2\2\u0083\u0084\7V\2\2\u0084\34\3\2\2\2\u0085\u0086\7C\2\2\u0086"+
		"\u0087\7V\2\2\u0087\u0088\7V\2\2\u0088\u0089\7T\2\2\u0089\u008a\7K\2\2"+
		"\u008a\u008b\7D\2\2\u008b\u008c\7W\2\2\u008c\u008d\7V\2\2\u008d\u008e"+
		"\7G\2\2\u008e\36\3\2\2\2\u008f\u0090\7K\2\2\u0090\u0091\7P\2\2\u0091\u0092"+
		"\7P\2\2\u0092\u0093\7G\2\2\u0093\u0094\7T\2\2\u0094 \3\2\2\2\u0095\u0096"+
		"\7V\2\2\u0096\u0097\7G\2\2\u0097\u0098\7Z\2\2\u0098\u0099\7V\2\2\u0099"+
		"\"\3\2\2\2\u009a\u009b\7K\2\2\u009b\u009c\7H\2\2\u009c$\3\2\2\2\u009d"+
		"\u009e\7G\2\2\u009e\u009f\7P\2\2\u009f\u00a0\7F\2\2\u00a0&\3\2\2\2\u00a1"+
		"\u00a2\7H\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7T\2\2\u00a4(\3\2\2\2\u00a5"+
		"\u00a6\7N\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7R\2\2"+
		"\u00a9*\3\2\2\2\u00aa\u00ab\7H\2\2\u00ab\u00ac\7T\2\2\u00ac\u00ad\7Q\2"+
		"\2\u00ad\u00ae\7O\2\2\u00ae,\3\2\2\2\u00af\u00b0\7N\2\2\u00b0\u00b1\7"+
		"G\2\2\u00b1\u00b2\7P\2\2\u00b2\u00b3\7I\2\2\u00b3\u00b4\7V\2\2\u00b4\u00b5"+
		"\7J\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7Y\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9"+
		"\7D\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7G\2\2\u00bb\u00bc\7N\2\2\u00bc\u00bd"+
		"\7G\2\2\u00bd\u00be\7O\2\2\u00be\u00bf\7G\2\2\u00bf\u00c0\7P\2\2\u00c0"+
		"\u00c1\7V\2\2\u00c1\u00c2\7U\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7D\2\2\u00c4"+
		"\u00c5\7[\2\2\u00c5\64\3\2\2\2\u00c6\u00ca\7%\2\2\u00c7\u00c9\n\2\2\2"+
		"\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\33\2\2"+
		"\u00ce\66\3\2\2\2\u00cf\u00d3\7)\2\2\u00d0\u00d2\n\3\2\2\u00d1\u00d0\3"+
		"\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7)\2\2\u00d78\3\2\2\2\u00d8"+
		"\u00dc\7$\2\2\u00d9\u00db\n\4\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\7$\2\2\u00e0:\3\2\2\2\u00e1\u00e3\t\5\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7E\2\2\u00e7\u00e8\7N\2\2\u00e8\u00e9"+
		"\7C\2\2\u00e9\u00ea\7U\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7\"\2\2\u00ec"+
		"\u00ed\7P\2\2\u00ed\u00ee\7C\2\2\u00ee\u00ef\7O\2\2\u00ef\u00f9\7G\2\2"+
		"\u00f0\u00f1\7V\2\2\u00f1\u00f2\7C\2\2\u00f2\u00f3\7I\2\2\u00f3\u00f4"+
		"\7\"\2\2\u00f4\u00f5\7P\2\2\u00f5\u00f6\7C\2\2\u00f6\u00f7\7O\2\2\u00f7"+
		"\u00f9\7G\2\2\u00f8\u00e6\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f9>\3\2\2\2\u00fa"+
		"\u00fb\7K\2\2\u00fb\u00fc\7P\2\2\u00fc\u0109\7V\2\2\u00fd\u00fe\7H\2\2"+
		"\u00fe\u00ff\7N\2\2\u00ff\u0100\7Q\2\2\u0100\u0101\7C\2\2\u0101\u0109"+
		"\7V\2\2\u0102\u0103\7U\2\2\u0103\u0104\7V\2\2\u0104\u0105\7T\2\2\u0105"+
		"\u0106\7K\2\2\u0106\u0107\7P\2\2\u0107\u0109\7I\2\2\u0108\u00fa\3\2\2"+
		"\2\u0108\u00fd\3\2\2\2\u0108\u0102\3\2\2\2\u0109@\3\2\2\2\u010a\u010b"+
		"\7=\2\2\u010bB\3\2\2\2\u010c\u010d\t\6\2\2\u010dD\3\2\2\2\u010e\u010f"+
		"\7>\2\2\u010f\u0118\7?\2\2\u0110\u0111\7@\2\2\u0111\u0118\7?\2\2\u0112"+
		"\u0113\7?\2\2\u0113\u0118\7?\2\2\u0114\u0115\7#\2\2\u0115\u0118\7?\2\2"+
		"\u0116\u0118\t\7\2\2\u0117\u010e\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0112"+
		"\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0116\3\2\2\2\u0118F\3\2\2\2\u0119"+
		"\u011d\t\b\2\2\u011a\u011c\t\t\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eH\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u0120\u0122\t\n\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u012a\3\2\2\2\u0123\u0125\t\13\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3"+
		"\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012b\t\f\2\2\u012a\u0126\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\3\2\2\2\u012c\u012e\t\13\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130J\3\2\2\2"+
		"\17\2\u00ca\u00d3\u00dc\u00e4\u00f8\u0108\u0117\u011d\u0121\u0126\u012a"+
		"\u012f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}