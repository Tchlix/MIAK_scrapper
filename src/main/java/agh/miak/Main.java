package agh.miak;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("No arguments !");
            return;
        }

        CharStream input;
        try {
            input = CharStreams.fromFileName(args[0]);
        } catch (IOException e) {
            System.err.println("Couldn't open file " + e.getMessage());
            return;
        }

        Scrapper letter = new Scrapper(input);
        String output = "";
        try {
            output = letter.parse();
            System.out.println(output);
        } catch (ParseCancellationException e) {
            System.err.println("Parsing cancelled");
        }
    }
}
