package racingcar.domain;

public class RacingNumberGenerator {

    private final NumberGenerator numberGenerator;

    public RacingNumberGenerator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public int getRacingNumber(){
        return numberGenerator.generate();
    }
}
