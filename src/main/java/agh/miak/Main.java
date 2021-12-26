package agh.miak;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

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
            System.out.println(e.getMessage());
            return;
        }

        Scrapper letter = new Scrapper(input);
        var output = letter.parse();
        System.out.println(output);
    }
}
