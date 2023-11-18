package baseball.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballNumbers {

    private final List<Integer> baseballNumbers;

    public BaseballNumbers(List<Integer> baseballNumbers) {
        validateDuplicate(baseballNumbers);
        this.baseballNumbers = baseballNumbers;
    }

    private void validateDuplicate(List<Integer> baseballNumbers) {
        Set<Integer> baseballNumberChecker = new HashSet<>(baseballNumbers);
        if(baseballNumberChecker.size() != 3) {
            throw new IllegalArgumentException();
        }
    }
}
