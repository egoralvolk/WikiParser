// Generated from D:/Git/Парсер Викиразмертки\wiki_markup.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link wiki_markupParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface wiki_markupVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#wiki_article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWiki_article(wiki_markupParser.Wiki_articleContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#elements_markup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements_markup(wiki_markupParser.Elements_markupContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(wiki_markupParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(wiki_markupParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#text_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_comment(wiki_markupParser.Text_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#nowiki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNowiki(wiki_markupParser.NowikiContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(wiki_markupParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#syntaxhighlight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntaxhighlight(wiki_markupParser.SyntaxhighlightContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre(wiki_markupParser.PreContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(wiki_markupParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#ref_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_name(wiki_markupParser.Ref_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#ref_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_content(wiki_markupParser.Ref_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#other_tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_tags(wiki_markupParser.Other_tagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#content_other_tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_other_tags(wiki_markupParser.Content_other_tagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(wiki_markupParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#template_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_element(wiki_markupParser.Template_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#ignore_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore_element(wiki_markupParser.Ignore_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#ignore_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore_content(wiki_markupParser.Ignore_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(wiki_markupParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(wiki_markupParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#link_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_element(wiki_markupParser.Link_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#url_or_email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl_or_email(wiki_markupParser.Url_or_emailContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#content_url_or_email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent_url_or_email(wiki_markupParser.Content_url_or_emailContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(wiki_markupParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_element(wiki_markupParser.List_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(wiki_markupParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#accentuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccentuation(wiki_markupParser.AccentuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#logical_accentuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_accentuation(wiki_markupParser.Logical_accentuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#structural_accentuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructural_accentuation(wiki_markupParser.Structural_accentuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#text_accentuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_accentuation(wiki_markupParser.Text_accentuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#headers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaders(wiki_markupParser.HeadersContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#contend_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContend_header(wiki_markupParser.Contend_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#header1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader1(wiki_markupParser.Header1Context ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#header2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader2(wiki_markupParser.Header2Context ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#header3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader3(wiki_markupParser.Header3Context ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#header4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader4(wiki_markupParser.Header4Context ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#header5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader5(wiki_markupParser.Header5Context ctx);
	/**
	 * Visit a parse tree produced by {@link wiki_markupParser#header6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader6(wiki_markupParser.Header6Context ctx);
}