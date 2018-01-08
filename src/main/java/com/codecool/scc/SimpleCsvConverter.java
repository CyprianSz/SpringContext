package com.codecool.scc;

import java.io.File;

public class SimpleCsvConverter {

    private FileReader fileReader;

    public SimpleCsvConverter(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    void convert(File file, OutputFormat outputFormat) {
        System.out.println("I convert CSV to output format");
    }

    void convert(File file) {
        this.convert(file, OutputFormat.TABLE);
    }
}
