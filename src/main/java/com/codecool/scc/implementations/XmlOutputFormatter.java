package com.codecool.scc.implementations;

import java.util.List;

import com.codecool.scc.services.OutputFormatter;

public class XmlOutputFormatter implements OutputFormatter {

    public void printToConsole(List<String[]> data) {
        StringBuilder output = new StringBuilder();
        String[] labels = data.get(0);
        List<String[]> content = data.subList( 1, data.size() );

        output.append(formatToXML(content, labels));
        System.out.println(output);
    }

    private String formatToXML(List<String[]> data, String[] labels) {
        StringBuilder result = new StringBuilder();
        for(String[] record : data) {
            result.append(createEntity(record, labels));
        }
        return result.toString();
    }

    private String createEntity(String[] record, String[] labels) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < labels.length; i++) {
            String value = record[i];
            String label = labels[i];
            String row = createRow(value, label);
            result.append(row);
        }

        return result.toString();
    }

    private String createRow(String value, String label) {
        return "<" + label + ">" + value + "</" + label + ">\n";
    }
}