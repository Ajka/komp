// Generated from Acode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AcodeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, AND=22, OR=23, NOT=24, NEWLINE=25, 
		ASSIGN=26, BLOCK_START=27, BLOCK_END=28, IF=29, ELSE=30, WHILE=31, FOR=32, 
		PAREN_OPEN=33, PAREN_CLOSE=34, STRING=35, BOOL=36, INT=37, DOUBLE=38, 
		STR=39, CHAR=40, NUMBER=41, DIGIT=42, WHITESPACE=43, ADD=44, SUB=45, MUL=46, 
		DIV=47, MOD=48, EXP=49, EQ=50, NE=51, LE=52, GE=53, GT=54, LT=55;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'-='", "','", "'['", "'int'", "'ret'", "'void'", "'def'", "'double'", 
		"'break'", "'+='", "'^='", "'char'", "'elseif'", "'*='", "'bool'", "'extern'", 
		"';'", "'%='", "'/='", "'str'", "AND", "OR", "'not'", "'\n'", "':='", 
		"'{'", "'}'", "'if'", "'else'", "'while'", "'for'", "'('", "')'", "STRING", 
		"BOOL", "INT", "DOUBLE", "STR", "CHAR", "NUMBER", "DIGIT", "WHITESPACE", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'=='", "'!='", "'<='", "'>='", 
		"'>'", "'<'"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "AND", "OR", "NOT", "NEWLINE", "ASSIGN", 
		"BLOCK_START", "BLOCK_END", "IF", "ELSE", "WHILE", "FOR", "PAREN_OPEN", 
		"PAREN_CLOSE", "STRING", "BOOL", "INT", "DOUBLE", "STR", "CHAR", "NUMBER", 
		"DIGIT", "WHITESPACE", "ADD", "SUB", "MUL", "DIV", "MOD", "EXP", "EQ", 
		"NE", "LE", "GE", "GT", "LT"
	};


	public AcodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Acode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 42: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\29\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00cb\n\27\3\30\3\30\3\30\3\30\5\30\u00d1"+
		"\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\7$\u00f8\n$\f$\16$\u00fb\13$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u0106\n%\3&\3&\3\'\3\'\3\'\7\'\u010d\n\'\f\'\16\'\u0110\13"+
		"\'\3(\3(\7(\u0114\n(\f(\16(\u0117\13(\3(\3(\3)\3)\3)\3)\3*\3*\3*\7*\u0122"+
		"\n*\f*\16*\u0125\13*\5*\u0127\n*\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\38\38\29\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*"+
		"\1S+\1U,\1W-\2Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1"+
		"m8\1o9\1\3\2\t\4\2C\\c|\5\2\62;C\\c|\3\2$$\3\2))\3\2\63;\3\2\62;\5\2\13"+
		"\f\"\"~~\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7v\3\2\2\2\tx\3\2\2"+
		"\2\13z\3\2\2\2\r~\3\2\2\2\17\u0082\3\2\2\2\21\u0087\3\2\2\2\23\u008b\3"+
		"\2\2\2\25\u0092\3\2\2\2\27\u0098\3\2\2\2\31\u009b\3\2\2\2\33\u009e\3\2"+
		"\2\2\35\u00a3\3\2\2\2\37\u00aa\3\2\2\2!\u00ad\3\2\2\2#\u00b2\3\2\2\2%"+
		"\u00b9\3\2\2\2\'\u00bb\3\2\2\2)\u00be\3\2\2\2+\u00c1\3\2\2\2-\u00ca\3"+
		"\2\2\2/\u00d0\3\2\2\2\61\u00d2\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8\3\2\2"+
		"\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e2\3\2\2\2?\u00e7"+
		"\3\2\2\2A\u00ed\3\2\2\2C\u00f1\3\2\2\2E\u00f3\3\2\2\2G\u00f5\3\2\2\2I"+
		"\u0105\3\2\2\2K\u0107\3\2\2\2M\u0109\3\2\2\2O\u0111\3\2\2\2Q\u011a\3\2"+
		"\2\2S\u0126\3\2\2\2U\u0128\3\2\2\2W\u012a\3\2\2\2Y\u012e\3\2\2\2[\u0130"+
		"\3\2\2\2]\u0132\3\2\2\2_\u0134\3\2\2\2a\u0136\3\2\2\2c\u0138\3\2\2\2e"+
		"\u013a\3\2\2\2g\u013d\3\2\2\2i\u0140\3\2\2\2k\u0143\3\2\2\2m\u0146\3\2"+
		"\2\2o\u0148\3\2\2\2qr\7_\2\2r\4\3\2\2\2st\7/\2\2tu\7?\2\2u\6\3\2\2\2v"+
		"w\7.\2\2w\b\3\2\2\2xy\7]\2\2y\n\3\2\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2}\f"+
		"\3\2\2\2~\177\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7v\2\2\u0081\16\3\2"+
		"\2\2\u0082\u0083\7x\2\2\u0083\u0084\7q\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7f\2\2\u0086\20\3\2\2\2\u0087\u0088\7f\2\2\u0088\u0089\7g\2\2\u0089\u008a"+
		"\7h\2\2\u008a\22\3\2\2\2\u008b\u008c\7f\2\2\u008c\u008d\7q\2\2\u008d\u008e"+
		"\7w\2\2\u008e\u008f\7d\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091"+
		"\24\3\2\2\2\u0092\u0093\7d\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7c\2\2\u0096\u0097\7m\2\2\u0097\26\3\2\2\2\u0098\u0099\7-\2\2\u0099"+
		"\u009a\7?\2\2\u009a\30\3\2\2\2\u009b\u009c\7`\2\2\u009c\u009d\7?\2\2\u009d"+
		"\32\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7h\2\2"+
		"\u00a9\36\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ac\7?\2\2\u00ac \3\2\2\2"+
		"\u00ad\u00ae\7d\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7z\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"$\3\2\2\2\u00b9\u00ba\7=\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7\'\2\2\u00bc"+
		"\u00bd\7?\2\2\u00bd(\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0\7?\2\2\u00c0"+
		"*\3\2\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		",\3\2\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7p\2\2\u00c7\u00cb\7f\2\2\u00c8"+
		"\u00c9\7(\2\2\u00c9\u00cb\7(\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb.\3\2\2\2\u00cc\u00cd\7q\2\2\u00cd\u00d1\7t\2\2\u00ce\u00cf\7"+
		"~\2\2\u00cf\u00d1\7~\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\60\3\2\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\62\3\2\2\2\u00d6\u00d7\7\f\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7<\2\2\u00d9"+
		"\u00da\7?\2\2\u00da\66\3\2\2\2\u00db\u00dc\7}\2\2\u00dc8\3\2\2\2\u00dd"+
		"\u00de\7\177\2\2\u00de:\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7h\2\2"+
		"\u00e1<\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7u\2"+
		"\2\u00e5\u00e6\7g\2\2\u00e6>\3\2\2\2\u00e7\u00e8\7y\2\2\u00e8\u00e9\7"+
		"j\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7g\2\2\u00ec@"+
		"\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"B\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2D\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4F"+
		"\3\2\2\2\u00f5\u00f9\t\2\2\2\u00f6\u00f8\t\3\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faH\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff"+
		"\7n\2\2\u00ff\u0100\7u\2\2\u0100\u0106\7g\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7t\2\2\u0103\u0104\7w\2\2\u0104\u0106\7g\2\2\u0105\u00fc\3\2\2"+
		"\2\u0105\u0101\3\2\2\2\u0106J\3\2\2\2\u0107\u0108\5S*\2\u0108L\3\2\2\2"+
		"\u0109\u010a\5S*\2\u010a\u010e\7\60\2\2\u010b\u010d\5U+\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"N\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0115\7$\2\2\u0112\u0114\n\4\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7$\2\2\u0119"+
		"P\3\2\2\2\u011a\u011b\7)\2\2\u011b\u011c\n\5\2\2\u011c\u011d\7)\2\2\u011d"+
		"R\3\2\2\2\u011e\u0127\7\62\2\2\u011f\u0123\t\6\2\2\u0120\u0122\5U+\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u011e\3\2\2\2\u0126"+
		"\u011f\3\2\2\2\u0127T\3\2\2\2\u0128\u0129\t\7\2\2\u0129V\3\2\2\2\u012a"+
		"\u012b\t\b\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b,\2\2\u012dX\3\2\2\2\u012e"+
		"\u012f\7-\2\2\u012fZ\3\2\2\2\u0130\u0131\7/\2\2\u0131\\\3\2\2\2\u0132"+
		"\u0133\7,\2\2\u0133^\3\2\2\2\u0134\u0135\7\61\2\2\u0135`\3\2\2\2\u0136"+
		"\u0137\7\'\2\2\u0137b\3\2\2\2\u0138\u0139\7`\2\2\u0139d\3\2\2\2\u013a"+
		"\u013b\7?\2\2\u013b\u013c\7?\2\2\u013cf\3\2\2\2\u013d\u013e\7#\2\2\u013e"+
		"\u013f\7?\2\2\u013fh\3\2\2\2\u0140\u0141\7>\2\2\u0141\u0142\7?\2\2\u0142"+
		"j\3\2\2\2\u0143\u0144\7@\2\2\u0144\u0145\7?\2\2\u0145l\3\2\2\2\u0146\u0147"+
		"\7@\2\2\u0147n\3\2\2\2\u0148\u0149\7>\2\2\u0149p\3\2\2\2\13\2\u00ca\u00d0"+
		"\u00f9\u0105\u010e\u0115\u0123\u0126";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}