package com.codecool.scc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;

public class ConverterApplication {

    public static void main(String[] args) throws FileNotFoundException {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
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
