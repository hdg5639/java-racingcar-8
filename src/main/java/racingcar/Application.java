package racingcar;

import racingcar.controller.RacingController;
import racingcar.service.GameService;
import racingcar.view.ConsoleView;

public class Application {
    public static void main(String[] args) {
        // 초기화
        ConsoleView consoleView = new ConsoleView();
        GameService gameService = new GameService();
        RacingController racingController = new RacingController(consoleView, gameService);

        racingController.start();
    }
}
