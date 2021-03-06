package com.codecool.scc.implementations;

import com.codecool.scc.services.OutputFormatter;
import org.json.simple.JSONObject;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter {

    public void printToConsole(List<String[]> data) {
        JSONObject json = new JSONObject();
        String[] headers = data.get(0);

        for (int i = 1; i < data.size(); i++) {
            for (int j = 0; j < headers.length; j++) {
                json.put(headers[j], data.get(i)[j]);
            }
            System.out.println(json);
        }
    }
}