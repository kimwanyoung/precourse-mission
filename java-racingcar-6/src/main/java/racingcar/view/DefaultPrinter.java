package racingcar.view;

import java.util.Objects;

public class DefaultPrinter implements Printer {

    @Override
    public void printf(String message, Object... args) {
        System.out.printf(message, args);
    }

    @Override
    public void println(String message) {
        System.out.println(message);
    }
}
