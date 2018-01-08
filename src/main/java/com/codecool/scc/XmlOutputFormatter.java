package com.codecool.scc;

import java.util.List;

import com.thoughtworks.xstream.XStream;

public class XmlOutputFormatter implements OutputFormatter {

    public void printToConsole(List<String[]> data) {

        XStream xstream = new XStream();
        String x = xstream.toXML(data);

        System.out.println(x);
    }
}