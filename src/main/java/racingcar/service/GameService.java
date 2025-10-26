package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;

public class GameService {
    public boolean carMove() {
        int number = randomNumber();
        return number >= 4;
    }

    private int randomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
