package baseball;

import baseball.controller.BaseballController;
import baseball.domain.BaseballNumberGenerator;
import baseball.domain.BaseballNumberRandomGenerator;
import baseball.service.BaseballService;
import baseball.view.DefaultPrinter;
import baseball.view.DefaultReader;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        BaseballController controller = new BaseballController(
                new InputView(new DefaultReader(), new DefaultPrinter()),
                new OutputView(new DefaultPrinter()),
                new BaseballService(getBaseballGenerator())
        );
        controller.run();
    }

    public static BaseballNumberRandomGenerator getBaseballGenerator() {
        return new BaseballNumberRandomGenerator(new BaseballNumberGenerator());
    }
}
