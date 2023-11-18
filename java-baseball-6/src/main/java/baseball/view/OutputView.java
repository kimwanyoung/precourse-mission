package baseball.view;

import java.util.Map;

public class OutputView {

    private final Printer printer;

    public OutputView(Printer printer) {
        this.printer = printer;
    }

    public void displayBaseballResult(Map<String, Integer> baseballResult) {
        int strike = baseballResult.getOrDefault("스트라이크", 0);
        int ball = baseballResult.getOrDefault("볼", 0);
        if (strike == 0 && ball == 0) {
            printer.println("낫싱");
            return;
        }
        String strikeFormat = calculateResultFormat(strike, "스트라이크");
        String ballFormat = calculateResultFormat(ball, "볼");
        printer.println(ballFormat + " " + strikeFormat);
    }

    private String calculateResultFormat(int score, String scoreKey) {
        if (score > 0) {
            return score + scoreKey;
        }
    }
}
