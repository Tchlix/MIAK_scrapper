package agh.miak;

import antlr.v4.ScrapperBaseVisitor;
import antlr.v4.ScrapperParser;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.HashSet;
import java.util.Set;

class ScrapperVisitor extends ScrapperBaseVisitor<String> {
    private static final String WEB_REQUESTER = String.format("class WebRequester {static request = new XMLHttpRequest();static parser = new DOMParser();static getRequest(address) {this.request.open('GET', address, false);this.request.send(null);return this.parser.parseFromString(this.request.responseText, 'text/html');}}%n%n");
    Set<String> variables = new HashSet<>();
    StringBuilder stringBuilder = new StringBuilder();
    boolean request = false;
    int indentLevel = 0;

    @Override
    public String visitStart(ScrapperParser.StartContext ctx) {
        visitChildren(ctx);
        if (request)
            stringBuilder.insert(0, WEB_REQUESTER);
        return stringBuilder.toString();
    }

    @Override
    public String visitCodeBlock(ScrapperParser.CodeBlockContext ctx) {
        visitChildren(ctx);
        return "program";
    }

    @Override
    public String visitMainFunction(ScrapperParser.MainFunctionContext ctx) {
        addIndent();
        visitChildren(ctx);
        return "mainFunction";
    }

    @Override
    public String visitGetAttribute(ScrapperParser.GetAttributeContext ctx) {
        //TODO better
        visit(ctx.var() != null ?
                ctx.var() :
                ctx.arrayElement());
        stringBuilder.append(".getAttribute(");
        visit(ctx.string());
        stringBuilder.append(")");
        return "getAttribute";
    }

    @Override
    public String visitCreate(ScrapperParser.CreateContext ctx) {
        if (!variables.add(ctx.assign().var().getText()))
            throw new ParseCancellationException(String.format("Identifier %s has already been declared", ctx.assign().var().getText()));
        stringBuilder.append("let ");
        visitChildren(ctx);
        return "create";
    }

    @Override
    public String visitAssign(ScrapperParser.AssignContext ctx) {
        //TODO better ?
        visit(ctx.var() != null ?
                ctx.var() :
                ctx.arrayElement());
        stringBuilder.append(" = ");
        if (ctx.operation() == null)
            visit(ctx.request());
        else
            visit(ctx.operation());
        stringBuilder.append(System.lineSeparator());
        return "assign";
    }

    @Override
    public String visitNumber(ScrapperParser.NumberContext ctx) {
        if (ctx.NUMBER() != null)
            stringBuilder.append(ctx.NUMBER().getText());
        else
            visitChildren(ctx);
        return "number";
    }

    @Override
    public String visitForLoop(ScrapperParser.ForLoopContext ctx) {
        String loopVarName = ctx.VAR().getText();
        stringBuilder.append(String.format("for( let %s = ", loopVarName));
        visit(ctx.number(0));
        stringBuilder.append(String.format("; %s < ", loopVarName));
        visit(ctx.number(1));
        stringBuilder.append(String.format("; %s++){%n", loopVarName));
        indentLevel++;
        visit(ctx.codeBlock());
        indentLevel--;
        addIndent();
        stringBuilder.append(String.format("}%n"));
        return "forLoop";
    }

    @Override
    public String visitIfBlock(ScrapperParser.IfBlockContext ctx) {
        stringBuilder.append("if( ");
        visit(ctx.operable(0));
        stringBuilder.append(String.format(" %s ", ctx.IF_OPERATOR().getText()));
        visit(ctx.operable(1));
        stringBuilder.append(String.format(" ){%n"));
        indentLevel++;
        visit(ctx.codeBlock());
        indentLevel--;
        addIndent();
        stringBuilder.append(String.format("}%n"));
        return "forLoop";
    }

    @Override
    public String visitOperation(ScrapperParser.OperationContext ctx) {
        visit(ctx.operable(0));
        if (!ctx.operation().isEmpty()) {
            stringBuilder.append(String.format(" %s ", ctx.OPERATOR(0).getText()));
            visit(ctx.operation(0));
        }
        return "operable";
    }

    @Override
    public String visitOperable(ScrapperParser.OperableContext ctx) {
        visitChildren(ctx);
        return "operableSub";
    }

    @Override
    public String visitReplace(ScrapperParser.ReplaceContext ctx) {
        visit(ctx.string(0));
        stringBuilder.append(".replace(");
        visit(ctx.string(1));
        stringBuilder.append(", ");
        visit(ctx.string(2));
        stringBuilder.append(')');
        return "replace";
    }

    @Override
    public String visitParse(ScrapperParser.ParseContext ctx) {
        switch (ctx.PARSE_OPTION().getText()) {
            case "INT" -> stringBuilder.append("parseInt(");
            case "FLOAT" -> stringBuilder.append("parseFloat(");
            default -> stringBuilder.append("String(");
        }
        visit(ctx.operation());
        stringBuilder.append(")");
        return "parse";
    }

    @Override
    public String visitInnerText(ScrapperParser.InnerTextContext ctx) {
        visitChildren(ctx);
        stringBuilder.append(".innerText");
        return "innerText";
    }

    @Override
    public String visitArrayElement(ScrapperParser.ArrayElementContext ctx) {
        visit(ctx.var());
        stringBuilder.append('[');
        visit(ctx.operation());
        stringBuilder.append(']');
        return "arrayElement";
    }

    @Override
    public String visitLength(ScrapperParser.LengthContext ctx) {
        visitChildren(ctx);
        stringBuilder.append(".length");
        return "primitive";
    }

    @Override
    public String visitPrimitive(ScrapperParser.PrimitiveContext ctx) {
        stringBuilder.append(ctx.getText());
        return "primitive";
    }

    @Override
    public String visitString(ScrapperParser.StringContext ctx) {
        stringBuilder.append(ctx.getText());
        return "string";
    }

    @Override
    public String visitVar(ScrapperParser.VarContext ctx) {
        //TODO production only
        //if(!variables.contains(ctx.getText()))
        //    throw new ParseCancellationException("Unknown variable " + ctx.getText());
        stringBuilder.append(ctx.getText());
        return "var";
    }

    @Override
    public String visitElements(ScrapperParser.ElementsContext ctx) {

        if (ctx.documents() == null)
            stringBuilder.append("document");
        else
            visit(ctx.documents());

        stringBuilder.append(".getElementsBy").append(
                ctx.ELEMENTS_TYPE().getText().equals("CLASS NAME") ?
                        "ClassName" :
                        "TagName"
        ).append('(').append(ctx.string().getText()).append(')');
        return "elements";
    }

    @Override
    public String visitDocuments(ScrapperParser.DocumentsContext ctx) {
        if (ctx.VAR() != null)
            stringBuilder.append(ctx.VAR().getText());
        else
            visitChildren(ctx);
        return "elementsSub";
    }

    @Override
    public String visitRequest(ScrapperParser.RequestContext ctx) {
        request = true;
        stringBuilder.append("WebRequester.getRequest(");
        visitChildren(ctx);
        stringBuilder.append(')');
        return "request";
    }

    @Override
    public String visitLog(ScrapperParser.LogContext ctx) {
        stringBuilder.append("console.log(");
        visit(ctx.operation());
        stringBuilder.append(")").append(System.lineSeparator());
        return "log";
    }

    private void addIndent() {
        stringBuilder.append("\t".repeat(indentLevel));
    }
}
