package com.codecool.scc;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverterApplication {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No input file defined");
        } else if (args.length == 1) {
            Path filePath = Paths.get(args[0]);
        } else if (args.length == 2) {

            Path filePath = Paths.get(args[1]);
        }
    }
}
