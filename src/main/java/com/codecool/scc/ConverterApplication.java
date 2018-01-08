package com.codecool.scc;

import java.io.File;

public class ConverterApplication {

    public static void main(String[] args) {

        SimpleCsvConverter simpleCsvConverter = new SimpleCsvConverter();

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
