package racingcar.view;

import java.util.Map;
import java.util.Map.Entry;
import racingcar.domain.RacingResultDto;

public class OutputView {

    private static final String RESULT_MESSAGE_FORMAT = "%s : %s\n";
    private static final String DASH = "-";
    private final Printer printer;

    public OutputView(Printer printer) {
        this.printer = printer;
    }

    public void displayRacingResult(RacingResultDto racingResultDto) {
        Map<String, Integer> racingResult = racingResultDto.getRacingResult();
        for(Entry<String, Integer> result : racingResult.entrySet()) {
            printer.printf(RESULT_MESSAGE_FORMAT, result.getKey(), DASH.repeat(result.getValue()));
        }
        printer.println();
    }
}
