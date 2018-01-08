package com.codecool.scc;

import java.io.File;

public class SimpleCsvConverter {

    private FileReader fileReader;
    private OutputFormatterFactory outputFormatterFactory;

    public SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {
        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    void convert(File file, OutputFormat outputFormat) {
        OutputFormatter of = outputFormatterFactory.createByFormat( outputFormat );
        
    }

    void convert(File file) {
        this.convert(file, OutputFormat.TABLE);
    }
}
