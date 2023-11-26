package baseball.view;

import baseball.domain.GameScoreDto;

public class OutputView {

    private final Printer printer;

    public OutputView(Printer printer) {
        this.printer = printer;
    }

    public void displayBaseballResult(GameScoreDto baseballResult) {
        int strike = baseballResult.strike();
        int ball = baseballResult.ball();
        if (strike == 0 && ball == 0) {
            printer.println("낫싱");
            return;
        }
        String strikeFormat = calculateResultFormat(strike, "스트라이크");
        String ballFormat = calculateResultFormat(ball, "볼 ");
        printer.println(ballFormat + strikeFormat);
    }

    public void displayGameOver() {
        printer.println("게임 종료");
    }

    private String calculateResultFormat(int score, String scoreKey) {
        if (score > 0) {
            return score + scoreKey;
        }
        return "";
    }
}
