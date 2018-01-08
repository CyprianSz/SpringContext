package com.codecool.scc;

import java.io.OutputStream;

public class OutputFormatterFactory {
    public OutputFormatter createByFormat(OutputFormat outputFormat) {
        switch (outputFormat) {
            case JSON:
                return new JsonOutputFormatter();
            case XML:
                return new XmlOutputFormatter();
            case TABLE:
                return new TableOutputFormatter();
        }
    }
}
