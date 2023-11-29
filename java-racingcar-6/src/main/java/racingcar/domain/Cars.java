package racingcar.domain;

import java.util.List;

public class Cars {

    private final List<Car> cars;
    private final RacingNumberGenerator racingNumberGenerator;

    public Cars(List<Car> cars, RacingNumberGenerator racingNumberGenerator) {
        this.cars = cars;
        this.racingNumberGenerator = racingNumberGenerator;
    }

    public void move() {
        for(Car car : cars) {
            int racingNumber = racingNumberGenerator.getRacingNumber();
            car.move(racingNumber);
        }
    }
}
