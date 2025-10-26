package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleView {
    public String input() {
        return Console.readLine();
    }

    public void output(String output) {
        System.out.println(output);
    }
}
