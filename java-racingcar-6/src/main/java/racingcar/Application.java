package racingcar;

import racingcar.controller.RacingController;
import racingcar.service.RacingService;
import racingcar.view.DefaultPrinter;
import racingcar.view.DefaultReader;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        RacingController racingController = new RacingController(
                generateInputView(),
                generateOutputView(),
                new RacingService()
        );

        racingController.run();
    }

    public static InputView generateInputView() {
        return new InputView(new DefaultPrinter(), new DefaultReader());
    }

    public static OutputView generateOutputView() {
        return new OutputView(new DefaultPrinter());
    }
}
