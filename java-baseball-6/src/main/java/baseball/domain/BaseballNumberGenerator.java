package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class BaseballNumberGenerator implements RandomGenerator {

    @Override
    public List<Integer> generate() {
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() != 3) {
            Integer randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }
}
