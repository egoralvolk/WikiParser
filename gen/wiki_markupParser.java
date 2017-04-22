// Generated from D:/Git/Парсер Викиразмертки\wiki_markup.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class wiki_markupParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AnyText=11, H1=12, H2=13, H3=14, H4=15, H5=16, H6=17, Digit=18, 
		KirillicLetter=19, LatinLetter=20, AcuteSymbol=21, AmpersandSymbol=22, 
		ApostropheSymbol=23, AssignmentSymbol=24, AtEmailSymbol=25, BackSlashSymbol=26, 
		CaretSymbol=27, CloseParenthesisSymbol=28, ColonSymbol=29, CommaSymbol=30, 
		DashSymbol=31, DollarSymbol=32, DotSymbol=33, ExclamationMarkSymbol=34, 
		ForwardSlashSymbol=35, GreaterThanSymbol=36, HyphenSymbol=37, LeftCurlyBrace=38, 
		LeftSquareBracketSymbol=39, LessThanSymbol=40, NumSymbol=41, OpenParenthesisSymbol=42, 
		PercentSymbol=43, PipeSimbol=44, PlusSymbol=45, QuoteSymbol=46, QuestionSymbol=47, 
		RightCurlyBrace=48, RightSquareBracketSymbol=49, SemicolonSymbol=50, SharpSymbol=51, 
		StarSymbol=52, TildeSymbol=53, UnderscoreSymbol=54, Whitespace=55;
	public static final int
		RULE_wiki_article = 0, RULE_elements_markup = 1, RULE_tags = 2, RULE_comment = 3, 
		RULE_text_comment = 4, RULE_nowiki = 5, RULE_code = 6, RULE_syntaxhighlight = 7, 
		RULE_pre = 8, RULE_ref = 9, RULE_ref_name = 10, RULE_ref_content = 11, 
		RULE_other_tags = 12, RULE_content_other_tags = 13, RULE_template = 14, 
		RULE_template_element = 15, RULE_ignore_element = 16, RULE_ignore_content = 17, 
		RULE_table = 18, RULE_link = 19, RULE_link_element = 20, RULE_url_or_email = 21, 
		RULE_content_url_or_email = 22, RULE_list = 23, RULE_list_element = 24, 
		RULE_assignment = 25, RULE_accentuation = 26, RULE_logical_accentuation = 27, 
		RULE_structural_accentuation = 28, RULE_text_accentuation = 29, RULE_headers = 30, 
		RULE_contend_header = 31, RULE_header1 = 32, RULE_header2 = 33, RULE_header3 = 34, 
		RULE_header4 = 35, RULE_header5 = 36, RULE_header6 = 37;
	public static final String[] ruleNames = {
		"wiki_article", "elements_markup", "tags", "comment", "text_comment", 
		"nowiki", "code", "syntaxhighlight", "pre", "ref", "ref_name", "ref_content", 
		"other_tags", "content_other_tags", "template", "template_element", "ignore_element", 
		"ignore_content", "table", "link", "link_element", "url_or_email", "content_url_or_email", 
		"list", "list_element", "assignment", "accentuation", "logical_accentuation", 
		"structural_accentuation", "text_accentuation", "headers", "contend_header", 
		"header1", "header2", "header3", "header4", "header5", "header6"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'nowiki'", "'code'", "'syntaxhighlight'", "'pre'", "'<ref'", "'ref'", 
		"'name'", "'name '", "'='", "'{{!}}'", null, null, "'=='", "'==='", "'===='", 
		"'====='", "'======'", null, null, null, "'`'", "'&'", null, null, "'@'", 
		"'\\'", "'^'", "')'", null, "','", null, "'$'", "'.'", "'!'", "'/'", "'>'", 
		"'-'", "'{'", "'['", "'<'", "'\u0432\u201E\u2013'", "'('", "'%'", "'|'", 
		"'+'", null, "'?'", "'}'", "']'", "';'", "'#'", "'*'", "'~'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "AnyText", 
		"H1", "H2", "H3", "H4", "H5", "H6", "Digit", "KirillicLetter", "LatinLetter", 
		"AcuteSymbol", "AmpersandSymbol", "ApostropheSymbol", "AssignmentSymbol", 
		"AtEmailSymbol", "BackSlashSymbol", "CaretSymbol", "CloseParenthesisSymbol", 
		"ColonSymbol", "CommaSymbol", "DashSymbol", "DollarSymbol", "DotSymbol", 
		"ExclamationMarkSymbol", "ForwardSlashSymbol", "GreaterThanSymbol", "HyphenSymbol", 
		"LeftCurlyBrace", "LeftSquareBracketSymbol", "LessThanSymbol", "NumSymbol", 
		"OpenParenthesisSymbol", "PercentSymbol", "PipeSimbol", "PlusSymbol", 
		"QuoteSymbol", "QuestionSymbol", "RightCurlyBrace", "RightSquareBracketSymbol", 
		"SemicolonSymbol", "SharpSymbol", "StarSymbol", "TildeSymbol", "UnderscoreSymbol", 
		"Whitespace"
	};
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
	public String getGrammarFileName() { return "wiki_markup.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public wiki_markupParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Wiki_articleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(wiki_markupParser.EOF, 0); }
		public Elements_markupContext elements_markup() {
			return getRuleContext(Elements_markupContext.class,0);
		}
		public Wiki_articleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiki_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterWiki_article(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitWiki_article(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitWiki_article(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wiki_articleContext wiki_article() throws RecognitionException {
		Wiki_articleContext _localctx = new Wiki_articleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wiki_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << AnyText) | (1L << H1) | (1L << H2) | (1L << H3) | (1L << H4) | (1L << H5) | (1L << H6) | (1L << AmpersandSymbol) | (1L << ApostropheSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DollarSymbol) | (1L << DotSymbol) | (1L << ExclamationMarkSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << LeftCurlyBrace) | (1L << LeftSquareBracketSymbol) | (1L << LessThanSymbol) | (1L << NumSymbol) | (1L << OpenParenthesisSymbol) | (1L << PlusSymbol) | (1L << QuoteSymbol) | (1L << QuestionSymbol) | (1L << SemicolonSymbol) | (1L << SharpSymbol) | (1L << StarSymbol))) != 0)) {
				{
				setState(76);
				elements_markup();
				}
			}

			setState(79);
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

	public static class Elements_markupContext extends ParserRuleContext {
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<Url_or_emailContext> url_or_email() {
			return getRuleContexts(Url_or_emailContext.class);
		}
		public Url_or_emailContext url_or_email(int i) {
			return getRuleContext(Url_or_emailContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<HeadersContext> headers() {
			return getRuleContexts(HeadersContext.class);
		}
		public HeadersContext headers(int i) {
			return getRuleContext(HeadersContext.class,i);
		}
		public List<AccentuationContext> accentuation() {
			return getRuleContexts(AccentuationContext.class);
		}
		public AccentuationContext accentuation(int i) {
			return getRuleContext(AccentuationContext.class,i);
		}
		public List<Ignore_elementContext> ignore_element() {
			return getRuleContexts(Ignore_elementContext.class);
		}
		public Ignore_elementContext ignore_element(int i) {
			return getRuleContext(Ignore_elementContext.class,i);
		}
		public List<TerminalNode> AnyText() { return getTokens(wiki_markupParser.AnyText); }
		public TerminalNode AnyText(int i) {
			return getToken(wiki_markupParser.AnyText, i);
		}
		public List<TerminalNode> CommaSymbol() { return getTokens(wiki_markupParser.CommaSymbol); }
		public TerminalNode CommaSymbol(int i) {
			return getToken(wiki_markupParser.CommaSymbol, i);
		}
		public List<TerminalNode> SemicolonSymbol() { return getTokens(wiki_markupParser.SemicolonSymbol); }
		public TerminalNode SemicolonSymbol(int i) {
			return getToken(wiki_markupParser.SemicolonSymbol, i);
		}
		public List<TerminalNode> AmpersandSymbol() { return getTokens(wiki_markupParser.AmpersandSymbol); }
		public TerminalNode AmpersandSymbol(int i) {
			return getToken(wiki_markupParser.AmpersandSymbol, i);
		}
		public List<TerminalNode> DashSymbol() { return getTokens(wiki_markupParser.DashSymbol); }
		public TerminalNode DashSymbol(int i) {
			return getToken(wiki_markupParser.DashSymbol, i);
		}
		public List<TerminalNode> HyphenSymbol() { return getTokens(wiki_markupParser.HyphenSymbol); }
		public TerminalNode HyphenSymbol(int i) {
			return getToken(wiki_markupParser.HyphenSymbol, i);
		}
		public List<TerminalNode> DotSymbol() { return getTokens(wiki_markupParser.DotSymbol); }
		public TerminalNode DotSymbol(int i) {
			return getToken(wiki_markupParser.DotSymbol, i);
		}
		public List<TerminalNode> ApostropheSymbol() { return getTokens(wiki_markupParser.ApostropheSymbol); }
		public TerminalNode ApostropheSymbol(int i) {
			return getToken(wiki_markupParser.ApostropheSymbol, i);
		}
		public List<TerminalNode> ColonSymbol() { return getTokens(wiki_markupParser.ColonSymbol); }
		public TerminalNode ColonSymbol(int i) {
			return getToken(wiki_markupParser.ColonSymbol, i);
		}
		public List<TerminalNode> QuoteSymbol() { return getTokens(wiki_markupParser.QuoteSymbol); }
		public TerminalNode QuoteSymbol(int i) {
			return getToken(wiki_markupParser.QuoteSymbol, i);
		}
		public List<TerminalNode> ForwardSlashSymbol() { return getTokens(wiki_markupParser.ForwardSlashSymbol); }
		public TerminalNode ForwardSlashSymbol(int i) {
			return getToken(wiki_markupParser.ForwardSlashSymbol, i);
		}
		public List<TerminalNode> ExclamationMarkSymbol() { return getTokens(wiki_markupParser.ExclamationMarkSymbol); }
		public TerminalNode ExclamationMarkSymbol(int i) {
			return getToken(wiki_markupParser.ExclamationMarkSymbol, i);
		}
		public List<TerminalNode> DollarSymbol() { return getTokens(wiki_markupParser.DollarSymbol); }
		public TerminalNode DollarSymbol(int i) {
			return getToken(wiki_markupParser.DollarSymbol, i);
		}
		public List<TerminalNode> QuestionSymbol() { return getTokens(wiki_markupParser.QuestionSymbol); }
		public TerminalNode QuestionSymbol(int i) {
			return getToken(wiki_markupParser.QuestionSymbol, i);
		}
		public List<TerminalNode> PlusSymbol() { return getTokens(wiki_markupParser.PlusSymbol); }
		public TerminalNode PlusSymbol(int i) {
			return getToken(wiki_markupParser.PlusSymbol, i);
		}
		public List<TerminalNode> NumSymbol() { return getTokens(wiki_markupParser.NumSymbol); }
		public TerminalNode NumSymbol(int i) {
			return getToken(wiki_markupParser.NumSymbol, i);
		}
		public Elements_markupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements_markup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterElements_markup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitElements_markup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitElements_markup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elements_markupContext elements_markup() throws RecognitionException {
		Elements_markupContext _localctx = new Elements_markupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_elements_markup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(81);
						tags();
						}
						break;
					case 2:
						{
						setState(82);
						link();
						}
						break;
					case 3:
						{
						setState(83);
						template();
						}
						break;
					case 4:
						{
						setState(84);
						table();
						}
						break;
					case 5:
						{
						setState(85);
						url_or_email();
						}
						break;
					case 6:
						{
						setState(86);
						assignment();
						}
						break;
					case 7:
						{
						setState(87);
						list();
						}
						break;
					case 8:
						{
						setState(88);
						headers();
						}
						break;
					case 9:
						{
						setState(89);
						accentuation();
						}
						break;
					case 10:
						{
						setState(90);
						ignore_element();
						}
						break;
					case 11:
						{
						setState(91);
						match(AnyText);
						}
						break;
					case 12:
						{
						setState(92);
						match(CommaSymbol);
						}
						break;
					case 13:
						{
						setState(93);
						match(SemicolonSymbol);
						}
						break;
					case 14:
						{
						setState(94);
						match(AmpersandSymbol);
						}
						break;
					case 15:
						{
						setState(95);
						match(DashSymbol);
						}
						break;
					case 16:
						{
						setState(96);
						match(HyphenSymbol);
						}
						break;
					case 17:
						{
						setState(97);
						match(DotSymbol);
						}
						break;
					case 18:
						{
						setState(98);
						match(ApostropheSymbol);
						}
						break;
					case 19:
						{
						setState(99);
						match(ColonSymbol);
						}
						break;
					case 20:
						{
						setState(100);
						match(QuoteSymbol);
						}
						break;
					case 21:
						{
						setState(101);
						match(ForwardSlashSymbol);
						}
						break;
					case 22:
						{
						setState(102);
						match(ExclamationMarkSymbol);
						}
						break;
					case 23:
						{
						setState(103);
						match(DollarSymbol);
						}
						break;
					case 24:
						{
						setState(104);
						match(QuestionSymbol);
						}
						break;
					case 25:
						{
						setState(105);
						match(PlusSymbol);
						}
						break;
					case 26:
						{
						setState(106);
						match(NumSymbol);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class TagsContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public NowikiContext nowiki() {
			return getRuleContext(NowikiContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SyntaxhighlightContext syntaxhighlight() {
			return getRuleContext(SyntaxhighlightContext.class,0);
		}
		public PreContext pre() {
			return getRuleContext(PreContext.class,0);
		}
		public Other_tagsContext other_tags() {
			return getRuleContext(Other_tagsContext.class,0);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tags);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				ref();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				comment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				nowiki();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				code();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				syntaxhighlight();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				pre();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				other_tags();
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LessThanSymbol() { return getToken(wiki_markupParser.LessThanSymbol, 0); }
		public TerminalNode ExclamationMarkSymbol() { return getToken(wiki_markupParser.ExclamationMarkSymbol, 0); }
		public List<TerminalNode> HyphenSymbol() { return getTokens(wiki_markupParser.HyphenSymbol); }
		public TerminalNode HyphenSymbol(int i) {
			return getToken(wiki_markupParser.HyphenSymbol, i);
		}
		public TerminalNode GreaterThanSymbol() { return getToken(wiki_markupParser.GreaterThanSymbol, 0); }
		public Text_commentContext text_comment() {
			return getRuleContext(Text_commentContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LessThanSymbol);
			setState(121);
			match(ExclamationMarkSymbol);
			setState(122);
			match(HyphenSymbol);
			setState(123);
			match(HyphenSymbol);
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(124);
				text_comment();
				}
				break;
			}
			setState(127);
			match(HyphenSymbol);
			setState(128);
			match(HyphenSymbol);
			setState(129);
			match(GreaterThanSymbol);
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

	public static class Text_commentContext extends ParserRuleContext {
		public List<Elements_markupContext> elements_markup() {
			return getRuleContexts(Elements_markupContext.class);
		}
		public Elements_markupContext elements_markup(int i) {
			return getRuleContext(Elements_markupContext.class,i);
		}
		public Text_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterText_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitText_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitText_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_commentContext text_comment() throws RecognitionException {
		Text_commentContext _localctx = new Text_commentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(131);
					elements_markup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class NowikiContext extends ParserRuleContext {
		public List<TerminalNode> LessThanSymbol() { return getTokens(wiki_markupParser.LessThanSymbol); }
		public TerminalNode LessThanSymbol(int i) {
			return getToken(wiki_markupParser.LessThanSymbol, i);
		}
		public List<TerminalNode> GreaterThanSymbol() { return getTokens(wiki_markupParser.GreaterThanSymbol); }
		public TerminalNode GreaterThanSymbol(int i) {
			return getToken(wiki_markupParser.GreaterThanSymbol, i);
		}
		public List<TerminalNode> ForwardSlashSymbol() { return getTokens(wiki_markupParser.ForwardSlashSymbol); }
		public TerminalNode ForwardSlashSymbol(int i) {
			return getToken(wiki_markupParser.ForwardSlashSymbol, i);
		}
		public TerminalNode AnyText() { return getToken(wiki_markupParser.AnyText, 0); }
		public TerminalNode Whitespace() { return getToken(wiki_markupParser.Whitespace, 0); }
		public NowikiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nowiki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterNowiki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitNowiki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitNowiki(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NowikiContext nowiki() throws RecognitionException {
		NowikiContext _localctx = new NowikiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nowiki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LessThanSymbol);
			{
			setState(137);
			match(T__0);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Whitespace) {
				{
				setState(138);
				match(Whitespace);
				}
			}

			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ForwardSlashSymbol) {
				{
				setState(141);
				match(ForwardSlashSymbol);
				}
			}

			setState(144);
			match(GreaterThanSymbol);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(145);
				match(AnyText);
				}
				break;
			}
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(148);
				match(LessThanSymbol);
				setState(149);
				match(ForwardSlashSymbol);
				setState(150);
				match(T__0);
				setState(151);
				match(GreaterThanSymbol);
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

	public static class CodeContext extends ParserRuleContext {
		public List<TerminalNode> LessThanSymbol() { return getTokens(wiki_markupParser.LessThanSymbol); }
		public TerminalNode LessThanSymbol(int i) {
			return getToken(wiki_markupParser.LessThanSymbol, i);
		}
		public List<TerminalNode> GreaterThanSymbol() { return getTokens(wiki_markupParser.GreaterThanSymbol); }
		public TerminalNode GreaterThanSymbol(int i) {
			return getToken(wiki_markupParser.GreaterThanSymbol, i);
		}
		public TerminalNode ForwardSlashSymbol() { return getToken(wiki_markupParser.ForwardSlashSymbol, 0); }
		public TerminalNode AnyText() { return getToken(wiki_markupParser.AnyText, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LessThanSymbol);
			setState(155);
			match(T__1);
			setState(156);
			match(GreaterThanSymbol);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnyText) {
				{
				setState(157);
				match(AnyText);
				}
			}

			setState(160);
			match(LessThanSymbol);
			setState(161);
			match(ForwardSlashSymbol);
			setState(162);
			match(T__1);
			setState(163);
			match(GreaterThanSymbol);
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

	public static class SyntaxhighlightContext extends ParserRuleContext {
		public List<TerminalNode> LessThanSymbol() { return getTokens(wiki_markupParser.LessThanSymbol); }
		public TerminalNode LessThanSymbol(int i) {
			return getToken(wiki_markupParser.LessThanSymbol, i);
		}
		public List<TerminalNode> GreaterThanSymbol() { return getTokens(wiki_markupParser.GreaterThanSymbol); }
		public TerminalNode GreaterThanSymbol(int i) {
			return getToken(wiki_markupParser.GreaterThanSymbol, i);
		}
		public TerminalNode ForwardSlashSymbol() { return getToken(wiki_markupParser.ForwardSlashSymbol, 0); }
		public TerminalNode AnyText() { return getToken(wiki_markupParser.AnyText, 0); }
		public SyntaxhighlightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxhighlight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterSyntaxhighlight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitSyntaxhighlight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitSyntaxhighlight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxhighlightContext syntaxhighlight() throws RecognitionException {
		SyntaxhighlightContext _localctx = new SyntaxhighlightContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_syntaxhighlight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(LessThanSymbol);
			setState(166);
			match(T__2);
			setState(167);
			match(GreaterThanSymbol);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnyText) {
				{
				setState(168);
				match(AnyText);
				}
			}

			setState(171);
			match(LessThanSymbol);
			setState(172);
			match(ForwardSlashSymbol);
			setState(173);
			match(T__2);
			setState(174);
			match(GreaterThanSymbol);
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

	public static class PreContext extends ParserRuleContext {
		public List<TerminalNode> LessThanSymbol() { return getTokens(wiki_markupParser.LessThanSymbol); }
		public TerminalNode LessThanSymbol(int i) {
			return getToken(wiki_markupParser.LessThanSymbol, i);
		}
		public List<TerminalNode> GreaterThanSymbol() { return getTokens(wiki_markupParser.GreaterThanSymbol); }
		public TerminalNode GreaterThanSymbol(int i) {
			return getToken(wiki_markupParser.GreaterThanSymbol, i);
		}
		public TerminalNode ForwardSlashSymbol() { return getToken(wiki_markupParser.ForwardSlashSymbol, 0); }
		public TerminalNode AnyText() { return getToken(wiki_markupParser.AnyText, 0); }
		public PreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitPre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreContext pre() throws RecognitionException {
		PreContext _localctx = new PreContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(LessThanSymbol);
			setState(177);
			match(T__3);
			setState(178);
			match(GreaterThanSymbol);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnyText) {
				{
				setState(179);
				match(AnyText);
				}
			}

			setState(182);
			match(LessThanSymbol);
			setState(183);
			match(ForwardSlashSymbol);
			setState(184);
			match(T__3);
			setState(185);
			match(GreaterThanSymbol);
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

	public static class RefContext extends ParserRuleContext {
		public List<TerminalNode> GreaterThanSymbol() { return getTokens(wiki_markupParser.GreaterThanSymbol); }
		public TerminalNode GreaterThanSymbol(int i) {
			return getToken(wiki_markupParser.GreaterThanSymbol, i);
		}
		public Ref_nameContext ref_name() {
			return getRuleContext(Ref_nameContext.class,0);
		}
		public List<TerminalNode> ForwardSlashSymbol() { return getTokens(wiki_markupParser.ForwardSlashSymbol); }
		public TerminalNode ForwardSlashSymbol(int i) {
			return getToken(wiki_markupParser.ForwardSlashSymbol, i);
		}
		public TerminalNode LessThanSymbol() { return getToken(wiki_markupParser.LessThanSymbol, 0); }
		public Ref_contentContext ref_content() {
			return getRuleContext(Ref_contentContext.class,0);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__4);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6 || _la==T__7) {
				{
				setState(188);
				ref_name();
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ForwardSlashSymbol) {
				{
				setState(191);
				match(ForwardSlashSymbol);
				}
			}

			setState(194);
			match(GreaterThanSymbol);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(195);
					ref_content();
					}
					break;
				}
				setState(198);
				match(LessThanSymbol);
				setState(199);
				match(ForwardSlashSymbol);
				setState(200);
				match(T__5);
				setState(201);
				match(GreaterThanSymbol);
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

	public static class Ref_nameContext extends ParserRuleContext {
		public List<TerminalNode> QuoteSymbol() { return getTokens(wiki_markupParser.QuoteSymbol); }
		public TerminalNode QuoteSymbol(int i) {
			return getToken(wiki_markupParser.QuoteSymbol, i);
		}
		public List<TerminalNode> BackSlashSymbol() { return getTokens(wiki_markupParser.BackSlashSymbol); }
		public TerminalNode BackSlashSymbol(int i) {
			return getToken(wiki_markupParser.BackSlashSymbol, i);
		}
		public List<TerminalNode> AnyText() { return getTokens(wiki_markupParser.AnyText); }
		public TerminalNode AnyText(int i) {
			return getToken(wiki_markupParser.AnyText, i);
		}
		public List<TerminalNode> DashSymbol() { return getTokens(wiki_markupParser.DashSymbol); }
		public TerminalNode DashSymbol(int i) {
			return getToken(wiki_markupParser.DashSymbol, i);
		}
		public List<TerminalNode> HyphenSymbol() { return getTokens(wiki_markupParser.HyphenSymbol); }
		public TerminalNode HyphenSymbol(int i) {
			return getToken(wiki_markupParser.HyphenSymbol, i);
		}
		public List<TerminalNode> DotSymbol() { return getTokens(wiki_markupParser.DotSymbol); }
		public TerminalNode DotSymbol(int i) {
			return getToken(wiki_markupParser.DotSymbol, i);
		}
		public Ref_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterRef_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitRef_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitRef_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_nameContext ref_name() throws RecognitionException {
		Ref_nameContext _localctx = new Ref_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ref_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(205);
			match(T__8);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					_la = _input.LA(1);
					if ( !(_la==BackSlashSymbol || _la==QuoteSymbol) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AnyText) | (1L << BackSlashSymbol) | (1L << DashSymbol) | (1L << DotSymbol) | (1L << HyphenSymbol))) != 0)) {
				{
				{
				setState(212);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AnyText) | (1L << BackSlashSymbol) | (1L << DashSymbol) | (1L << DotSymbol) | (1L << HyphenSymbol))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuoteSymbol) {
				{
				setState(218);
				match(QuoteSymbol);
				}
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

	public static class Ref_contentContext extends ParserRuleContext {
		public List<Elements_markupContext> elements_markup() {
			return getRuleContexts(Elements_markupContext.class);
		}
		public Elements_markupContext elements_markup(int i) {
			return getRuleContext(Elements_markupContext.class,i);
		}
		public Ref_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterRef_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitRef_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitRef_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_contentContext ref_content() throws RecognitionException {
		Ref_contentContext _localctx = new Ref_contentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ref_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(221);
					elements_markup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Other_tagsContext extends ParserRuleContext {
		public List<TerminalNode> LessThanSymbol() { return getTokens(wiki_markupParser.LessThanSymbol); }
		public TerminalNode LessThanSymbol(int i) {
			return getToken(wiki_markupParser.LessThanSymbol, i);
		}
		public List<TerminalNode> AnyText() { return getTokens(wiki_markupParser.AnyText); }
		public TerminalNode AnyText(int i) {
			return getToken(wiki_markupParser.AnyText, i);
		}
		public List<TerminalNode> GreaterThanSymbol() { return getTokens(wiki_markupParser.GreaterThanSymbol); }
		public TerminalNode GreaterThanSymbol(int i) {
			return getToken(wiki_markupParser.GreaterThanSymbol, i);
		}
		public List<TerminalNode> ForwardSlashSymbol() { return getTokens(wiki_markupParser.ForwardSlashSymbol); }
		public TerminalNode ForwardSlashSymbol(int i) {
			return getToken(wiki_markupParser.ForwardSlashSymbol, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<Content_other_tagsContext> content_other_tags() {
			return getRuleContexts(Content_other_tagsContext.class);
		}
		public Content_other_tagsContext content_other_tags(int i) {
			return getRuleContext(Content_other_tagsContext.class,i);
		}
		public Other_tagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterOther_tags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitOther_tags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitOther_tags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_tagsContext other_tags() throws RecognitionException {
		Other_tagsContext _localctx = new Other_tagsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_other_tags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(LessThanSymbol);
			setState(227);
			match(AnyText);
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ForwardSlashSymbol:
				{
				setState(228);
				match(ForwardSlashSymbol);
				}
				break;
			case T__8:
				{
				setState(229);
				assignment();
				}
				break;
			case GreaterThanSymbol:
				break;
			default:
				break;
			}
			setState(232);
			match(GreaterThanSymbol);
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AnyText) | (1L << ApostropheSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DotSymbol) | (1L << HyphenSymbol) | (1L << LeftCurlyBrace) | (1L << LeftSquareBracketSymbol) | (1L << OpenParenthesisSymbol) | (1L << SemicolonSymbol))) != 0)) {
					{
					{
					setState(233);
					content_other_tags();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(LessThanSymbol);
				setState(240);
				match(ForwardSlashSymbol);
				setState(241);
				match(AnyText);
				setState(242);
				match(GreaterThanSymbol);
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

	public static class Content_other_tagsContext extends ParserRuleContext {
		public TerminalNode AnyText() { return getToken(wiki_markupParser.AnyText, 0); }
		public TerminalNode ApostropheSymbol() { return getToken(wiki_markupParser.ApostropheSymbol, 0); }
		public TerminalNode SemicolonSymbol() { return getToken(wiki_markupParser.SemicolonSymbol, 0); }
		public TerminalNode DashSymbol() { return getToken(wiki_markupParser.DashSymbol, 0); }
		public TerminalNode HyphenSymbol() { return getToken(wiki_markupParser.HyphenSymbol, 0); }
		public TerminalNode ColonSymbol() { return getToken(wiki_markupParser.ColonSymbol, 0); }
		public TerminalNode CommaSymbol() { return getToken(wiki_markupParser.CommaSymbol, 0); }
		public TerminalNode DotSymbol() { return getToken(wiki_markupParser.DotSymbol, 0); }
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Url_or_emailContext url_or_email() {
			return getRuleContext(Url_or_emailContext.class,0);
		}
		public Ignore_elementContext ignore_element() {
			return getRuleContext(Ignore_elementContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public Content_other_tagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content_other_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterContent_other_tags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitContent_other_tags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitContent_other_tags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Content_other_tagsContext content_other_tags() throws RecognitionException {
		Content_other_tagsContext _localctx = new Content_other_tagsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_content_other_tags);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(AnyText);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(ApostropheSymbol);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(SemicolonSymbol);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(DashSymbol);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(HyphenSymbol);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(ColonSymbol);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				match(CommaSymbol);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				match(DotSymbol);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				link();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				url_or_email();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(255);
				ignore_element();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(256);
				template();
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

	public static class TemplateContext extends ParserRuleContext {
		public List<TerminalNode> LeftCurlyBrace() { return getTokens(wiki_markupParser.LeftCurlyBrace); }
		public TerminalNode LeftCurlyBrace(int i) {
			return getToken(wiki_markupParser.LeftCurlyBrace, i);
		}
		public List<TerminalNode> RightCurlyBrace() { return getTokens(wiki_markupParser.RightCurlyBrace); }
		public TerminalNode RightCurlyBrace(int i) {
			return getToken(wiki_markupParser.RightCurlyBrace, i);
		}
		public List<Template_elementContext> template_element() {
			return getRuleContexts(Template_elementContext.class);
		}
		public Template_elementContext template_element(int i) {
			return getRuleContext(Template_elementContext.class,i);
		}
		public List<TerminalNode> PipeSimbol() { return getTokens(wiki_markupParser.PipeSimbol); }
		public TerminalNode PipeSimbol(int i) {
			return getToken(wiki_markupParser.PipeSimbol, i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(LeftCurlyBrace);
			setState(260);
			match(LeftCurlyBrace);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << AnyText) | (1L << ApostropheSymbol) | (1L << BackSlashSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DotSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << LeftSquareBracketSymbol) | (1L << LessThanSymbol) | (1L << OpenParenthesisSymbol) | (1L << PercentSymbol) | (1L << QuoteSymbol) | (1L << SharpSymbol) | (1L << TildeSymbol))) != 0)) {
				{
				setState(261);
				template_element();
				}
			}

			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PipeSimbol) {
				{
				{
				setState(264);
				match(PipeSimbol);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << AnyText) | (1L << ApostropheSymbol) | (1L << BackSlashSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DotSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << LeftSquareBracketSymbol) | (1L << LessThanSymbol) | (1L << OpenParenthesisSymbol) | (1L << PercentSymbol) | (1L << QuoteSymbol) | (1L << SharpSymbol) | (1L << TildeSymbol))) != 0)) {
					{
					setState(265);
					template_element();
					}
				}

				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(RightCurlyBrace);
			setState(274);
			match(RightCurlyBrace);
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

	public static class Template_elementContext extends ParserRuleContext {
		public List<TerminalNode> AnyText() { return getTokens(wiki_markupParser.AnyText); }
		public TerminalNode AnyText(int i) {
			return getToken(wiki_markupParser.AnyText, i);
		}
		public List<TerminalNode> ApostropheSymbol() { return getTokens(wiki_markupParser.ApostropheSymbol); }
		public TerminalNode ApostropheSymbol(int i) {
			return getToken(wiki_markupParser.ApostropheSymbol, i);
		}
		public List<TerminalNode> CommaSymbol() { return getTokens(wiki_markupParser.CommaSymbol); }
		public TerminalNode CommaSymbol(int i) {
			return getToken(wiki_markupParser.CommaSymbol, i);
		}
		public List<TerminalNode> ColonSymbol() { return getTokens(wiki_markupParser.ColonSymbol); }
		public TerminalNode ColonSymbol(int i) {
			return getToken(wiki_markupParser.ColonSymbol, i);
		}
		public List<TerminalNode> ForwardSlashSymbol() { return getTokens(wiki_markupParser.ForwardSlashSymbol); }
		public TerminalNode ForwardSlashSymbol(int i) {
			return getToken(wiki_markupParser.ForwardSlashSymbol, i);
		}
		public List<TerminalNode> HyphenSymbol() { return getTokens(wiki_markupParser.HyphenSymbol); }
		public TerminalNode HyphenSymbol(int i) {
			return getToken(wiki_markupParser.HyphenSymbol, i);
		}
		public List<TerminalNode> SharpSymbol() { return getTokens(wiki_markupParser.SharpSymbol); }
		public TerminalNode SharpSymbol(int i) {
			return getToken(wiki_markupParser.SharpSymbol, i);
		}
		public List<TerminalNode> QuoteSymbol() { return getTokens(wiki_markupParser.QuoteSymbol); }
		public TerminalNode QuoteSymbol(int i) {
			return getToken(wiki_markupParser.QuoteSymbol, i);
		}
		public List<TerminalNode> DashSymbol() { return getTokens(wiki_markupParser.DashSymbol); }
		public TerminalNode DashSymbol(int i) {
			return getToken(wiki_markupParser.DashSymbol, i);
		}
		public List<TerminalNode> BackSlashSymbol() { return getTokens(wiki_markupParser.BackSlashSymbol); }
		public TerminalNode BackSlashSymbol(int i) {
			return getToken(wiki_markupParser.BackSlashSymbol, i);
		}
		public List<TerminalNode> DotSymbol() { return getTokens(wiki_markupParser.DotSymbol); }
		public TerminalNode DotSymbol(int i) {
			return getToken(wiki_markupParser.DotSymbol, i);
		}
		public List<TerminalNode> TildeSymbol() { return getTokens(wiki_markupParser.TildeSymbol); }
		public TerminalNode TildeSymbol(int i) {
			return getToken(wiki_markupParser.TildeSymbol, i);
		}
		public List<TerminalNode> PercentSymbol() { return getTokens(wiki_markupParser.PercentSymbol); }
		public TerminalNode PercentSymbol(int i) {
			return getToken(wiki_markupParser.PercentSymbol, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<Ignore_elementContext> ignore_element() {
			return getRuleContexts(Ignore_elementContext.class);
		}
		public Ignore_elementContext ignore_element(int i) {
			return getRuleContext(Ignore_elementContext.class,i);
		}
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public Template_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterTemplate_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitTemplate_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitTemplate_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_elementContext template_element() throws RecognitionException {
		Template_elementContext _localctx = new Template_elementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_template_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AnyText:
					{
					setState(276);
					match(AnyText);
					}
					break;
				case ApostropheSymbol:
					{
					setState(277);
					match(ApostropheSymbol);
					}
					break;
				case CommaSymbol:
					{
					setState(278);
					match(CommaSymbol);
					}
					break;
				case ColonSymbol:
					{
					setState(279);
					match(ColonSymbol);
					}
					break;
				case ForwardSlashSymbol:
					{
					setState(280);
					match(ForwardSlashSymbol);
					}
					break;
				case HyphenSymbol:
					{
					setState(281);
					match(HyphenSymbol);
					}
					break;
				case SharpSymbol:
					{
					setState(282);
					match(SharpSymbol);
					}
					break;
				case QuoteSymbol:
					{
					setState(283);
					match(QuoteSymbol);
					}
					break;
				case DashSymbol:
					{
					setState(284);
					match(DashSymbol);
					}
					break;
				case BackSlashSymbol:
					{
					setState(285);
					match(BackSlashSymbol);
					}
					break;
				case DotSymbol:
					{
					setState(286);
					match(DotSymbol);
					}
					break;
				case TildeSymbol:
					{
					setState(287);
					match(TildeSymbol);
					}
					break;
				case PercentSymbol:
					{
					setState(288);
					match(PercentSymbol);
					}
					break;
				case T__8:
					{
					setState(289);
					assignment();
					}
					break;
				case OpenParenthesisSymbol:
					{
					setState(290);
					ignore_element();
					}
					break;
				case T__4:
				case LessThanSymbol:
					{
					setState(291);
					tags();
					}
					break;
				case LeftSquareBracketSymbol:
					{
					setState(292);
					link();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << AnyText) | (1L << ApostropheSymbol) | (1L << BackSlashSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DotSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << LeftSquareBracketSymbol) | (1L << LessThanSymbol) | (1L << OpenParenthesisSymbol) | (1L << PercentSymbol) | (1L << QuoteSymbol) | (1L << SharpSymbol) | (1L << TildeSymbol))) != 0) );
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

	public static class Ignore_elementContext extends ParserRuleContext {
		public TerminalNode OpenParenthesisSymbol() { return getToken(wiki_markupParser.OpenParenthesisSymbol, 0); }
		public TerminalNode CloseParenthesisSymbol() { return getToken(wiki_markupParser.CloseParenthesisSymbol, 0); }
		public Ignore_contentContext ignore_content() {
			return getRuleContext(Ignore_contentContext.class,0);
		}
		public Ignore_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterIgnore_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitIgnore_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitIgnore_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ignore_elementContext ignore_element() throws RecognitionException {
		Ignore_elementContext _localctx = new Ignore_elementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ignore_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(OpenParenthesisSymbol);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << AnyText) | (1L << H1) | (1L << H2) | (1L << H3) | (1L << H4) | (1L << H5) | (1L << H6) | (1L << AmpersandSymbol) | (1L << ApostropheSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DollarSymbol) | (1L << DotSymbol) | (1L << ExclamationMarkSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << LeftCurlyBrace) | (1L << LeftSquareBracketSymbol) | (1L << LessThanSymbol) | (1L << NumSymbol) | (1L << OpenParenthesisSymbol) | (1L << PlusSymbol) | (1L << QuoteSymbol) | (1L << QuestionSymbol) | (1L << SemicolonSymbol) | (1L << SharpSymbol) | (1L << StarSymbol))) != 0)) {
				{
				setState(298);
				ignore_content();
				}
			}

			setState(301);
			match(CloseParenthesisSymbol);
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

	public static class Ignore_contentContext extends ParserRuleContext {
		public List<Elements_markupContext> elements_markup() {
			return getRuleContexts(Elements_markupContext.class);
		}
		public Elements_markupContext elements_markup(int i) {
			return getRuleContext(Elements_markupContext.class,i);
		}
		public Ignore_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterIgnore_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitIgnore_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitIgnore_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ignore_contentContext ignore_content() throws RecognitionException {
		Ignore_contentContext _localctx = new Ignore_contentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ignore_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				elements_markup();
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << AnyText) | (1L << H1) | (1L << H2) | (1L << H3) | (1L << H4) | (1L << H5) | (1L << H6) | (1L << AmpersandSymbol) | (1L << ApostropheSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DollarSymbol) | (1L << DotSymbol) | (1L << ExclamationMarkSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << LeftCurlyBrace) | (1L << LeftSquareBracketSymbol) | (1L << LessThanSymbol) | (1L << NumSymbol) | (1L << OpenParenthesisSymbol) | (1L << PlusSymbol) | (1L << QuoteSymbol) | (1L << QuestionSymbol) | (1L << SemicolonSymbol) | (1L << SharpSymbol) | (1L << StarSymbol))) != 0) );
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode LeftCurlyBrace() { return getToken(wiki_markupParser.LeftCurlyBrace, 0); }
		public TerminalNode RightCurlyBrace() { return getToken(wiki_markupParser.RightCurlyBrace, 0); }
		public List<TerminalNode> PipeSimbol() { return getTokens(wiki_markupParser.PipeSimbol); }
		public TerminalNode PipeSimbol(int i) {
			return getToken(wiki_markupParser.PipeSimbol, i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(LeftCurlyBrace);
			setState(309);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==PipeSimbol) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(310);
					matchWildcard();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==PipeSimbol) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(317);
			match(RightCurlyBrace);
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

	public static class LinkContext extends ParserRuleContext {
		public List<TerminalNode> LeftSquareBracketSymbol() { return getTokens(wiki_markupParser.LeftSquareBracketSymbol); }
		public TerminalNode LeftSquareBracketSymbol(int i) {
			return getToken(wiki_markupParser.LeftSquareBracketSymbol, i);
		}
		public List<TerminalNode> RightSquareBracketSymbol() { return getTokens(wiki_markupParser.RightSquareBracketSymbol); }
		public TerminalNode RightSquareBracketSymbol(int i) {
			return getToken(wiki_markupParser.RightSquareBracketSymbol, i);
		}
		public List<Link_elementContext> link_element() {
			return getRuleContexts(Link_elementContext.class);
		}
		public Link_elementContext link_element(int i) {
			return getRuleContext(Link_elementContext.class,i);
		}
		public List<TerminalNode> PipeSimbol() { return getTokens(wiki_markupParser.PipeSimbol); }
		public TerminalNode PipeSimbol(int i) {
			return getToken(wiki_markupParser.PipeSimbol, i);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(LeftSquareBracketSymbol);
			setState(320);
			match(LeftSquareBracketSymbol);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << AnyText) | (1L << H1) | (1L << H2) | (1L << H3) | (1L << H4) | (1L << H5) | (1L << H6) | (1L << AmpersandSymbol) | (1L << ApostropheSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DollarSymbol) | (1L << DotSymbol) | (1L << ExclamationMarkSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << LeftCurlyBrace) | (1L << LeftSquareBracketSymbol) | (1L << LessThanSymbol) | (1L << NumSymbol) | (1L << OpenParenthesisSymbol) | (1L << PlusSymbol) | (1L << QuoteSymbol) | (1L << QuestionSymbol) | (1L << SemicolonSymbol) | (1L << SharpSymbol) | (1L << StarSymbol))) != 0)) {
				{
				setState(321);
				link_element();
				}
			}

			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PipeSimbol) {
				{
				{
				setState(324);
				match(PipeSimbol);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << AnyText) | (1L << H1) | (1L << H2) | (1L << H3) | (1L << H4) | (1L << H5) | (1L << H6) | (1L << AmpersandSymbol) | (1L << ApostropheSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DollarSymbol) | (1L << DotSymbol) | (1L << ExclamationMarkSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << LeftCurlyBrace) | (1L << LeftSquareBracketSymbol) | (1L << LessThanSymbol) | (1L << NumSymbol) | (1L << OpenParenthesisSymbol) | (1L << PlusSymbol) | (1L << QuoteSymbol) | (1L << QuestionSymbol) | (1L << SemicolonSymbol) | (1L << SharpSymbol) | (1L << StarSymbol))) != 0)) {
					{
					setState(325);
					link_element();
					}
				}

				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			match(RightSquareBracketSymbol);
			setState(334);
			match(RightSquareBracketSymbol);
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

	public static class Link_elementContext extends ParserRuleContext {
		public List<Elements_markupContext> elements_markup() {
			return getRuleContexts(Elements_markupContext.class);
		}
		public Elements_markupContext elements_markup(int i) {
			return getRuleContext(Elements_markupContext.class,i);
		}
		public Link_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterLink_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitLink_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitLink_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_elementContext link_element() throws RecognitionException {
		Link_elementContext _localctx = new Link_elementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_link_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(336);
				elements_markup();
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << AnyText) | (1L << H1) | (1L << H2) | (1L << H3) | (1L << H4) | (1L << H5) | (1L << H6) | (1L << AmpersandSymbol) | (1L << ApostropheSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DollarSymbol) | (1L << DotSymbol) | (1L << ExclamationMarkSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << LeftCurlyBrace) | (1L << LeftSquareBracketSymbol) | (1L << LessThanSymbol) | (1L << NumSymbol) | (1L << OpenParenthesisSymbol) | (1L << PlusSymbol) | (1L << QuoteSymbol) | (1L << QuestionSymbol) | (1L << SemicolonSymbol) | (1L << SharpSymbol) | (1L << StarSymbol))) != 0) );
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

	public static class Url_or_emailContext extends ParserRuleContext {
		public TerminalNode LeftSquareBracketSymbol() { return getToken(wiki_markupParser.LeftSquareBracketSymbol, 0); }
		public TerminalNode RightSquareBracketSymbol() { return getToken(wiki_markupParser.RightSquareBracketSymbol, 0); }
		public Content_url_or_emailContext content_url_or_email() {
			return getRuleContext(Content_url_or_emailContext.class,0);
		}
		public Url_or_emailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url_or_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterUrl_or_email(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitUrl_or_email(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitUrl_or_email(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Url_or_emailContext url_or_email() throws RecognitionException {
		Url_or_emailContext _localctx = new Url_or_emailContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_url_or_email);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(LeftSquareBracketSymbol);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << AnyText) | (1L << AmpersandSymbol) | (1L << ApostropheSymbol) | (1L << AtEmailSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DotSymbol) | (1L << ExclamationMarkSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << NumSymbol) | (1L << OpenParenthesisSymbol) | (1L << PercentSymbol) | (1L << PlusSymbol) | (1L << QuoteSymbol) | (1L << QuestionSymbol) | (1L << SemicolonSymbol) | (1L << SharpSymbol))) != 0)) {
				{
				setState(342);
				content_url_or_email();
				}
			}

			setState(345);
			match(RightSquareBracketSymbol);
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

	public static class Content_url_or_emailContext extends ParserRuleContext {
		public List<TerminalNode> AnyText() { return getTokens(wiki_markupParser.AnyText); }
		public TerminalNode AnyText(int i) {
			return getToken(wiki_markupParser.AnyText, i);
		}
		public List<TerminalNode> SharpSymbol() { return getTokens(wiki_markupParser.SharpSymbol); }
		public TerminalNode SharpSymbol(int i) {
			return getToken(wiki_markupParser.SharpSymbol, i);
		}
		public List<TerminalNode> QuoteSymbol() { return getTokens(wiki_markupParser.QuoteSymbol); }
		public TerminalNode QuoteSymbol(int i) {
			return getToken(wiki_markupParser.QuoteSymbol, i);
		}
		public List<TerminalNode> ColonSymbol() { return getTokens(wiki_markupParser.ColonSymbol); }
		public TerminalNode ColonSymbol(int i) {
			return getToken(wiki_markupParser.ColonSymbol, i);
		}
		public List<TerminalNode> DotSymbol() { return getTokens(wiki_markupParser.DotSymbol); }
		public TerminalNode DotSymbol(int i) {
			return getToken(wiki_markupParser.DotSymbol, i);
		}
		public List<TerminalNode> NumSymbol() { return getTokens(wiki_markupParser.NumSymbol); }
		public TerminalNode NumSymbol(int i) {
			return getToken(wiki_markupParser.NumSymbol, i);
		}
		public List<TerminalNode> ForwardSlashSymbol() { return getTokens(wiki_markupParser.ForwardSlashSymbol); }
		public TerminalNode ForwardSlashSymbol(int i) {
			return getToken(wiki_markupParser.ForwardSlashSymbol, i);
		}
		public List<TerminalNode> PercentSymbol() { return getTokens(wiki_markupParser.PercentSymbol); }
		public TerminalNode PercentSymbol(int i) {
			return getToken(wiki_markupParser.PercentSymbol, i);
		}
		public List<TerminalNode> ExclamationMarkSymbol() { return getTokens(wiki_markupParser.ExclamationMarkSymbol); }
		public TerminalNode ExclamationMarkSymbol(int i) {
			return getToken(wiki_markupParser.ExclamationMarkSymbol, i);
		}
		public List<TerminalNode> PlusSymbol() { return getTokens(wiki_markupParser.PlusSymbol); }
		public TerminalNode PlusSymbol(int i) {
			return getToken(wiki_markupParser.PlusSymbol, i);
		}
		public List<TerminalNode> AmpersandSymbol() { return getTokens(wiki_markupParser.AmpersandSymbol); }
		public TerminalNode AmpersandSymbol(int i) {
			return getToken(wiki_markupParser.AmpersandSymbol, i);
		}
		public List<TerminalNode> AtEmailSymbol() { return getTokens(wiki_markupParser.AtEmailSymbol); }
		public TerminalNode AtEmailSymbol(int i) {
			return getToken(wiki_markupParser.AtEmailSymbol, i);
		}
		public List<TerminalNode> QuestionSymbol() { return getTokens(wiki_markupParser.QuestionSymbol); }
		public TerminalNode QuestionSymbol(int i) {
			return getToken(wiki_markupParser.QuestionSymbol, i);
		}
		public List<TerminalNode> DashSymbol() { return getTokens(wiki_markupParser.DashSymbol); }
		public TerminalNode DashSymbol(int i) {
			return getToken(wiki_markupParser.DashSymbol, i);
		}
		public List<TerminalNode> SemicolonSymbol() { return getTokens(wiki_markupParser.SemicolonSymbol); }
		public TerminalNode SemicolonSymbol(int i) {
			return getToken(wiki_markupParser.SemicolonSymbol, i);
		}
		public List<TerminalNode> HyphenSymbol() { return getTokens(wiki_markupParser.HyphenSymbol); }
		public TerminalNode HyphenSymbol(int i) {
			return getToken(wiki_markupParser.HyphenSymbol, i);
		}
		public List<TerminalNode> ApostropheSymbol() { return getTokens(wiki_markupParser.ApostropheSymbol); }
		public TerminalNode ApostropheSymbol(int i) {
			return getToken(wiki_markupParser.ApostropheSymbol, i);
		}
		public List<TerminalNode> CommaSymbol() { return getTokens(wiki_markupParser.CommaSymbol); }
		public TerminalNode CommaSymbol(int i) {
			return getToken(wiki_markupParser.CommaSymbol, i);
		}
		public List<AccentuationContext> accentuation() {
			return getRuleContexts(AccentuationContext.class);
		}
		public AccentuationContext accentuation(int i) {
			return getRuleContext(AccentuationContext.class,i);
		}
		public List<Ignore_elementContext> ignore_element() {
			return getRuleContexts(Ignore_elementContext.class);
		}
		public Ignore_elementContext ignore_element(int i) {
			return getRuleContext(Ignore_elementContext.class,i);
		}
		public Content_url_or_emailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content_url_or_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterContent_url_or_email(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitContent_url_or_email(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitContent_url_or_email(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Content_url_or_emailContext content_url_or_email() throws RecognitionException {
		Content_url_or_emailContext _localctx = new Content_url_or_emailContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_content_url_or_email);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(347);
					match(AnyText);
					}
					break;
				case 2:
					{
					setState(348);
					match(SharpSymbol);
					}
					break;
				case 3:
					{
					setState(349);
					match(QuoteSymbol);
					}
					break;
				case 4:
					{
					setState(350);
					match(ColonSymbol);
					}
					break;
				case 5:
					{
					setState(351);
					match(DotSymbol);
					}
					break;
				case 6:
					{
					setState(352);
					match(NumSymbol);
					}
					break;
				case 7:
					{
					setState(353);
					match(ForwardSlashSymbol);
					}
					break;
				case 8:
					{
					setState(354);
					match(T__8);
					}
					break;
				case 9:
					{
					setState(355);
					match(PercentSymbol);
					}
					break;
				case 10:
					{
					setState(356);
					match(ExclamationMarkSymbol);
					}
					break;
				case 11:
					{
					setState(357);
					match(PlusSymbol);
					}
					break;
				case 12:
					{
					setState(358);
					match(AmpersandSymbol);
					}
					break;
				case 13:
					{
					setState(359);
					match(AtEmailSymbol);
					}
					break;
				case 14:
					{
					setState(360);
					match(QuestionSymbol);
					}
					break;
				case 15:
					{
					setState(361);
					match(DashSymbol);
					}
					break;
				case 16:
					{
					setState(362);
					match(SemicolonSymbol);
					}
					break;
				case 17:
					{
					setState(363);
					match(HyphenSymbol);
					}
					break;
				case 18:
					{
					setState(364);
					match(ApostropheSymbol);
					}
					break;
				case 19:
					{
					setState(365);
					match(CommaSymbol);
					}
					break;
				case 20:
					{
					setState(366);
					accentuation();
					}
					break;
				case 21:
					{
					setState(367);
					ignore_element();
					}
					break;
				}
				}
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << AnyText) | (1L << AmpersandSymbol) | (1L << ApostropheSymbol) | (1L << AtEmailSymbol) | (1L << ColonSymbol) | (1L << CommaSymbol) | (1L << DashSymbol) | (1L << DotSymbol) | (1L << ExclamationMarkSymbol) | (1L << ForwardSlashSymbol) | (1L << HyphenSymbol) | (1L << NumSymbol) | (1L << OpenParenthesisSymbol) | (1L << PercentSymbol) | (1L << PlusSymbol) | (1L << QuoteSymbol) | (1L << QuestionSymbol) | (1L << SemicolonSymbol) | (1L << SharpSymbol))) != 0) );
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

	public static class ListContext extends ParserRuleContext {
		public List<List_elementContext> list_element() {
			return getRuleContexts(List_elementContext.class);
		}
		public List_elementContext list_element(int i) {
			return getRuleContext(List_elementContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(372);
					list_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(375); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class List_elementContext extends ParserRuleContext {
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<Url_or_emailContext> url_or_email() {
			return getRuleContexts(Url_or_emailContext.class);
		}
		public Url_or_emailContext url_or_email(int i) {
			return getRuleContext(Url_or_emailContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<HeadersContext> headers() {
			return getRuleContexts(HeadersContext.class);
		}
		public HeadersContext headers(int i) {
			return getRuleContext(HeadersContext.class,i);
		}
		public List<AccentuationContext> accentuation() {
			return getRuleContexts(AccentuationContext.class);
		}
		public AccentuationContext accentuation(int i) {
			return getRuleContext(AccentuationContext.class,i);
		}
		public List<Ignore_elementContext> ignore_element() {
			return getRuleContexts(Ignore_elementContext.class);
		}
		public Ignore_elementContext ignore_element(int i) {
			return getRuleContext(Ignore_elementContext.class,i);
		}
		public List<TerminalNode> AnyText() { return getTokens(wiki_markupParser.AnyText); }
		public TerminalNode AnyText(int i) {
			return getToken(wiki_markupParser.AnyText, i);
		}
		public List<TerminalNode> CommaSymbol() { return getTokens(wiki_markupParser.CommaSymbol); }
		public TerminalNode CommaSymbol(int i) {
			return getToken(wiki_markupParser.CommaSymbol, i);
		}
		public List<TerminalNode> SemicolonSymbol() { return getTokens(wiki_markupParser.SemicolonSymbol); }
		public TerminalNode SemicolonSymbol(int i) {
			return getToken(wiki_markupParser.SemicolonSymbol, i);
		}
		public List<TerminalNode> AmpersandSymbol() { return getTokens(wiki_markupParser.AmpersandSymbol); }
		public TerminalNode AmpersandSymbol(int i) {
			return getToken(wiki_markupParser.AmpersandSymbol, i);
		}
		public List<TerminalNode> DashSymbol() { return getTokens(wiki_markupParser.DashSymbol); }
		public TerminalNode DashSymbol(int i) {
			return getToken(wiki_markupParser.DashSymbol, i);
		}
		public List<TerminalNode> HyphenSymbol() { return getTokens(wiki_markupParser.HyphenSymbol); }
		public TerminalNode HyphenSymbol(int i) {
			return getToken(wiki_markupParser.HyphenSymbol, i);
		}
		public List<TerminalNode> DotSymbol() { return getTokens(wiki_markupParser.DotSymbol); }
		public TerminalNode DotSymbol(int i) {
			return getToken(wiki_markupParser.DotSymbol, i);
		}
		public List<TerminalNode> ApostropheSymbol() { return getTokens(wiki_markupParser.ApostropheSymbol); }
		public TerminalNode ApostropheSymbol(int i) {
			return getToken(wiki_markupParser.ApostropheSymbol, i);
		}
		public List<TerminalNode> ColonSymbol() { return getTokens(wiki_markupParser.ColonSymbol); }
		public TerminalNode ColonSymbol(int i) {
			return getToken(wiki_markupParser.ColonSymbol, i);
		}
		public List<TerminalNode> QuoteSymbol() { return getTokens(wiki_markupParser.QuoteSymbol); }
		public TerminalNode QuoteSymbol(int i) {
			return getToken(wiki_markupParser.QuoteSymbol, i);
		}
		public List<TerminalNode> ForwardSlashSymbol() { return getTokens(wiki_markupParser.ForwardSlashSymbol); }
		public TerminalNode ForwardSlashSymbol(int i) {
			return getToken(wiki_markupParser.ForwardSlashSymbol, i);
		}
		public List<TerminalNode> ExclamationMarkSymbol() { return getTokens(wiki_markupParser.ExclamationMarkSymbol); }
		public TerminalNode ExclamationMarkSymbol(int i) {
			return getToken(wiki_markupParser.ExclamationMarkSymbol, i);
		}
		public List<TerminalNode> DollarSymbol() { return getTokens(wiki_markupParser.DollarSymbol); }
		public TerminalNode DollarSymbol(int i) {
			return getToken(wiki_markupParser.DollarSymbol, i);
		}
		public List<TerminalNode> QuestionSymbol() { return getTokens(wiki_markupParser.QuestionSymbol); }
		public TerminalNode QuestionSymbol(int i) {
			return getToken(wiki_markupParser.QuestionSymbol, i);
		}
		public List<TerminalNode> NumSymbol() { return getTokens(wiki_markupParser.NumSymbol); }
		public TerminalNode NumSymbol(int i) {
			return getToken(wiki_markupParser.NumSymbol, i);
		}
		public List<TerminalNode> StarSymbol() { return getTokens(wiki_markupParser.StarSymbol); }
		public TerminalNode StarSymbol(int i) {
			return getToken(wiki_markupParser.StarSymbol, i);
		}
		public List<TerminalNode> SharpSymbol() { return getTokens(wiki_markupParser.SharpSymbol); }
		public TerminalNode SharpSymbol(int i) {
			return getToken(wiki_markupParser.SharpSymbol, i);
		}
		public List_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterList_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitList_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitList_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_elementContext list_element() throws RecognitionException {
		List_elementContext _localctx = new List_elementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list_element);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(377);
					_la = _input.LA(1);
					if ( !(_la==SharpSymbol || _la==StarSymbol) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(380); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(406);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(382);
						tags();
						}
						break;
					case 2:
						{
						setState(383);
						link();
						}
						break;
					case 3:
						{
						setState(384);
						template();
						}
						break;
					case 4:
						{
						setState(385);
						table();
						}
						break;
					case 5:
						{
						setState(386);
						url_or_email();
						}
						break;
					case 6:
						{
						setState(387);
						assignment();
						}
						break;
					case 7:
						{
						setState(388);
						headers();
						}
						break;
					case 8:
						{
						setState(389);
						accentuation();
						}
						break;
					case 9:
						{
						setState(390);
						ignore_element();
						}
						break;
					case 10:
						{
						setState(391);
						match(AnyText);
						}
						break;
					case 11:
						{
						setState(392);
						match(CommaSymbol);
						}
						break;
					case 12:
						{
						setState(393);
						match(SemicolonSymbol);
						}
						break;
					case 13:
						{
						setState(394);
						match(AmpersandSymbol);
						}
						break;
					case 14:
						{
						setState(395);
						match(DashSymbol);
						}
						break;
					case 15:
						{
						setState(396);
						match(HyphenSymbol);
						}
						break;
					case 16:
						{
						setState(397);
						match(DotSymbol);
						}
						break;
					case 17:
						{
						setState(398);
						match(ApostropheSymbol);
						}
						break;
					case 18:
						{
						setState(399);
						match(ColonSymbol);
						}
						break;
					case 19:
						{
						setState(400);
						match(QuoteSymbol);
						}
						break;
					case 20:
						{
						setState(401);
						match(ForwardSlashSymbol);
						}
						break;
					case 21:
						{
						setState(402);
						match(ExclamationMarkSymbol);
						}
						break;
					case 22:
						{
						setState(403);
						match(DollarSymbol);
						}
						break;
					case 23:
						{
						setState(404);
						match(QuestionSymbol);
						}
						break;
					case 24:
						{
						setState(405);
						match(NumSymbol);
						}
						break;
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public List<TemplateContext> template() {
			return getRuleContexts(TemplateContext.class);
		}
		public TemplateContext template(int i) {
			return getRuleContext(TemplateContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<AccentuationContext> accentuation() {
			return getRuleContexts(AccentuationContext.class);
		}
		public AccentuationContext accentuation(int i) {
			return getRuleContext(AccentuationContext.class,i);
		}
		public List<TerminalNode> NumSymbol() { return getTokens(wiki_markupParser.NumSymbol); }
		public TerminalNode NumSymbol(int i) {
			return getToken(wiki_markupParser.NumSymbol, i);
		}
		public List<TerminalNode> BackSlashSymbol() { return getTokens(wiki_markupParser.BackSlashSymbol); }
		public TerminalNode BackSlashSymbol(int i) {
			return getToken(wiki_markupParser.BackSlashSymbol, i);
		}
		public List<TerminalNode> SharpSymbol() { return getTokens(wiki_markupParser.SharpSymbol); }
		public TerminalNode SharpSymbol(int i) {
			return getToken(wiki_markupParser.SharpSymbol, i);
		}
		public List<TerminalNode> AnyText() { return getTokens(wiki_markupParser.AnyText); }
		public TerminalNode AnyText(int i) {
			return getToken(wiki_markupParser.AnyText, i);
		}
		public List<TerminalNode> DotSymbol() { return getTokens(wiki_markupParser.DotSymbol); }
		public TerminalNode DotSymbol(int i) {
			return getToken(wiki_markupParser.DotSymbol, i);
		}
		public List<TerminalNode> DollarSymbol() { return getTokens(wiki_markupParser.DollarSymbol); }
		public TerminalNode DollarSymbol(int i) {
			return getToken(wiki_markupParser.DollarSymbol, i);
		}
		public List<TerminalNode> PercentSymbol() { return getTokens(wiki_markupParser.PercentSymbol); }
		public TerminalNode PercentSymbol(int i) {
			return getToken(wiki_markupParser.PercentSymbol, i);
		}
		public List<TerminalNode> QuestionSymbol() { return getTokens(wiki_markupParser.QuestionSymbol); }
		public TerminalNode QuestionSymbol(int i) {
			return getToken(wiki_markupParser.QuestionSymbol, i);
		}
		public List<TerminalNode> PlusSymbol() { return getTokens(wiki_markupParser.PlusSymbol); }
		public TerminalNode PlusSymbol(int i) {
			return getToken(wiki_markupParser.PlusSymbol, i);
		}
		public List<TerminalNode> CommaSymbol() { return getTokens(wiki_markupParser.CommaSymbol); }
		public TerminalNode CommaSymbol(int i) {
			return getToken(wiki_markupParser.CommaSymbol, i);
		}
		public List<TerminalNode> HyphenSymbol() { return getTokens(wiki_markupParser.HyphenSymbol); }
		public TerminalNode HyphenSymbol(int i) {
			return getToken(wiki_markupParser.HyphenSymbol, i);
		}
		public List<TerminalNode> QuoteSymbol() { return getTokens(wiki_markupParser.QuoteSymbol); }
		public TerminalNode QuoteSymbol(int i) {
			return getToken(wiki_markupParser.QuoteSymbol, i);
		}
		public List<TerminalNode> AmpersandSymbol() { return getTokens(wiki_markupParser.AmpersandSymbol); }
		public TerminalNode AmpersandSymbol(int i) {
			return getToken(wiki_markupParser.AmpersandSymbol, i);
		}
		public List<TerminalNode> ApostropheSymbol() { return getTokens(wiki_markupParser.ApostropheSymbol); }
		public TerminalNode ApostropheSymbol(int i) {
			return getToken(wiki_markupParser.ApostropheSymbol, i);
		}
		public List<TerminalNode> ForwardSlashSymbol() { return getTokens(wiki_markupParser.ForwardSlashSymbol); }
		public TerminalNode ForwardSlashSymbol(int i) {
			return getToken(wiki_markupParser.ForwardSlashSymbol, i);
		}
		public List<TerminalNode> DashSymbol() { return getTokens(wiki_markupParser.DashSymbol); }
		public TerminalNode DashSymbol(int i) {
			return getToken(wiki_markupParser.DashSymbol, i);
		}
		public List<TerminalNode> ColonSymbol() { return getTokens(wiki_markupParser.ColonSymbol); }
		public TerminalNode ColonSymbol(int i) {
			return getToken(wiki_markupParser.ColonSymbol, i);
		}
		public List<TerminalNode> SemicolonSymbol() { return getTokens(wiki_markupParser.SemicolonSymbol); }
		public TerminalNode SemicolonSymbol(int i) {
			return getToken(wiki_markupParser.SemicolonSymbol, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__8);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(412);
						tags();
						}
						break;
					case 2:
						{
						setState(413);
						template();
						}
						break;
					case 3:
						{
						setState(414);
						link();
						}
						break;
					case 4:
						{
						setState(415);
						table();
						}
						break;
					case 5:
						{
						setState(416);
						accentuation();
						}
						break;
					case 6:
						{
						setState(417);
						match(NumSymbol);
						}
						break;
					case 7:
						{
						setState(418);
						match(BackSlashSymbol);
						}
						break;
					case 8:
						{
						setState(419);
						match(SharpSymbol);
						}
						break;
					case 9:
						{
						setState(420);
						match(AnyText);
						}
						break;
					case 10:
						{
						setState(421);
						match(DotSymbol);
						}
						break;
					case 11:
						{
						setState(422);
						match(DollarSymbol);
						}
						break;
					case 12:
						{
						setState(423);
						match(PercentSymbol);
						}
						break;
					case 13:
						{
						setState(424);
						match(QuestionSymbol);
						}
						break;
					case 14:
						{
						setState(425);
						match(PlusSymbol);
						}
						break;
					case 15:
						{
						setState(426);
						match(CommaSymbol);
						}
						break;
					case 16:
						{
						setState(427);
						match(HyphenSymbol);
						}
						break;
					case 17:
						{
						setState(428);
						match(QuoteSymbol);
						}
						break;
					case 18:
						{
						setState(429);
						match(AmpersandSymbol);
						}
						break;
					case 19:
						{
						setState(430);
						match(ApostropheSymbol);
						}
						break;
					case 20:
						{
						setState(431);
						match(ForwardSlashSymbol);
						}
						break;
					case 21:
						{
						setState(432);
						match(DashSymbol);
						}
						break;
					case 22:
						{
						setState(433);
						match(ColonSymbol);
						}
						break;
					case 23:
						{
						setState(434);
						match(SemicolonSymbol);
						}
						break;
					case 24:
						{
						setState(435);
						match(T__5);
						}
						break;
					case 25:
						{
						setState(436);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class AccentuationContext extends ParserRuleContext {
		public Logical_accentuationContext logical_accentuation() {
			return getRuleContext(Logical_accentuationContext.class,0);
		}
		public Structural_accentuationContext structural_accentuation() {
			return getRuleContext(Structural_accentuationContext.class,0);
		}
		public AccentuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accentuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterAccentuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitAccentuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitAccentuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccentuationContext accentuation() throws RecognitionException {
		AccentuationContext _localctx = new AccentuationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_accentuation);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				logical_accentuation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				structural_accentuation();
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

	public static class Logical_accentuationContext extends ParserRuleContext {
		public List<TerminalNode> ApostropheSymbol() { return getTokens(wiki_markupParser.ApostropheSymbol); }
		public TerminalNode ApostropheSymbol(int i) {
			return getToken(wiki_markupParser.ApostropheSymbol, i);
		}
		public Text_accentuationContext text_accentuation() {
			return getRuleContext(Text_accentuationContext.class,0);
		}
		public Logical_accentuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_accentuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterLogical_accentuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitLogical_accentuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitLogical_accentuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_accentuationContext logical_accentuation() throws RecognitionException {
		Logical_accentuationContext _localctx = new Logical_accentuationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logical_accentuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(ApostropheSymbol);
			setState(447);
			match(ApostropheSymbol);
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(448);
				text_accentuation();
				}
				break;
			}
			setState(451);
			match(ApostropheSymbol);
			setState(452);
			match(ApostropheSymbol);
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

	public static class Structural_accentuationContext extends ParserRuleContext {
		public List<TerminalNode> ApostropheSymbol() { return getTokens(wiki_markupParser.ApostropheSymbol); }
		public TerminalNode ApostropheSymbol(int i) {
			return getToken(wiki_markupParser.ApostropheSymbol, i);
		}
		public Text_accentuationContext text_accentuation() {
			return getRuleContext(Text_accentuationContext.class,0);
		}
		public Structural_accentuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structural_accentuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterStructural_accentuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitStructural_accentuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitStructural_accentuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structural_accentuationContext structural_accentuation() throws RecognitionException {
		Structural_accentuationContext _localctx = new Structural_accentuationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_structural_accentuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(ApostropheSymbol);
			setState(455);
			match(ApostropheSymbol);
			setState(456);
			match(ApostropheSymbol);
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(457);
				text_accentuation();
				}
				break;
			}
			setState(460);
			match(ApostropheSymbol);
			setState(461);
			match(ApostropheSymbol);
			setState(462);
			match(ApostropheSymbol);
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

	public static class Text_accentuationContext extends ParserRuleContext {
		public List<Elements_markupContext> elements_markup() {
			return getRuleContexts(Elements_markupContext.class);
		}
		public Elements_markupContext elements_markup(int i) {
			return getRuleContext(Elements_markupContext.class,i);
		}
		public Text_accentuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_accentuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterText_accentuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitText_accentuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitText_accentuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_accentuationContext text_accentuation() throws RecognitionException {
		Text_accentuationContext _localctx = new Text_accentuationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_text_accentuation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(465); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(464);
					elements_markup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(467); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class HeadersContext extends ParserRuleContext {
		public Header1Context header1() {
			return getRuleContext(Header1Context.class,0);
		}
		public Header2Context header2() {
			return getRuleContext(Header2Context.class,0);
		}
		public Header3Context header3() {
			return getRuleContext(Header3Context.class,0);
		}
		public Header4Context header4() {
			return getRuleContext(Header4Context.class,0);
		}
		public Header5Context header5() {
			return getRuleContext(Header5Context.class,0);
		}
		public Header6Context header6() {
			return getRuleContext(Header6Context.class,0);
		}
		public HeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitHeaders(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitHeaders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_headers);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				header1();
				}
				break;
			case H2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				header2();
				}
				break;
			case H3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				header3();
				}
				break;
			case H4:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				header4();
				}
				break;
			case H5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				header5();
				}
				break;
			case H6:
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				header6();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Contend_headerContext extends ParserRuleContext {
		public List<Elements_markupContext> elements_markup() {
			return getRuleContexts(Elements_markupContext.class);
		}
		public Elements_markupContext elements_markup(int i) {
			return getRuleContext(Elements_markupContext.class,i);
		}
		public Contend_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contend_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterContend_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitContend_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitContend_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contend_headerContext contend_header() throws RecognitionException {
		Contend_headerContext _localctx = new Contend_headerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_contend_header);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(477);
					elements_markup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(480); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class Header1Context extends ParserRuleContext {
		public List<TerminalNode> H1() { return getTokens(wiki_markupParser.H1); }
		public TerminalNode H1(int i) {
			return getToken(wiki_markupParser.H1, i);
		}
		public Contend_headerContext contend_header() {
			return getRuleContext(Contend_headerContext.class,0);
		}
		public Header1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterHeader1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitHeader1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitHeader1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header1Context header1() throws RecognitionException {
		Header1Context _localctx = new Header1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_header1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(H1);
			setState(483);
			contend_header();
			setState(484);
			match(H1);
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

	public static class Header2Context extends ParserRuleContext {
		public List<TerminalNode> H2() { return getTokens(wiki_markupParser.H2); }
		public TerminalNode H2(int i) {
			return getToken(wiki_markupParser.H2, i);
		}
		public Contend_headerContext contend_header() {
			return getRuleContext(Contend_headerContext.class,0);
		}
		public Header2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterHeader2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitHeader2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitHeader2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header2Context header2() throws RecognitionException {
		Header2Context _localctx = new Header2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_header2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(H2);
			setState(487);
			contend_header();
			setState(488);
			match(H2);
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

	public static class Header3Context extends ParserRuleContext {
		public List<TerminalNode> H3() { return getTokens(wiki_markupParser.H3); }
		public TerminalNode H3(int i) {
			return getToken(wiki_markupParser.H3, i);
		}
		public Contend_headerContext contend_header() {
			return getRuleContext(Contend_headerContext.class,0);
		}
		public Header3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterHeader3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitHeader3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitHeader3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header3Context header3() throws RecognitionException {
		Header3Context _localctx = new Header3Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_header3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(H3);
			setState(491);
			contend_header();
			setState(492);
			match(H3);
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

	public static class Header4Context extends ParserRuleContext {
		public List<TerminalNode> H4() { return getTokens(wiki_markupParser.H4); }
		public TerminalNode H4(int i) {
			return getToken(wiki_markupParser.H4, i);
		}
		public Contend_headerContext contend_header() {
			return getRuleContext(Contend_headerContext.class,0);
		}
		public Header4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterHeader4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitHeader4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitHeader4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header4Context header4() throws RecognitionException {
		Header4Context _localctx = new Header4Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_header4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(H4);
			setState(495);
			contend_header();
			setState(496);
			match(H4);
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

	public static class Header5Context extends ParserRuleContext {
		public List<TerminalNode> H5() { return getTokens(wiki_markupParser.H5); }
		public TerminalNode H5(int i) {
			return getToken(wiki_markupParser.H5, i);
		}
		public Contend_headerContext contend_header() {
			return getRuleContext(Contend_headerContext.class,0);
		}
		public Header5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterHeader5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitHeader5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitHeader5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header5Context header5() throws RecognitionException {
		Header5Context _localctx = new Header5Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_header5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(H5);
			setState(499);
			contend_header();
			setState(500);
			match(H5);
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

	public static class Header6Context extends ParserRuleContext {
		public List<TerminalNode> H6() { return getTokens(wiki_markupParser.H6); }
		public TerminalNode H6(int i) {
			return getToken(wiki_markupParser.H6, i);
		}
		public Contend_headerContext contend_header() {
			return getRuleContext(Contend_headerContext.class,0);
		}
		public Header6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).enterHeader6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wiki_markupListener ) ((wiki_markupListener)listener).exitHeader6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wiki_markupVisitor ) return ((wiki_markupVisitor<? extends T>)visitor).visitHeader6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header6Context header6() throws RecognitionException {
		Header6Context _localctx = new Header6Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_header6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(H6);
			setState(503);
			contend_header();
			setState(504);
			match(H6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3n\n\3\r\3\16\3o\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\3\5\3\5\3\5\3\6"+
		"\6\6\u0087\n\6\r\6\16\6\u0088\3\7\3\7\3\7\5\7\u008e\n\7\3\7\5\7\u0091"+
		"\n\7\3\7\3\7\5\7\u0095\n\7\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\b\3\b\3\b\3"+
		"\b\5\b\u00a1\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00b7\n\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\5\13\u00c0\n\13\3\13\5\13\u00c3\n\13\3\13\3\13\5\13\u00c7\n\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00cd\n\13\3\f\3\f\3\f\7\f\u00d2\n\f\f\f\16\f"+
		"\u00d5\13\f\3\f\7\f\u00d8\n\f\f\f\16\f\u00db\13\f\3\f\5\f\u00de\n\f\3"+
		"\r\6\r\u00e1\n\r\r\r\16\r\u00e2\3\16\3\16\3\16\3\16\5\16\u00e9\n\16\3"+
		"\16\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0\13\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00f6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0104\n\17\3\20\3\20\3\20\5\20\u0109\n\20\3\20\3\20\5\20\u010d"+
		"\n\20\7\20\u010f\n\20\f\20\16\20\u0112\13\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\6\21\u0128\n\21\r\21\16\21\u0129\3\22\3\22\5\22\u012e\n\22\3\22"+
		"\3\22\3\23\6\23\u0133\n\23\r\23\16\23\u0134\3\24\3\24\3\24\7\24\u013a"+
		"\n\24\f\24\16\24\u013d\13\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0145"+
		"\n\25\3\25\3\25\5\25\u0149\n\25\7\25\u014b\n\25\f\25\16\25\u014e\13\25"+
		"\3\25\3\25\3\25\3\26\6\26\u0154\n\26\r\26\16\26\u0155\3\27\3\27\5\27\u015a"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0173\n\30\r\30"+
		"\16\30\u0174\3\31\6\31\u0178\n\31\r\31\16\31\u0179\3\32\6\32\u017d\n\32"+
		"\r\32\16\32\u017e\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7"+
		"\32\u0199\n\32\f\32\16\32\u019c\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\7\33\u01b8\n\33\f\33\16\33\u01bb\13\33\3"+
		"\34\3\34\5\34\u01bf\n\34\3\35\3\35\3\35\5\35\u01c4\n\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\5\36\u01cd\n\36\3\36\3\36\3\36\3\36\3\37\6\37\u01d4"+
		"\n\37\r\37\16\37\u01d5\3 \3 \3 \3 \3 \3 \5 \u01de\n \3!\6!\u01e1\n!\r"+
		"!\16!\u01e2\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\u013b\2(\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\7\3\2\t\n\4\2\34\34\60\60\7\2"+
		"\r\r\34\34!!##\'\'\4\2\f\f..\3\2\65\66\2\u0285\2O\3\2\2\2\4m\3\2\2\2\6"+
		"x\3\2\2\2\bz\3\2\2\2\n\u0086\3\2\2\2\f\u008a\3\2\2\2\16\u009c\3\2\2\2"+
		"\20\u00a7\3\2\2\2\22\u00b2\3\2\2\2\24\u00bd\3\2\2\2\26\u00ce\3\2\2\2\30"+
		"\u00e0\3\2\2\2\32\u00e4\3\2\2\2\34\u0103\3\2\2\2\36\u0105\3\2\2\2 \u0127"+
		"\3\2\2\2\"\u012b\3\2\2\2$\u0132\3\2\2\2&\u0136\3\2\2\2(\u0141\3\2\2\2"+
		"*\u0153\3\2\2\2,\u0157\3\2\2\2.\u0172\3\2\2\2\60\u0177\3\2\2\2\62\u017c"+
		"\3\2\2\2\64\u019d\3\2\2\2\66\u01be\3\2\2\28\u01c0\3\2\2\2:\u01c8\3\2\2"+
		"\2<\u01d3\3\2\2\2>\u01dd\3\2\2\2@\u01e0\3\2\2\2B\u01e4\3\2\2\2D\u01e8"+
		"\3\2\2\2F\u01ec\3\2\2\2H\u01f0\3\2\2\2J\u01f4\3\2\2\2L\u01f8\3\2\2\2N"+
		"P\5\4\3\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\2\2\3R\3\3\2\2\2Sn\5\6\4\2"+
		"Tn\5(\25\2Un\5\36\20\2Vn\5&\24\2Wn\5,\27\2Xn\5\64\33\2Yn\5\60\31\2Zn\5"+
		"> \2[n\5\66\34\2\\n\5\"\22\2]n\7\r\2\2^n\7 \2\2_n\7\64\2\2`n\7\30\2\2"+
		"an\7!\2\2bn\7\'\2\2cn\7#\2\2dn\7\31\2\2en\7\37\2\2fn\7\60\2\2gn\7%\2\2"+
		"hn\7$\2\2in\7\"\2\2jn\7\61\2\2kn\7/\2\2ln\7+\2\2mS\3\2\2\2mT\3\2\2\2m"+
		"U\3\2\2\2mV\3\2\2\2mW\3\2\2\2mX\3\2\2\2mY\3\2\2\2mZ\3\2\2\2m[\3\2\2\2"+
		"m\\\3\2\2\2m]\3\2\2\2m^\3\2\2\2m_\3\2\2\2m`\3\2\2\2ma\3\2\2\2mb\3\2\2"+
		"\2mc\3\2\2\2md\3\2\2\2me\3\2\2\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2"+
		"\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\5\3\2"+
		"\2\2qy\5\24\13\2ry\5\b\5\2sy\5\f\7\2ty\5\16\b\2uy\5\20\t\2vy\5\22\n\2"+
		"wy\5\32\16\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2"+
		"\2xw\3\2\2\2y\7\3\2\2\2z{\7*\2\2{|\7$\2\2|}\7\'\2\2}\177\7\'\2\2~\u0080"+
		"\5\n\6\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\7\'\2\2\u0082\u0083\7\'\2\2\u0083\u0084\7&\2\2\u0084\t\3\2\2\2\u0085"+
		"\u0087\5\4\3\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\13\3\2\2\2\u008a\u008b\7*\2\2\u008b\u008d"+
		"\7\3\2\2\u008c\u008e\79\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0091\7%\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7&\2\2\u0093\u0095\7\r\2\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u0097\7*"+
		"\2\2\u0097\u0098\7%\2\2\u0098\u0099\7\3\2\2\u0099\u009b\7&\2\2\u009a\u0096"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\r\3\2\2\2\u009c\u009d\7*\2\2\u009d"+
		"\u009e\7\4\2\2\u009e\u00a0\7&\2\2\u009f\u00a1\7\r\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7*\2\2\u00a3"+
		"\u00a4\7%\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\7&\2\2\u00a6\17\3\2\2\2"+
		"\u00a7\u00a8\7*\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00ab\7&\2\2\u00aa\u00ac"+
		"\7\r\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\7*\2\2\u00ae\u00af\7%\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\7&\2"+
		"\2\u00b1\21\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3\u00b4\7\6\2\2\u00b4\u00b6"+
		"\7&\2\2\u00b5\u00b7\7\r\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\7*\2\2\u00b9\u00ba\7%\2\2\u00ba\u00bb\7\6\2"+
		"\2\u00bb\u00bc\7&\2\2\u00bc\23\3\2\2\2\u00bd\u00bf\7\7\2\2\u00be\u00c0"+
		"\5\26\f\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2"+
		"\u00c1\u00c3\7%\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00cc\7&\2\2\u00c5\u00c7\5\30\r\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7*\2\2\u00c9\u00ca\7%\2"+
		"\2\u00ca\u00cb\7\b\2\2\u00cb\u00cd\7&\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\25\3\2\2\2\u00ce\u00cf\t\2\2\2\u00cf\u00d3\7\13\2\2\u00d0"+
		"\u00d2\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d9\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d8\t\4\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00de\7\60\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\27\3\2\2"+
		"\2\u00df\u00e1\5\4\3\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\31\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5"+
		"\u00e8\7\r\2\2\u00e6\u00e9\7%\2\2\u00e7\u00e9\5\64\33\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00f5\7&\2\2\u00eb\u00ed\5\34\17\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3"+
		"\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2\u00f3\7%\2\2\u00f3\u00f4\7\r\2"+
		"\2\u00f4\u00f6\7&\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\33"+
		"\3\2\2\2\u00f7\u0104\7\r\2\2\u00f8\u0104\7\31\2\2\u00f9\u0104\7\64\2\2"+
		"\u00fa\u0104\7!\2\2\u00fb\u0104\7\'\2\2\u00fc\u0104\7\37\2\2\u00fd\u0104"+
		"\7 \2\2\u00fe\u0104\7#\2\2\u00ff\u0104\5(\25\2\u0100\u0104\5,\27\2\u0101"+
		"\u0104\5\"\22\2\u0102\u0104\5\36\20\2\u0103\u00f7\3\2\2\2\u0103\u00f8"+
		"\3\2\2\2\u0103\u00f9\3\2\2\2\u0103\u00fa\3\2\2\2\u0103\u00fb\3\2\2\2\u0103"+
		"\u00fc\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2"+
		"\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\35\3\2\2\2\u0105\u0106\7(\2\2\u0106\u0108\7(\2\2\u0107\u0109\5 \21\2"+
		"\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0110\3\2\2\2\u010a\u010c"+
		"\7.\2\2\u010b\u010d\5 \21\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010a\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0114\7\62\2\2\u0114\u0115\7\62\2\2\u0115\37\3\2\2\2\u0116\u0128\7\r"+
		"\2\2\u0117\u0128\7\31\2\2\u0118\u0128\7 \2\2\u0119\u0128\7\37\2\2\u011a"+
		"\u0128\7%\2\2\u011b\u0128\7\'\2\2\u011c\u0128\7\65\2\2\u011d\u0128\7\60"+
		"\2\2\u011e\u0128\7!\2\2\u011f\u0128\7\34\2\2\u0120\u0128\7#\2\2\u0121"+
		"\u0128\7\67\2\2\u0122\u0128\7-\2\2\u0123\u0128\5\64\33\2\u0124\u0128\5"+
		"\"\22\2\u0125\u0128\5\6\4\2\u0126\u0128\5(\25\2\u0127\u0116\3\2\2\2\u0127"+
		"\u0117\3\2\2\2\u0127\u0118\3\2\2\2\u0127\u0119\3\2\2\2\u0127\u011a\3\2"+
		"\2\2\u0127\u011b\3\2\2\2\u0127\u011c\3\2\2\2\u0127\u011d\3\2\2\2\u0127"+
		"\u011e\3\2\2\2\u0127\u011f\3\2\2\2\u0127\u0120\3\2\2\2\u0127\u0121\3\2"+
		"\2\2\u0127\u0122\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a!\3\2\2\2\u012b\u012d\7,\2\2\u012c\u012e"+
		"\5$\23\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\7\36\2\2\u0130#\3\2\2\2\u0131\u0133\5\4\3\2\u0132\u0131\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135%\3"+
		"\2\2\2\u0136\u0137\7(\2\2\u0137\u013b\t\5\2\2\u0138\u013a\13\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u013c\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\t\5\2\2\u013f"+
		"\u0140\7\62\2\2\u0140\'\3\2\2\2\u0141\u0142\7)\2\2\u0142\u0144\7)\2\2"+
		"\u0143\u0145\5*\26\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014c"+
		"\3\2\2\2\u0146\u0148\7.\2\2\u0147\u0149\5*\26\2\u0148\u0147\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0146\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7\63\2\2\u0150\u0151\7\63\2\2\u0151)\3\2\2"+
		"\2\u0152\u0154\5\4\3\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156+\3\2\2\2\u0157\u0159\7)\2\2\u0158\u015a"+
		"\5.\30\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\7\63\2\2\u015c-\3\2\2\2\u015d\u0173\7\r\2\2\u015e\u0173\7\65\2"+
		"\2\u015f\u0173\7\60\2\2\u0160\u0173\7\37\2\2\u0161\u0173\7#\2\2\u0162"+
		"\u0173\7+\2\2\u0163\u0173\7%\2\2\u0164\u0173\7\13\2\2\u0165\u0173\7-\2"+
		"\2\u0166\u0173\7$\2\2\u0167\u0173\7/\2\2\u0168\u0173\7\30\2\2\u0169\u0173"+
		"\7\33\2\2\u016a\u0173\7\61\2\2\u016b\u0173\7!\2\2\u016c\u0173\7\64\2\2"+
		"\u016d\u0173\7\'\2\2\u016e\u0173\7\31\2\2\u016f\u0173\7 \2\2\u0170\u0173"+
		"\5\66\34\2\u0171\u0173\5\"\22\2\u0172\u015d\3\2\2\2\u0172\u015e\3\2\2"+
		"\2\u0172\u015f\3\2\2\2\u0172\u0160\3\2\2\2\u0172\u0161\3\2\2\2\u0172\u0162"+
		"\3\2\2\2\u0172\u0163\3\2\2\2\u0172\u0164\3\2\2\2\u0172\u0165\3\2\2\2\u0172"+
		"\u0166\3\2\2\2\u0172\u0167\3\2\2\2\u0172\u0168\3\2\2\2\u0172\u0169\3\2"+
		"\2\2\u0172\u016a\3\2\2\2\u0172\u016b\3\2\2\2\u0172\u016c\3\2\2\2\u0172"+
		"\u016d\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175/\3\2\2\2\u0176\u0178\5\62\32\2\u0177\u0176\3\2\2"+
		"\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\61"+
		"\3\2\2\2\u017b\u017d\t\6\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u019a\3\2\2\2\u0180\u0199\5\6"+
		"\4\2\u0181\u0199\5(\25\2\u0182\u0199\5\36\20\2\u0183\u0199\5&\24\2\u0184"+
		"\u0199\5,\27\2\u0185\u0199\5\64\33\2\u0186\u0199\5> \2\u0187\u0199\5\66"+
		"\34\2\u0188\u0199\5\"\22\2\u0189\u0199\7\r\2\2\u018a\u0199\7 \2\2\u018b"+
		"\u0199\7\64\2\2\u018c\u0199\7\30\2\2\u018d\u0199\7!\2\2\u018e\u0199\7"+
		"\'\2\2\u018f\u0199\7#\2\2\u0190\u0199\7\31\2\2\u0191\u0199\7\37\2\2\u0192"+
		"\u0199\7\60\2\2\u0193\u0199\7%\2\2\u0194\u0199\7$\2\2\u0195\u0199\7\""+
		"\2\2\u0196\u0199\7\61\2\2\u0197\u0199\7+\2\2\u0198\u0180\3\2\2\2\u0198"+
		"\u0181\3\2\2\2\u0198\u0182\3\2\2\2\u0198\u0183\3\2\2\2\u0198\u0184\3\2"+
		"\2\2\u0198\u0185\3\2\2\2\u0198\u0186\3\2\2\2\u0198\u0187\3\2\2\2\u0198"+
		"\u0188\3\2\2\2\u0198\u0189\3\2\2\2\u0198\u018a\3\2\2\2\u0198\u018b\3\2"+
		"\2\2\u0198\u018c\3\2\2\2\u0198\u018d\3\2\2\2\u0198\u018e\3\2\2\2\u0198"+
		"\u018f\3\2\2\2\u0198\u0190\3\2\2\2\u0198\u0191\3\2\2\2\u0198\u0192\3\2"+
		"\2\2\u0198\u0193\3\2\2\2\u0198\u0194\3\2\2\2\u0198\u0195\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\63\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01b9"+
		"\7\13\2\2\u019e\u01b8\5\6\4\2\u019f\u01b8\5\36\20\2\u01a0\u01b8\5(\25"+
		"\2\u01a1\u01b8\5&\24\2\u01a2\u01b8\5\66\34\2\u01a3\u01b8\7+\2\2\u01a4"+
		"\u01b8\7\34\2\2\u01a5\u01b8\7\65\2\2\u01a6\u01b8\7\r\2\2\u01a7\u01b8\7"+
		"#\2\2\u01a8\u01b8\7\"\2\2\u01a9\u01b8\7-\2\2\u01aa\u01b8\7\61\2\2\u01ab"+
		"\u01b8\7/\2\2\u01ac\u01b8\7 \2\2\u01ad\u01b8\7\'\2\2\u01ae\u01b8\7\60"+
		"\2\2\u01af\u01b8\7\30\2\2\u01b0\u01b8\7\31\2\2\u01b1\u01b8\7%\2\2\u01b2"+
		"\u01b8\7!\2\2\u01b3\u01b8\7\37\2\2\u01b4\u01b8\7\64\2\2\u01b5\u01b8\7"+
		"\b\2\2\u01b6\u01b8\7\t\2\2\u01b7\u019e\3\2\2\2\u01b7\u019f\3\2\2\2\u01b7"+
		"\u01a0\3\2\2\2\u01b7\u01a1\3\2\2\2\u01b7\u01a2\3\2\2\2\u01b7\u01a3\3\2"+
		"\2\2\u01b7\u01a4\3\2\2\2\u01b7\u01a5\3\2\2\2\u01b7\u01a6\3\2\2\2\u01b7"+
		"\u01a7\3\2\2\2\u01b7\u01a8\3\2\2\2\u01b7\u01a9\3\2\2\2\u01b7\u01aa\3\2"+
		"\2\2\u01b7\u01ab\3\2\2\2\u01b7\u01ac\3\2\2\2\u01b7\u01ad\3\2\2\2\u01b7"+
		"\u01ae\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b7\u01b1\3\2"+
		"\2\2\u01b7\u01b2\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\65\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf"+
		"\58\35\2\u01bd\u01bf\5:\36\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf"+
		"\67\3\2\2\2\u01c0\u01c1\7\31\2\2\u01c1\u01c3\7\31\2\2\u01c2\u01c4\5<\37"+
		"\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6"+
		"\7\31\2\2\u01c6\u01c7\7\31\2\2\u01c79\3\2\2\2\u01c8\u01c9\7\31\2\2\u01c9"+
		"\u01ca\7\31\2\2\u01ca\u01cc\7\31\2\2\u01cb\u01cd\5<\37\2\u01cc\u01cb\3"+
		"\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\7\31\2\2\u01cf"+
		"\u01d0\7\31\2\2\u01d0\u01d1\7\31\2\2\u01d1;\3\2\2\2\u01d2\u01d4\5\4\3"+
		"\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6=\3\2\2\2\u01d7\u01de\5B\"\2\u01d8\u01de\5D#\2\u01d9\u01de"+
		"\5F$\2\u01da\u01de\5H%\2\u01db\u01de\5J&\2\u01dc\u01de\5L\'\2\u01dd\u01d7"+
		"\3\2\2\2\u01dd\u01d8\3\2\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de?\3\2\2\2\u01df\u01e1\5\4\3\2"+
		"\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3A\3\2\2\2\u01e4\u01e5\7\16\2\2\u01e5\u01e6\5@!\2\u01e6\u01e7"+
		"\7\16\2\2\u01e7C\3\2\2\2\u01e8\u01e9\7\17\2\2\u01e9\u01ea\5@!\2\u01ea"+
		"\u01eb\7\17\2\2\u01ebE\3\2\2\2\u01ec\u01ed\7\20\2\2\u01ed\u01ee\5@!\2"+
		"\u01ee\u01ef\7\20\2\2\u01efG\3\2\2\2\u01f0\u01f1\7\21\2\2\u01f1\u01f2"+
		"\5@!\2\u01f2\u01f3\7\21\2\2\u01f3I\3\2\2\2\u01f4\u01f5\7\22\2\2\u01f5"+
		"\u01f6\5@!\2\u01f6\u01f7\7\22\2\2\u01f7K\3\2\2\2\u01f8\u01f9\7\23\2\2"+
		"\u01f9\u01fa\5@!\2\u01fa\u01fb\7\23\2\2\u01fbM\3\2\2\2\66Omox\177\u0088"+
		"\u008d\u0090\u0094\u009a\u00a0\u00ab\u00b6\u00bf\u00c2\u00c6\u00cc\u00d3"+
		"\u00d9\u00dd\u00e2\u00e8\u00ee\u00f5\u0103\u0108\u010c\u0110\u0127\u0129"+
		"\u012d\u0134\u013b\u0144\u0148\u014c\u0155\u0159\u0172\u0174\u0179\u017e"+
		"\u0198\u019a\u01b7\u01b9\u01be\u01c3\u01cc\u01d5\u01dd\u01e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}