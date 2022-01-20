// Generated from C:/Users/Tchlix/Desktop/TW/1DMeshParallel-master/MIAK_scrapper/src/main/resources/antlr/v4\Scrapper.g4 by ANTLR 4.9.2
package antlr.v4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScrapperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScrapperVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ScrapperParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(ScrapperParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(ScrapperParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(ScrapperParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ScrapperParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(ScrapperParser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(ScrapperParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ScrapperParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace(ScrapperParser.ReplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#fchildren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFchildren(ScrapperParser.FchildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ScrapperParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ScrapperParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#getAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAttribute(ScrapperParser.GetAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#innerText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerText(ScrapperParser.InnerTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(ScrapperParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(ScrapperParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ScrapperParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ScrapperParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(ScrapperParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#operable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperable(ScrapperParser.OperableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(ScrapperParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(ScrapperParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(ScrapperParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#documents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocuments(ScrapperParser.DocumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScrapperParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ScrapperParser.VarContext ctx);
}