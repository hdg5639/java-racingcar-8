package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GameService {
    // 라운드 진행
    public void playRound(List<Car> cars, int count) {
        for (int i = 0; i < count; i++) {
            carMove(cars);
        }
        checkRoundWinner(cars);
    }

    // 게임 최종 우승자 판별
    public List<String> checkGameWinner(List<Car> cars) {
        List<Car> sortedCars = new ArrayList<>(cars);
        sortedCars.sort(Comparator.comparing(Car::getWinCount).reversed());

        // 가장 높은 Win 카운트 추출
        int topRating = sortedCars.getFirst().getWinCount();
        // topRating과 같은 자동차 필터링 후 Name 리스트 반환
        return cars.stream()
                .filter(car -> car.getWinCount() == topRating)
                .map(Car::getName)
                .toList();
    }

    // 자동차 이동 함수
    private void carMove(List<Car> cars) {
        for (Car car : cars) {
            car.tryMove(randomNumber());
        }
    }

    // 이동 시도 숫자 생성
    private int randomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    // 라운드 우승자 판별
    private void checkRoundWinner(List<Car> cars) {
        // List 복사
        List<Car> sorted = new ArrayList<>(cars);
        // 거리 내림차순 정렬
        sorted.sort(Comparator.comparing(Car::getDistance).reversed());
        // 가장 높은 거리값 추출
        int topDistance = sorted.getFirst().getDistance();

        // 비교하며 top과 같은 아이만 winner 카운트 상승 달라지면 루프 탈출
        for (Car car : cars) {
            if (car.getDistance() == topDistance)
                car.addWin();
            else break;
        }
    }
}
