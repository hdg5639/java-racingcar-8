package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private int distance = 0;

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
}
