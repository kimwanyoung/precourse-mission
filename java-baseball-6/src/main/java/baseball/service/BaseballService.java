package baseball.service;

import baseball.domain.BaseballNumberRandomGenerator;
import baseball.domain.BaseballNumbers;
import baseball.domain.GameScoreDto;

public class BaseballService {

    private BaseballNumbers user;
    private BaseballNumbers computer;
    private final BaseballNumberRandomGenerator baseballNumberRandomGenerator;

    public BaseballService(BaseballNumberRandomGenerator baseballNumberRandomGenerator) {
        this.baseballNumberRandomGenerator = baseballNumberRandomGenerator;
    }

    public GameScoreDto play(BaseballNumbers userBaseballNumbers) {
        user = userBaseballNumbers;
        return computer.calculateScore(user);
    }

    public void reset() {
        computer = baseballNumberRandomGenerator.generate();
        user = null;
    }

    public boolean isThreeStrike() {
        if (isNotInitialized()) {
            return false;
        }
        GameScoreDto currentStatistics = computer.calculateScore(user);
        return currentStatistics.strike() == 3;
    }

    private boolean isNotInitialized() {
        return user == null || computer == null;
    }
}
