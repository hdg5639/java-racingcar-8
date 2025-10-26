package racingcar.component;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleComponent {
    public static String input() {
        return Console.readLine();
    }

    public static void output(String output) {
        System.out.println(output);
    }
}
