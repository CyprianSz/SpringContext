package com.codecool.scc.factories;

import com.codecool.scc.enums.OutputFormat;
import com.codecool.scc.implementations.JsonOutputFormatter;
import com.codecool.scc.services.OutputFormatter;
import com.codecool.scc.implementations.TableOutputFormatter;
import com.codecool.scc.implementations.XmlOutputFormatter;
import com.sun.media.sound.InvalidFormatException;
import org.springframework.stereotype.Component;

@Component
public class OutputFormatterFactory {
    public OutputFormatter createByFormat(OutputFormat outputFormat) throws InvalidFormatException {
        switch (outputFormat) {
            case JSON:
                return new JsonOutputFormatter();
            case XML:
                return new XmlOutputFormatter();
            case TABLE:
                return new TableOutputFormatter();
            default:
                throw new InvalidFormatException(  );
        }
    }
}
