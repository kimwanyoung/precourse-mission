package baseball.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballNumbers {

    private final List<Integer> baseballNumbers;

    public BaseballNumbers(List<Integer> baseballNumbers) {
        validateDuplicate(baseballNumbers);
        validateLength(baseballNumbers);
        this.baseballNumbers = baseballNumbers;
    }

    public int calculateStrike(BaseballNumbers otherBaseballNumbers) {
        int strike = 0;
        for (int i = 0; i < baseballNumbers.size(); i++) {
            int currentBaseballNumber = baseballNumbers.get(i);
            int currentOtherBaseballNumber = otherBaseballNumbers.baseballNumbers.get(i);
            if (currentBaseballNumber == currentOtherBaseballNumber) {
                strike++;
            }
        }
        return strike;
    }

    public int calculateBall(BaseballNumbers otherBaseballNumbers) {
        int ball = 0;
        for (int i = 0; i < baseballNumbers.size(); i++) {
            int currentBaseballNumber = baseballNumbers.get(i);
            int currentOtherBaseballNumber = otherBaseballNumbers.baseballNumbers.get(i);
            if (currentBaseballNumber != currentOtherBaseballNumber &&
                    otherBaseballNumbers.contains(currentOtherBaseballNumber)) {
                ball++;
            }
        }
        return ball;
    }

    private boolean contains(Integer baseballNumber) {
        return baseballNumbers.contains(baseballNumber);
    }

    private void validateDuplicate(List<Integer> baseballNumbers) {
        Set<Integer> baseballNumberChecker = new HashSet<>(baseballNumbers);
        if (baseballNumberChecker.size() != 3) {
            throw new IllegalArgumentException();
        }
    }

    private void validateLength(List<Integer> baseballNumbers) {
        if (baseballNumbers.size() != 3) {
            throw new IllegalArgumentException();
        }
    }
}
