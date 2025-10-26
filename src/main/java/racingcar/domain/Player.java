package racingcar.domain;

public class Player {
    private final String name;
    private Car car;
    private int winCount;

    public Player(String name) {
        this.name = name;
        this.car = new Car();
        this.winCount = 0;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addWin() {
        winCount++;
    }

    public int getWinCount() {
        return winCount;
    }

    public String getName() {
        return name;
    }
}
