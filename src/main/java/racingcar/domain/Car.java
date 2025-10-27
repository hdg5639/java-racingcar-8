package racingcar.domain;

public class Car {
    private final String name;
    private int distance;
    private int winCount;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
        this.winCount = 0;
    }

    // 우승 카운트 적립
    public void addWin() {
        winCount++;
    }

    // 우승 카운트 조회
    public int getWinCount() {
        return winCount;
    }

    // 이름 조회
    public String getName() {
        return name;
    }

    // 이동 시도
    public void tryMove(int number) {
        if (number >= 4)
            distance++;
    }

    // 거리 조회
    public int getDistance() {
        return distance;
    }

    // 거리 초기화
    public void initDistance() {
        this.distance = 0;
    }
}
