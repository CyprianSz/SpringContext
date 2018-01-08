package com.codecool.scc;

import java.io.File;
import java.io.FileNotFoundException;

public class ConverterApplication {

    public static void main(String[] args) throws FileNotFoundException {
        
        // TUTAJ Obsłużyć wyjątki: IllegalArgumentException (jak źle poda nazwe formatu)
        // FileNotFoundException jak nie znajdzie pliku

        FileReader fileReader = new FileReader();
        OutputFormatterFactory outputFormatterFactory = new OutputFormatterFactory();
        SimpleCsvConverter simpleCsvConverter = new SimpleCsvConverter(fileReader, outputFormatterFactory);

        if (args.length == 0) {
            System.out.println("No input file defined");
        } else if (args.length == 1) {
            File file = new File(args[0]);
            simpleCsvConverter.convert( file );
        } else if (args.length == 2) {
            OutputFormat outputFormat = Enum.valueOf(OutputFormat.class, args[0].toUpperCase());
            File file = new File(args[1]);
            simpleCsvConverter.convert( file, outputFormat );
        }
    }
}
