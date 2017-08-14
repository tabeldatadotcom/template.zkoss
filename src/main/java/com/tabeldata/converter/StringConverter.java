package com.tabeldata.converter;

public class StringConverter {

    public static boolean isNotNull(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
