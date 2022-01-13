// Generated from compiler1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiler1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FuncType=6, Ident=7, Return=8, 
		Hexadecimal_prefix=9, Octal_const=10, Decimal_const=11, Hexadecimal_const=12, 
		Nonzero_digit=13, Octal_digit=14, Digit=15, Hexadecimal_digit=16, Line_comment=17, 
		Comment=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "FuncType", "Ident", "Return", 
			"Hexadecimal_prefix", "Octal_const", "Decimal_const", "Hexadecimal_const", 
			"Nonzero_digit", "Octal_digit", "Digit", "Hexadecimal_digit", "Line_comment", 
			"Comment", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'int'", "'main'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "FuncType", "Ident", "Return", "Hexadecimal_prefix", 
			"Octal_const", "Decimal_const", "Hexadecimal_const", "Nonzero_digit", 
			"Octal_digit", "Digit", "Hexadecimal_digit", "Line_comment", "Comment", 
			"WS"
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


	public compiler1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiler1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\nH\n\n\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\f\3\f\7\fS\n"+
		"\f\f\f\16\fV\13\f\3\r\3\r\3\r\7\r[\n\r\f\r\16\r^\13\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\5\20f\n\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22n\n\22\f\22"+
		"\16\22q\13\22\3\22\5\22t\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23~\n\23\f\23\16\23\u0081\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\4o\177\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\4\5\2\62;CHch\7\2\13\f"+
		"\17\17\"\"))~~\2\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2"+
		"\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\67\3\2\2\2\21<"+
		"\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27P\3\2\2\2\31W\3\2\2\2\33_\3\2\2\2\35"+
		"a\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%y\3\2\2\2\'\u0087\3\2\2\2)*"+
		"\7*\2\2*\4\3\2\2\2+,\7+\2\2,\6\3\2\2\2-.\7}\2\2.\b\3\2\2\2/\60\7\177\2"+
		"\2\60\n\3\2\2\2\61\62\7=\2\2\62\f\3\2\2\2\63\64\7k\2\2\64\65\7p\2\2\65"+
		"\66\7v\2\2\66\16\3\2\2\2\678\7o\2\289\7c\2\29:\7k\2\2:;\7p\2\2;\20\3\2"+
		"\2\2<=\7t\2\2=>\7g\2\2>?\7v\2\2?@\7w\2\2@A\7t\2\2AB\7p\2\2B\22\3\2\2\2"+
		"CD\7\62\2\2DH\7z\2\2EF\7\62\2\2FH\7Z\2\2GC\3\2\2\2GE\3\2\2\2H\24\3\2\2"+
		"\2IM\7\62\2\2JL\5\35\17\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\26"+
		"\3\2\2\2OM\3\2\2\2PT\5\33\16\2QS\5\37\20\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2U\30\3\2\2\2VT\3\2\2\2WX\5\23\n\2X\\\5!\21\2Y[\5!\21\2ZY\3"+
		"\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\32\3\2\2\2^\\\3\2\2\2_`\4\63;"+
		"\2`\34\3\2\2\2ab\4\629\2b\36\3\2\2\2cf\7\62\2\2df\5\33\16\2ec\3\2\2\2"+
		"ed\3\2\2\2f \3\2\2\2gh\t\2\2\2h\"\3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2"+
		"\2\2ln\13\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2ps\3\2\2\2qo\3"+
		"\2\2\2rt\7\17\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\f\2\2vw\3\2\2\2wx"+
		"\b\22\2\2x$\3\2\2\2yz\7\61\2\2z{\7,\2\2{\177\3\2\2\2|~\13\2\2\2}|\3\2"+
		"\2\2~\u0081\3\2\2\2\177\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\u0083\7,\2\2\u0083\u0084\7\61\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\b\23\2\2\u0086&\3\2\2\2\u0087\u0088\t\3\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\b\24\2\2\u008a(\3\2\2\2\13\2GMT\\eos\177\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}