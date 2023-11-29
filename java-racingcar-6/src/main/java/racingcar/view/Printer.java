package racingcar.view;

import java.util.Objects;

public interface Printer {

    void printf(String message, Object... args);
    void println(Object message);
    void println();
}
