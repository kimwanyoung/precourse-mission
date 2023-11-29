package racingcar.view;

import java.util.Objects;

public class DefaultPrinter implements Printer {

    @Override
    public void printf(String message, Object... args) {
        System.out.printf(message, args);
    }

    @Override
    public void println(Object message) {
        System.out.println(message);
    }

    @Override
    public void println() {
        System.out.println();
    }
}
