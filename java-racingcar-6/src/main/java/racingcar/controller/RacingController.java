package racingcar.controller;

import java.util.List;
import racingcar.domain.RacingResultDto;
import racingcar.service.RacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RacingService racingService;

    public RacingController(
            InputView inputView,
            OutputView outputView,
            RacingService racingService
    ) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingService = racingService;
    }

    public void run() {
        List<String> names = inputView.getCarNames();
        int attempts = inputView.attempts();
        racingService.generateCars(names);
        raceMultipleTimes(attempts);
        outputView.displayFinalWinner(racingService.calculateRacingResult());
    }

    private void raceMultipleTimes(int attempts) {
        for(int i = 0 ; i < attempts; i++) {
            racingService.movingCars();
            RacingResultDto racingResultDto = racingService.calculateRacingResult();
            outputView.displayRacingResult(racingResultDto);
        }
    }
}
