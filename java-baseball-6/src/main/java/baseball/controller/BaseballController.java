package baseball.controller;

import baseball.domain.RandomGenerator;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;
import java.util.Map;

public class BaseballController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RandomGenerator randomGenerator;
    private final BaseballService baseballService;

    public BaseballController(
            InputView inputView,
            OutputView outputView,
            BaseballService baseballService,
            RandomGenerator randomGenerator
    ) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.baseballService = baseballService;
        this.randomGenerator = randomGenerator;
    }

    public void run() {
        List<Integer> computerBaseballs = randomGenerator.generate();
        baseballService.generateComputerBaseballNumbers(computerBaseballs);

        do {
            List<Integer> userBaseball = inputView.getBaseballNumberFromInput();
            baseballService.generateUserBaseballNumbers(userBaseball);
            Map<String, Integer> result = baseballService.calculateBaseballStatistics();
            outputView.displayBaseballResult(result);
        } while (!baseballService.isThreeStrike());
    }
}
