package baseball.domain;

public final class BaseballNumberRandomGenerator {

    private final BaseballNumberGenerator baseballNumberGenerator;

    public BaseballNumberRandomGenerator(BaseballNumberGenerator baseballNumberGenerator) {
        this.baseballNumberGenerator = baseballNumberGenerator;
    }

    public BaseballNumbers generate() {
        return new BaseballNumbers(baseballNumberGenerator.generate());
    }
}
