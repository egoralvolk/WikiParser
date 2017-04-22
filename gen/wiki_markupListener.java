// Generated from D:/Git/Парсер Викиразмертки\wiki_markup.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link wiki_markupParser}.
 */
public interface wiki_markupListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#wiki_article}.
	 * @param ctx the parse tree
	 */
	void enterWiki_article(wiki_markupParser.Wiki_articleContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#wiki_article}.
	 * @param ctx the parse tree
	 */
	void exitWiki_article(wiki_markupParser.Wiki_articleContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#elements_markup}.
	 * @param ctx the parse tree
	 */
	void enterElements_markup(wiki_markupParser.Elements_markupContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#elements_markup}.
	 * @param ctx the parse tree
	 */
	void exitElements_markup(wiki_markupParser.Elements_markupContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(wiki_markupParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(wiki_markupParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(wiki_markupParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(wiki_markupParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#text_comment}.
	 * @param ctx the parse tree
	 */
	void enterText_comment(wiki_markupParser.Text_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#text_comment}.
	 * @param ctx the parse tree
	 */
	void exitText_comment(wiki_markupParser.Text_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#nowiki}.
	 * @param ctx the parse tree
	 */
	void enterNowiki(wiki_markupParser.NowikiContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#nowiki}.
	 * @param ctx the parse tree
	 */
	void exitNowiki(wiki_markupParser.NowikiContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(wiki_markupParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(wiki_markupParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#syntaxhighlight}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxhighlight(wiki_markupParser.SyntaxhighlightContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#syntaxhighlight}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxhighlight(wiki_markupParser.SyntaxhighlightContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#pre}.
	 * @param ctx the parse tree
	 */
	void enterPre(wiki_markupParser.PreContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#pre}.
	 * @param ctx the parse tree
	 */
	void exitPre(wiki_markupParser.PreContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(wiki_markupParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(wiki_markupParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#ref_name}.
	 * @param ctx the parse tree
	 */
	void enterRef_name(wiki_markupParser.Ref_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#ref_name}.
	 * @param ctx the parse tree
	 */
	void exitRef_name(wiki_markupParser.Ref_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#ref_content}.
	 * @param ctx the parse tree
	 */
	void enterRef_content(wiki_markupParser.Ref_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#ref_content}.
	 * @param ctx the parse tree
	 */
	void exitRef_content(wiki_markupParser.Ref_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#other_tags}.
	 * @param ctx the parse tree
	 */
	void enterOther_tags(wiki_markupParser.Other_tagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#other_tags}.
	 * @param ctx the parse tree
	 */
	void exitOther_tags(wiki_markupParser.Other_tagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#content_other_tags}.
	 * @param ctx the parse tree
	 */
	void enterContent_other_tags(wiki_markupParser.Content_other_tagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#content_other_tags}.
	 * @param ctx the parse tree
	 */
	void exitContent_other_tags(wiki_markupParser.Content_other_tagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(wiki_markupParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(wiki_markupParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#template_element}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_element(wiki_markupParser.Template_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#template_element}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_element(wiki_markupParser.Template_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#ignore_element}.
	 * @param ctx the parse tree
	 */
	void enterIgnore_element(wiki_markupParser.Ignore_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#ignore_element}.
	 * @param ctx the parse tree
	 */
	void exitIgnore_element(wiki_markupParser.Ignore_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#ignore_content}.
	 * @param ctx the parse tree
	 */
	void enterIgnore_content(wiki_markupParser.Ignore_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#ignore_content}.
	 * @param ctx the parse tree
	 */
	void exitIgnore_content(wiki_markupParser.Ignore_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(wiki_markupParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(wiki_markupParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(wiki_markupParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(wiki_markupParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#link_element}.
	 * @param ctx the parse tree
	 */
	void enterLink_element(wiki_markupParser.Link_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#link_element}.
	 * @param ctx the parse tree
	 */
	void exitLink_element(wiki_markupParser.Link_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#url_or_email}.
	 * @param ctx the parse tree
	 */
	void enterUrl_or_email(wiki_markupParser.Url_or_emailContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#url_or_email}.
	 * @param ctx the parse tree
	 */
	void exitUrl_or_email(wiki_markupParser.Url_or_emailContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#content_url_or_email}.
	 * @param ctx the parse tree
	 */
	void enterContent_url_or_email(wiki_markupParser.Content_url_or_emailContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#content_url_or_email}.
	 * @param ctx the parse tree
	 */
	void exitContent_url_or_email(wiki_markupParser.Content_url_or_emailContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(wiki_markupParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(wiki_markupParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#list_element}.
	 * @param ctx the parse tree
	 */
	void enterList_element(wiki_markupParser.List_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#list_element}.
	 * @param ctx the parse tree
	 */
	void exitList_element(wiki_markupParser.List_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(wiki_markupParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(wiki_markupParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#accentuation}.
	 * @param ctx the parse tree
	 */
	void enterAccentuation(wiki_markupParser.AccentuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#accentuation}.
	 * @param ctx the parse tree
	 */
	void exitAccentuation(wiki_markupParser.AccentuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#logical_accentuation}.
	 * @param ctx the parse tree
	 */
	void enterLogical_accentuation(wiki_markupParser.Logical_accentuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#logical_accentuation}.
	 * @param ctx the parse tree
	 */
	void exitLogical_accentuation(wiki_markupParser.Logical_accentuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#structural_accentuation}.
	 * @param ctx the parse tree
	 */
	void enterStructural_accentuation(wiki_markupParser.Structural_accentuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#structural_accentuation}.
	 * @param ctx the parse tree
	 */
	void exitStructural_accentuation(wiki_markupParser.Structural_accentuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#text_accentuation}.
	 * @param ctx the parse tree
	 */
	void enterText_accentuation(wiki_markupParser.Text_accentuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#text_accentuation}.
	 * @param ctx the parse tree
	 */
	void exitText_accentuation(wiki_markupParser.Text_accentuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#headers}.
	 * @param ctx the parse tree
	 */
	void enterHeaders(wiki_markupParser.HeadersContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#headers}.
	 * @param ctx the parse tree
	 */
	void exitHeaders(wiki_markupParser.HeadersContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#contend_header}.
	 * @param ctx the parse tree
	 */
	void enterContend_header(wiki_markupParser.Contend_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#contend_header}.
	 * @param ctx the parse tree
	 */
	void exitContend_header(wiki_markupParser.Contend_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#header1}.
	 * @param ctx the parse tree
	 */
	void enterHeader1(wiki_markupParser.Header1Context ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#header1}.
	 * @param ctx the parse tree
	 */
	void exitHeader1(wiki_markupParser.Header1Context ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#header2}.
	 * @param ctx the parse tree
	 */
	void enterHeader2(wiki_markupParser.Header2Context ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#header2}.
	 * @param ctx the parse tree
	 */
	void exitHeader2(wiki_markupParser.Header2Context ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#header3}.
	 * @param ctx the parse tree
	 */
	void enterHeader3(wiki_markupParser.Header3Context ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#header3}.
	 * @param ctx the parse tree
	 */
	void exitHeader3(wiki_markupParser.Header3Context ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#header4}.
	 * @param ctx the parse tree
	 */
	void enterHeader4(wiki_markupParser.Header4Context ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#header4}.
	 * @param ctx the parse tree
	 */
	void exitHeader4(wiki_markupParser.Header4Context ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#header5}.
	 * @param ctx the parse tree
	 */
	void enterHeader5(wiki_markupParser.Header5Context ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#header5}.
	 * @param ctx the parse tree
	 */
	void exitHeader5(wiki_markupParser.Header5Context ctx);
	/**
	 * Enter a parse tree produced by {@link wiki_markupParser#header6}.
	 * @param ctx the parse tree
	 */
	void enterHeader6(wiki_markupParser.Header6Context ctx);
	/**
	 * Exit a parse tree produced by {@link wiki_markupParser#header6}.
	 * @param ctx the parse tree
	 */
	void exitHeader6(wiki_markupParser.Header6Context ctx);
}