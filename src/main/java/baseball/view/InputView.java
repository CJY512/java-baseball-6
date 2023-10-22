package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public String input() {
        System.out.print("숫자를 입력해주세요 : ");
        return Console.readLine();
    }

    public String restart() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return Console.readLine();
    }

}