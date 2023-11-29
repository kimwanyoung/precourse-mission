package racingcar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public RacingResultDto toRacingResultDto() {
        Map<String, Integer> results = new HashMap<>();
        for(Car car : cars) {
            RacingCarDto racingCarDto = car.toRacingCarDto();
            results.put(racingCarDto.name(), racingCarDto.racingMoveForwardTimes());
        }
        return new RacingResultDto(results);
    }
}
