package racingcar.domain;

public class Car {

    private final Name name;
    private final MoveForwardTimes moveForwardTimes;

    public Car(Name name) {
        this.name = name;
        this.moveForwardTimes = new MoveForwardTimes();
    }

    public void move(int racingNumber) {
        if (racingNumber >= 4) {
            moveForwardTimes.move();
        }
    }

    public RacingCarDto toRacingCarDto() {
        return new RacingCarDto(name.getName(), moveForwardTimes.getMoveForwardTimes());
    }
}
