package baseball.domain;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballNumbersTest {

    private final BaseballNumbers computer = new BaseballNumbers(List.of(1, 2, 3));
    private final BaseballNumbers user = new BaseballNumbers(List.of(3, 2, 1));

    @Test
    @DisplayName("점수 계산 테스트")
    void 점수_계산_테스트() {
        //given
        int expectedStrike = 1;
        int expectedBall = 2;

        //when
        GameScoreDto gameScoreDto = computer.calculateScore(user);

        //then
        Assertions.assertThat(expectedStrike).isEqualTo(gameScoreDto.strike());
        Assertions.assertThat(expectedBall).isEqualTo(gameScoreDto.ball());
    }
}
