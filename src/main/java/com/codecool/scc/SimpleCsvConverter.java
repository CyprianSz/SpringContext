package com.codecool.scc;

import com.codecool.scc.enums.OutputFormat;
import com.codecool.scc.factories.OutputFormatterFactory;
import com.codecool.scc.services.OutputFormatter;
import com.sun.media.sound.InvalidFormatException;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

@Component
public class SimpleCsvConverter {

    private FileReader fileReader;
    private OutputFormatterFactory outputFormatterFactory;

    public SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {
        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    public void convert(File file, OutputFormat outputFormat) throws FileNotFoundException, InvalidFormatException {
        OutputFormatter of = outputFormatterFactory.createByFormat( outputFormat );
        List<String[]> data = fileReader.readData(file);

        of.printToConsole( data );
    }

    public void convert(File file) throws FileNotFoundException, InvalidFormatException {
        this.convert(file, OutputFormat.TABLE);
    }
}
