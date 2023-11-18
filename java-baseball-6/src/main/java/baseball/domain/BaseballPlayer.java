package baseball.domain;

import java.util.HashMap;
import java.util.Map;

public class BaseballPlayer {

    private final BaseballNumbers baseballNumbers;

    public BaseballPlayer(BaseballNumbers baseballNumbers) {
        this.baseballNumbers = baseballNumbers;
    }

    public Map<String, Integer> calculateBaseballResult(BaseballPlayer otherPlayer) {
        Map<String, Integer> baseballResult = new HashMap<>();
        int strike = baseballNumbers.calculateStrike(otherPlayer.baseballNumbers);
        int ball = baseballNumbers.calculateBall(otherPlayer.baseballNumbers);
        putResultSatisfiedCondition(baseballResult, "스트라이크", strike);
        putResultSatisfiedCondition(baseballResult, "볼", ball);
        return baseballResult;
    }

    private void putResultSatisfiedCondition(
            Map<String, Integer> baseballResult,
            String key,
            Integer score
    ) {
        if (score != null && score > 0) {
            baseballResult.put(key, score);
        }
    }
}
