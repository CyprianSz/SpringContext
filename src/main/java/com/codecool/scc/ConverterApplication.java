package com.codecool.scc;

import com.codecool.scc.helpers.InputManager;
import com.sun.media.sound.InvalidFormatException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;

public class ConverterApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SimpleCsvConverter simpleCsvConverter = (SimpleCsvConverter) ctx.getBean("simpleCsvConverter");
        InputManager inputManager = (InputManager) ctx.getBean("inputManager");

        try {
            inputManager.manageArguments( args, simpleCsvConverter );
        } catch (FileNotFoundException e) {
            System.out.println("Given file does not exists");
            e.printStackTrace();
        } catch (IllegalArgumentException | InvalidFormatException e) {
            System.out.println("Format not supported");
            e.printStackTrace();
        }
    }
}
