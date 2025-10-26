package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int distance;
    private int winCount;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
        this.winCount = 0;
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

    // 거리 설정
    public void setDistance() {
        int number = randomNumber();
        boolean move = checkMove(number);

        if (move)
            distance++;
    }

    private boolean checkMove(int number) {
        return number >= 4;
    }

    private int randomNumber() {
        return Randoms.pickNumberInRange(0, 9);
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
