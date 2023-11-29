package racingcar.domain;

public class MoveForwardTimes {

    private int moveForwardTimes;

    {
        moveForwardTimes = 0;
    }

    public void move() {
        moveForwardTimes += 1;
    }
}
