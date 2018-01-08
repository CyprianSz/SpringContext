package com.codecool.scc;


import java.util.List;

public class TableOutputFormatter implements OutputFormatter {

    public void printToConsole(List<String[]> data) {

        String[] headers = data.get(0);

        for (int i = 1; i < data.size(); i++) {
            for (int j = 0; j < headers.length; j++) {
                System.out.println(headers[j] + ": " + data.get(i)[j]);
            }
        }
    }
}
