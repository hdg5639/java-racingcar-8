package racingcar.controller;

import racingcar.domain.Car;
import racingcar.service.GameService;
import racingcar.view.ConsoleView;

import java.util.List;

public class RacingController {
    private final ConsoleView consoleView;
    private final GameService gameService;

    public RacingController(ConsoleView consoleView, GameService gameService) {
        this.consoleView = consoleView;
        this.gameService = gameService;
    }

    public void start() {
        // 자동차 입력
        List<Car> cars = consoleView.inputNames()
                .stream().map(Car::new).toList();
        // 횟수 입력
        int count = consoleView.inputCount();

        consoleView.output("\n실행 결과");
        for (int i = 0; i < count; i++) {
            gameService.playRound(cars, count);
            consoleView.printRound(cars);
            // 거리값 초기화
            cars.forEach(Car::initDistance);
        }

        // 최종 우승자 출력
        consoleView.printWinner(gameService.checkGameWinner(cars));
    }
}
