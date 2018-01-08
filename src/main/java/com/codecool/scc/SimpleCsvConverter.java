package com.codecool.scc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

class SimpleCsvConverter {

    private FileReader fileReader;
    private OutputFormatterFactory outputFormatterFactory;

    SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {
        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    void convert(File file, OutputFormat outputFormat) throws FileNotFoundException {
        OutputFormatter of = outputFormatterFactory.createByFormat( outputFormat );
        List<String[]> data = fileReader.readData(file);

        of.printToConsole( data );
    }

    void convert(File file) throws FileNotFoundException {
        this.convert(file, OutputFormat.TABLE);
    }
}
