package com.codecool.scc.enums;

public enum OutputFormat {
    JSON,
    XML,
    TABLE;

    public static OutputFormat getFormat(String name) {
        return Enum.valueOf(OutputFormat.class, name.toUpperCase());
    }
}
