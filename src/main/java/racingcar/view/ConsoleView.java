package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.Arrays;
import java.util.List;

public class ConsoleView {
    // 이름 입력
    public List<String> inputNames() {
        output("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<String> names = Arrays.stream(Console.readLine().split(",")).toList();

        if (names.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력하지 않음.");
        }
        if (names.stream().anyMatch(String::isEmpty)) {
            throw new IllegalArgumentException("잘못된 입력: 빈 이름이 포함.");
        }
        if (names.stream().anyMatch(name -> name.length() > 5)) {
            throw new IllegalArgumentException("잘못된 입력: 자동차 이름은 5자 이하만 허용.");
        }

        return names;
    }

    // 시도 횟수 입력
    public int inputCount() {
        output("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();

        try {
            int count = Integer.parseInt(input.trim());
            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1회 이상이어야 함.");
            }
            return count;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 입력: 숫자를 입력하지 않음.");
        }
    }

    // 라운드 결과 출력
    public void printRound(List<Car> carList) {
        for (Car car : carList) {
            carDistance(car);
        }
        output("");
    }

    // 최종 우승자 출력
    public void printWinner(List<String> winners) {
        String line = "최종 우승자 : " + String.join(", ", winners);
        output(line);
    }

    // 라운드 이동 거리 출력 함수
    private void carDistance(Car car) {
        String line = car.getName() +
                " : " +
                "-".repeat(Math.max(0, car.getDistance()));

        output(line);
    }

    // 기본 출력 함수
    public void output(String output) {
        System.out.println(output);
    }
}
