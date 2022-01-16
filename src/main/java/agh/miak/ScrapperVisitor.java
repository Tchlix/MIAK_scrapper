package agh.miak;

import antlr.v4.ScrapperBaseVisitor;
import antlr.v4.ScrapperParser;

import java.util.HashSet;
import java.util.Set;

class ScrapperVisitor extends ScrapperBaseVisitor<Void> {
    private static final String WEB_REQUESTER = String.format("class WebRequester {static request = new XMLHttpRequest();static parser = new DOMParser();static getRequest(address) {this.request.open('GET', address, false);this.request.send(null);return this.parser.parseFromString(this.request.responseText, 'text/html');}}%n%n");
    StringBuilder stringBuilder = new StringBuilder();
    boolean request = false;
    int indentLevel = 0;

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    @Override
    public Void visitStart(ScrapperParser.StartContext ctx) {
        visitChildren(ctx);
        if (request)
            stringBuilder.insert(0, WEB_REQUESTER);
        return null;
    }

    @Override
    public Void visitCodeBlock(ScrapperParser.CodeBlockContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitMainFunction(ScrapperParser.MainFunctionContext ctx) {
        addIndent();
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitGetAttribute(ScrapperParser.GetAttributeContext ctx) {
        visit(ctx.assignable());
        stringBuilder.append(".getAttribute(");
        visit(ctx.string());
        stringBuilder.append(")");
        return null;
    }

    @Override
    public Void visitCreate(ScrapperParser.CreateContext ctx) {
        stringBuilder.append("let ");
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitFchildren(ScrapperParser.FchildrenContext ctx) {
        visitChildren(ctx);
        stringBuilder.append(".children");
        return null;
    }

    @Override
    public Void visitAssignable(ScrapperParser.AssignableContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitAssign(ScrapperParser.AssignContext ctx) {
        visit(ctx.assignable());
        stringBuilder.append(" = ");
        if (ctx.request() != null)
            visit(ctx.request());
        else if (ctx.fchildren() != null)
            visit(ctx.fchildren());
        else
            visit(ctx.operation());
        stringBuilder.append(System.lineSeparator());
        return null;
    }

    @Override
    public Void visitNumber(ScrapperParser.NumberContext ctx) {
        if (ctx.NUMBER() != null)
            stringBuilder.append(ctx.NUMBER().getText());
        else
            visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitForLoop(ScrapperParser.ForLoopContext ctx) {
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
        return null;
    }

    @Override
    public Void visitIfBlock(ScrapperParser.IfBlockContext ctx) {
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
        return null;
    }

    @Override
    public Void visitOperation(ScrapperParser.OperationContext ctx) {
        visit(ctx.operable(0));
        if (!ctx.operation().isEmpty()) {
            stringBuilder.append(String.format(" %s ", ctx.OPERATOR(0).getText()));
            visit(ctx.operation(0));
        }
        return null;
    }

    @Override
    public Void visitOperable(ScrapperParser.OperableContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitReplace(ScrapperParser.ReplaceContext ctx) {
        visit(ctx.string(0));
        stringBuilder.append(".replace(");
        visit(ctx.string(1));
        stringBuilder.append(", ");
        visit(ctx.string(2));
        stringBuilder.append(')');
        return null;
    }

    @Override
    public Void visitParse(ScrapperParser.ParseContext ctx) {
        switch (ctx.PARSE_OPTION().getText()) {
            case "INT" -> stringBuilder.append("parseInt(");
            case "FLOAT" -> stringBuilder.append("parseFloat(");
            default -> stringBuilder.append("String(");
        }
        visit(ctx.operation());
        stringBuilder.append(")");
        return null;
    }

    @Override
    public Void visitInnerText(ScrapperParser.InnerTextContext ctx) {
        visitChildren(ctx);
        stringBuilder.append(".innerText");
        return null;
    }

    @Override
    public Void visitArrayElement(ScrapperParser.ArrayElementContext ctx) {
        visit(ctx.var() != null ? ctx.var() : ctx.fchildren());

        for (ScrapperParser.OperationContext context : ctx.operation()) {
            stringBuilder.append('[');
            visit(context);
            stringBuilder.append(']');
        }
        return null;
    }

    @Override
    public Void visitLength(ScrapperParser.LengthContext ctx) {
        visitChildren(ctx);
        stringBuilder.append(".length");
        return null;
    }

    @Override
    public Void visitPrimitive(ScrapperParser.PrimitiveContext ctx) {
        stringBuilder.append(ctx.getText());
        return null;
    }

    @Override
    public Void visitString(ScrapperParser.StringContext ctx) {
        stringBuilder.append(ctx.getText());
        return null;
    }

    @Override
    public Void visitVar(ScrapperParser.VarContext ctx) {
        stringBuilder.append(ctx.getText());
        return null;
    }

    @Override
    public Void visitElements(ScrapperParser.ElementsContext ctx) {

        if (ctx.documents() == null)
            stringBuilder.append("document");
        else
            visit(ctx.documents());

        stringBuilder.append(".getElementsBy").append(
                ctx.ELEMENTS_TYPE().getText().equals("CLASS NAME") ?
                        "ClassName" :
                        "TagName"
        ).append('(').append(ctx.string().getText()).append(')');
        return null;
    }

    @Override
    public Void visitDocuments(ScrapperParser.DocumentsContext ctx) {
        if (ctx.VAR() != null)
            stringBuilder.append(ctx.VAR().getText());
        else
            visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitRequest(ScrapperParser.RequestContext ctx) {
        request = true;
        stringBuilder.append("WebRequester.getRequest(");
        visitChildren(ctx);
        stringBuilder.append(')');
        return null;
    }

    @Override
    public Void visitLog(ScrapperParser.LogContext ctx) {
        stringBuilder.append("console.log(");
        visit(ctx.operation());
        stringBuilder.append(")").append(System.lineSeparator());
        return null;
    }

    private void addIndent() {
        stringBuilder.append("\t".repeat(indentLevel));
    }
}
