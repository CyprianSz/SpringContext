package com.codecool.scc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;

public class ConverterApplication {

    public static void main(String[] args) throws FileNotFoundException {

        // TUTAJ Obsłużyć wyjątki: IllegalArgumentException (jak źle poda nazwe formatu)
        // FileNotFoundException jak nie znajdzie pliku

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        FileReader fileReader = new com.codecool.scc.FileReader();
//        FileReader fileReader = (FileReader) ctx.getBean("fileReader");
//        OutputFormatterFactory outputFormatterFactory = new com.codecool.scc.OutputFormatterFactory();
//        OutputFormatterFactory outputFormatterFactory = (OutputFormatterFactory) ctx.getBean( "outputFormatterFactory" );
//        SimpleCsvConverter simpleCsvConverter = new com.codecool.scc.SimpleCsvConverter(fileReader, outputFormatterFactory);
        SimpleCsvConverter simpleCsvConverter = (SimpleCsvConverter) ctx.getBean("simpleCsvConverter");

        if (args.length == 0) {
            System.out.println("No input file defined");
        } else if (args.length == 1) {
            File file = new File(args[0]);
            simpleCsvConverter.convert( file );
        } else if (args.length == 2) {
            com.codecool.scc.OutputFormat outputFormat = Enum.valueOf( com.codecool.scc.OutputFormat.class, args[0].toUpperCase());
            File file = new File(args[1]);
            simpleCsvConverter.convert( file, outputFormat );
        }
    }
}
