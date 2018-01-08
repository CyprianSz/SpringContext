package com.codecool.scc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FileReader {

    List<String[]> readData(File file) throws FileNotFoundException {
        List<String[]> data = new ArrayList<>();

        Scanner fileContent = new Scanner(file);

        while (fileContent.hasNextLine()) {
            String[] line = fileContent.nextLine().split(",");
            data.add(line);
        }
        return data;
    }

}
