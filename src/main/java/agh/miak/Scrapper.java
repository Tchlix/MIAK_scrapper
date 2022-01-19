package agh.miak;

import antlr.v4.ScrapperLexer;
import antlr.v4.ScrapperParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public record Scrapper(CharStream input) {
    public String parse() throws ParseCancellationException {
        ScrapperLexer lexer = new ScrapperLexer(input);
        ScrapperParser parser = new ScrapperParser(
                new CommonTokenStream(lexer)
        );
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        var visitor = new ScrapperVisitor();
        visitor.visit(parser.start());
        return visitor.toString();
    }
}
