package baseball.view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private final Reader reader;
    private final Printer printer;

    public InputView(Reader reader, Printer printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public List<Integer> getBaseballNumberFromInput() {
        try {
            printer.printf("숫자를 입력해 주세요 : ");
            String input = reader.read();
            return Arrays.stream(input.split(""))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException();
        }
    }

    public String getUserChoice() {
        printer.println("재시작: 1, 종료: 2");
        return reader.read();
    }
}
