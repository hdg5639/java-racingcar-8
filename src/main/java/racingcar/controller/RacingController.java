package racingcar.controller;

import racingcar.service.GameService;
import racingcar.view.ConsoleView;

public class RacingController {
    private final ConsoleView consoleView;
    private final GameService gameService;
    public RacingController(ConsoleView consoleView, GameService gameService) {
        this.consoleView = consoleView;
        this.gameService = gameService;
    }
}
