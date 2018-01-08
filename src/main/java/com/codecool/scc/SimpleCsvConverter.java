package com.codecool.scc;

import java.io.File;

public class SimpleCsvConverter {
    void convert(File file, OutputFormat outputFormat) {
        System.out.println("I convert CSV to output format");
    }

    void convert(File file) {
        this.convert(file, OutputFormat.TABLE);
    }
}
