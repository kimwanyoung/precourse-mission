package baseball.controller;

import baseball.domain.RandomGenerator;
import baseball.view.InputView;

public class BaseballController {

    private final InputView inputView;
    private final RandomGenerator randomGenerator;

    public BaseballController(InputView inputView, RandomGenerator randomGenerator) {
        this.inputView = inputView;
        this.randomGenerator = randomGenerator;
    }
}
