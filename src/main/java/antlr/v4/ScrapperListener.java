// Generated from C:/Users/Tchlix/Desktop/TW/1DMeshParallel-master/MIAK_scrapper/src/main/resources/antlr/v4\Scrapper.g4 by ANTLR 4.9.2
package antlr.v4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScrapperParser}.
 */
public interface ScrapperListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ScrapperParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ScrapperParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(ScrapperParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(ScrapperParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(ScrapperParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(ScrapperParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(ScrapperParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(ScrapperParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ScrapperParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ScrapperParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(ScrapperParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(ScrapperParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(ScrapperParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(ScrapperParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ScrapperParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ScrapperParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(ScrapperParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(ScrapperParser.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#fchildren}.
	 * @param ctx the parse tree
	 */
	void enterFchildren(ScrapperParser.FchildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#fchildren}.
	 * @param ctx the parse tree
	 */
	void exitFchildren(ScrapperParser.FchildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ScrapperParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ScrapperParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ScrapperParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ScrapperParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#getAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGetAttribute(ScrapperParser.GetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#getAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGetAttribute(ScrapperParser.GetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#innerText}.
	 * @param ctx the parse tree
	 */
	void enterInnerText(ScrapperParser.InnerTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#innerText}.
	 * @param ctx the parse tree
	 */
	void exitInnerText(ScrapperParser.InnerTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(ScrapperParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(ScrapperParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(ScrapperParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(ScrapperParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ScrapperParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ScrapperParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ScrapperParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ScrapperParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(ScrapperParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(ScrapperParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#operable}.
	 * @param ctx the parse tree
	 */
	void enterOperable(ScrapperParser.OperableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#operable}.
	 * @param ctx the parse tree
	 */
	void exitOperable(ScrapperParser.OperableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(ScrapperParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(ScrapperParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(ScrapperParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(ScrapperParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(ScrapperParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(ScrapperParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#documents}.
	 * @param ctx the parse tree
	 */
	void enterDocuments(ScrapperParser.DocumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#documents}.
	 * @param ctx the parse tree
	 */
	void exitDocuments(ScrapperParser.DocumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScrapperParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ScrapperParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScrapperParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ScrapperParser.VarContext ctx);
}