package agh.miak;

import antlr.v4.ScrapperBaseVisitor;
import antlr.v4.ScrapperParser;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.HashSet;
import java.util.Set;

class ScrapperVisitor extends ScrapperBaseVisitor<String> {
    private static final String WEB_REQUESTER = "class WebRequester {static request = new XMLHttpRequest();static parser = new DOMParser();static getRequest(address) {this.request.open('GET', address, false);this.request.send(null);return this.parser.parseFromString(this.request.responseText, 'text/html');}}\n";
    Set<String> variables = new HashSet<>();
    StringBuilder stringBuilder = new StringBuilder();
    boolean request = false;

    @Override
    public String visitProgram(ScrapperParser.ProgramContext ctx) {
        visitChildren(ctx);
        if (request)
            stringBuilder.insert(0, WEB_REQUESTER);
        return stringBuilder.toString();
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
        if (ctx.operable() == null)
            visit(ctx.request());
        else
            visit(ctx.operable());
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
        stringBuilder.append(String.format("for( let %s = ", ctx.VAR().getText()));
        visit(ctx.number(0));
        stringBuilder.append("; i < ");
        visit(ctx.number(1));
        stringBuilder.append(String.format("; i++){%n"));
        visit(ctx.program());
        stringBuilder.append('}');
        return "forLoop";
    }

    @Override
    public String visitOperable(ScrapperParser.OperableContext ctx) {
        visit(ctx.operableSub(0));
        if (!ctx.operable().isEmpty()) {
            stringBuilder.append(String.format(" %s ", ctx.OPERATOR(0).getText()));
            visit(ctx.operable(0));
        }
        return "operable";
    }

    @Override
    public String visitOperableSub(ScrapperParser.OperableSubContext ctx) {
        visitChildren(ctx);
        return "operableSub";
    }

    @Override
    public String visitReplace(ScrapperParser.ReplaceContext ctx) {
        visit(ctx.replaceSub(0));
        stringBuilder.append(".replace(");
        visit(ctx.replaceSub(1));
        stringBuilder.append(", ");
        visit(ctx.replaceSub(2));
        stringBuilder.append(')');
        return "replace";
    }

    @Override
    public String visitReplaceSub(ScrapperParser.ReplaceSubContext ctx) {
        visitChildren(ctx);
        return "replaceSub";
    }

    @Override
    public String visitParse(ScrapperParser.ParseContext ctx) {
        switch (ctx.PARSE_OPTION().getText()) {
            case "INT" -> stringBuilder.append("parseInt(");
            case "FLOAT" -> stringBuilder.append("parseFloat(");
            default -> stringBuilder.append("String(");
        }
        visit(ctx.operable());
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
        visit(ctx.string() != null ?
                ctx.string() :
                ctx.var());
        stringBuilder.append('[');
        visit(ctx.operable());
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
        visit(ctx.operable());
        stringBuilder.append(")").append(System.lineSeparator());
        return "log";
    }
}
