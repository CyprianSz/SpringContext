package com.codecool.scc;

import org.springframework.stereotype.Component;

@Component
class OutputFormatterFactory {
    OutputFormatter createByFormat(OutputFormat outputFormat) {
        switch (outputFormat) {
            case JSON:
                return new JsonOutputFormatter();
            case XML:
                return new XmlOutputFormatter();
            case TABLE:
                return new TableOutputFormatter();
        }
        return null;
    }
}
