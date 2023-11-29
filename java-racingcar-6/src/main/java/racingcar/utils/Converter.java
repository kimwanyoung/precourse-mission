package racingcar.utils;

import java.util.Arrays;
import java.util.List;

public final class Converter {

    private static final String SEPARATOR = ",";

    private Converter(){
    }

    public static List<String> convertNames(String names) {
        return Arrays.stream(names.split(SEPARATOR)).toList();
    }
}
