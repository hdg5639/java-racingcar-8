package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.Arrays;
import java.util.List;

public class ConsoleView {
    public List<String> inputNames() {
        output("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Arrays.stream(Console.readLine().split(",")).toList();
    }

    public int inputCount() {
        output("시도할 횟수는 몇 회인가요?");
        return Integer.parseInt(Console.readLine());
    }

    public void printRound(List<Car> carList) {
        for (Car car : carList) {
            carDistance(car);
        }
    }

    private void carDistance(Car car) {
        String line = car.getName() +
                " : " +
                "-".repeat(Math.max(0, car.getDistance()));

        output(line);
    }

    public void output(String output) {
        System.out.println(output);
    }
}
