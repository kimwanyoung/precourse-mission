package racingcar.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import racingcar.domain.RacingResultDto;

public class OutputView {

    private static final String RESULT_MESSAGE_FORMAT = "%s : %s\n";
    private static final String FINAL_WINNER_FORMAT = "최종 우승자 : %s";
    private static final String DASH = "-";
    private final Printer printer;

    public OutputView(Printer printer) {
        this.printer = printer;
    }

    public void displayRacingResult(RacingResultDto racingResultDto) {
        Map<String, Integer> racingResult = racingResultDto.getRacingResult();
        for (Entry<String, Integer> result : racingResult.entrySet()) {
            printer.printf(RESULT_MESSAGE_FORMAT, result.getKey(), DASH.repeat(result.getValue()));
        }
        printer.println();
    }

    public void displayFinalWinner(RacingResultDto racingResultDto) {
        int max = getMaxMoveTimes(racingResultDto);
        Map<String, Integer> racingResult = racingResultDto.getRacingResult();
        List<String> finalWinners = new ArrayList<>();
        for (Entry<String, Integer> result : racingResult.entrySet()) {
            if (max == result.getValue()) {
                finalWinners.add(result.getKey());
            }
        }

        printer.printf(FINAL_WINNER_FORMAT, String.join(",", finalWinners));
    }

    private int getMaxMoveTimes(RacingResultDto racingResultDto) {
        int max = 0;
        Map<String, Integer> racingResult = racingResultDto.getRacingResult();
        for (int moveTimes : racingResult.values()) {
            if (max <= moveTimes) {
                max = moveTimes;
            }
        }
        return max;
    }
}
