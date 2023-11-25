package baseball.controller;

import baseball.domain.GameScoreDto;
import baseball.domain.UserChoice;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {

    private final InputView inputView;
    private final OutputView outputView;
    private final BaseballService baseballService;

    public BaseballController(
            InputView inputView,
            OutputView outputView,
            BaseballService baseballService
    ) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.baseballService = baseballService;
    }

    public void run() {
        baseballService.reset();
        do {
            GameScoreDto result = baseballService.play(inputView.getBaseballNumberFromInput());
            outputView.displayBaseballResult(result);
        } while (!baseballService.isThreeStrike());

        retryOrQuit();
    }

    private void retryOrQuit() {
        UserChoice userChoice = UserChoice.RETRY;
        while (userChoice != UserChoice.QUIT) {
            userChoice = UserChoice.from(inputView.getUserChoice());
            if (userChoice.equals(UserChoice.RETRY)) {
                run();
                return;
            }
        }
        outputView.displayGameOver();
    }
}
