package agh.miak;

import antlr.v4.ScrapperLexer;
import antlr.v4.ScrapperParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public record Scrapper(CharStream input) {
    public String parse() {
        ScrapperLexer lexer = new ScrapperLexer(input);
        ScrapperParser parser = new ScrapperParser(
                new CommonTokenStream(lexer)
        );
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        return new ScrapperVisitor().visit(parser.start());
    }
}
