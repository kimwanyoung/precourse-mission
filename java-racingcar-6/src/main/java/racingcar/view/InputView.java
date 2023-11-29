package racingcar.view;

import java.util.List;
import racingcar.utils.Converter;

public class InputView {

    private final Printer printer;
    private final Reader reader;

    public InputView(Printer printer, Reader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public List<String> getCarNames() {
        String names = reader.read();
        return Converter.convertNames(names);
    }

    public int attempts() {
        try {
            String attempts = reader.read();
            return Integer.parseInt(attempts);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException();
        }


    }
}
