package baseball.service;

import baseball.domain.BaseballNumbers;
import baseball.domain.BaseballPlayer;
import java.util.List;
import java.util.Map;

public class BaseballService {

    private BaseballPlayer user;
    private BaseballPlayer computer;

    public void generateComputerBaseballNumbers(List<Integer> computerBaseballNumbers) {
        computer = new BaseballPlayer(new BaseballNumbers(computerBaseballNumbers));
    }

    public void generateUserBaseballNumbers(List<Integer> userBaseballNumbers) {
        user = new BaseballPlayer(new BaseballNumbers(userBaseballNumbers));
    }

    public Map<String, Integer> calculateBaseballStatistics() {
        return computer.calculateBaseballResult(user);
    }

    public boolean isThreeStrike() {
        Map<String, Integer> currentStatistics = computer.calculateBaseballResult(user);
        return currentStatistics.getOrDefault("스트라이크", 0) == 3;
    }
}
