package com.codecool.scc;

import com.codecool.scc.helpers.InputManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;

public class ConverterApplication {

    public static void main(String[] args) {

        InputManager inputManager = new InputManager();

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SimpleCsvConverter simpleCsvConverter = (SimpleCsvConverter) ctx.getBean("simpleCsvConverter");

        try {
            inputManager.manageArguments( args, simpleCsvConverter );
        } catch (FileNotFoundException e) {
            System.out.println("Given file does not exists");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Format not supported");
            e.printStackTrace();
        }
    }
}
