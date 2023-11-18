package baseball;

import baseball.controller.BaseballController;
import baseball.domain.BaseballNumberGenerator;
import baseball.service.BaseballService;
import baseball.view.DefaultPrinter;
import baseball.view.DefaultReader;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BaseballController controller = new BaseballController(
                new InputView(new DefaultReader(), new DefaultPrinter()),
                new OutputView(new DefaultPrinter()),
                new BaseballService(),
                new BaseballNumberGenerator()
        );
        controller.run();
    }
}
