package com.codecool.scc.helpers;

import com.codecool.scc.SimpleCsvConverter;
import com.codecool.scc.enums.OutputFormat;
import com.sun.media.sound.InvalidFormatException;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;

@Component
public class InputManager {

    public void manageArguments(String[] args, SimpleCsvConverter simpleCsvConverter) throws FileNotFoundException, InvalidFormatException {
        if (args.length == 0) {
            System.out.println("No input file defined");
        } else if (args.length == 1) {
            File file = new File(args[0]);
            simpleCsvConverter.convert( file );
        } else if (args.length == 2) {
            OutputFormat outputFormat = OutputFormat.getFormat(args[0]);
            File file = new File(args[1]);
            simpleCsvConverter.convert( file, outputFormat );
        }
    }
}
