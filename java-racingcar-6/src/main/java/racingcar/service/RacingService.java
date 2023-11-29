package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Name;
import racingcar.domain.RacingNumberGenerator;
import racingcar.domain.RacingResultDto;
import racingcar.domain.RandomNumberGenerator;

public class RacingService {

    private Cars cars;

    public void generateCars(List<String> names) {
        List<Car> generatedCars = new ArrayList<>();
        for (String name : names) {
            Name carName = new Name(name);
            generatedCars.add(new Car(carName));
        }

        cars = new Cars(generatedCars, new RacingNumberGenerator(new RandomNumberGenerator()));
    }

    public void movingCars() {
        cars.move();
    }

    public RacingResultDto calculateRacingResult() {
        return cars.toRacingResultDto();
    }
}
