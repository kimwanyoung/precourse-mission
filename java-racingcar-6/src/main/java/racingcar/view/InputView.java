package racingcar.view;

import java.util.List;
import racingcar.utils.Converter;

public class InputView {

    private static final String INPUT_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ATTEMPTS_MESSAGE = "시도할 회수는 몇회인가요?";
    private final Printer printer;
    private final Reader reader;

    public InputView(Printer printer, Reader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public List<String> getCarNames() {
        printer.println(INPUT_NAMES_MESSAGE);
        String names = reader.read();
        return Converter.convertNames(names);
    }

    public int attempts() {
        printer.println(INPUT_ATTEMPTS_MESSAGE);
        try {
            String attempts = reader.read();
            return Integer.parseInt(attempts);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException();
        }


    }
}
