package racingcar.domain;

import java.util.Map;

public class RacingResultDto {

    private final Map<String, Integer> racingResult;

    public RacingResultDto(Map<String, Integer> racingResult) {
        this.racingResult = racingResult;
    }

    public Map<String, Integer> getRacingResult() {
        return racingResult;
    }
}
