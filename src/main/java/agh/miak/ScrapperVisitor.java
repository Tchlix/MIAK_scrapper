package agh.miak;

import antlr.v4.ScrapperBaseVisitor;
import antlr.v4.ScrapperParser;

class ScrapperVisitor extends ScrapperBaseVisitor<String> {
    StringBuilder stringBuilder = new StringBuilder();

    @Override
    public String visitProgram(ScrapperParser.ProgramContext ctx) {
        visitChildren(ctx);
        return stringBuilder.toString();
    }

    @Override
    public String visitCreate(ScrapperParser.CreateContext ctx) {
        stringBuilder.append("var ");
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
        visit(ctx.operable());
        stringBuilder.append(System.lineSeparator());
        return "assign";
    }

    @Override
    public String visitOperable(ScrapperParser.OperableContext ctx) {
        if (!ctx.operable().isEmpty()) {
            //TODO find better way
            visitOperableOptions(ctx);
            stringBuilder.append(String.format(" %s ", ctx.OPERATOR(0).getText()));
            visit(ctx.operable(0));
        } else
            visitOperableOptions(ctx);
        return "operable";
    }

    private void visitOperableOptions(ScrapperParser.OperableContext ctx) {
        if (!ctx.primitive().isEmpty())
            visit(ctx.primitive(0));
        else if (!ctx.elements().isEmpty())
            visit(ctx.elements(0));
        else if (!ctx.parse().isEmpty())
            visit(ctx.parse(0));
        else if (!ctx.arrayElement().isEmpty())
            visit(ctx.arrayElement(0));
        else if (!ctx.innerText().isEmpty())
            visit(ctx.innerText(0));
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
        stringBuilder.append(ctx.getText());
        return "var";
    }

    @Override
    public String visitElements(ScrapperParser.ElementsContext ctx) {
        stringBuilder.append("document.getElementsBy").append(
                ctx.ELEMENTS_TYPE().getText().equals("CLASS NAME") ?
                        "ClassName" :
                        "TagName"
        ).append('(').append(ctx.string().getText()).append(')');
        return "elements";
    }

    @Override
    public String visitLog(ScrapperParser.LogContext ctx) {
        stringBuilder.append("console.log(");
        visit(ctx.operable());
        stringBuilder.append(")").append(System.lineSeparator());
        return "log";
    }
}
