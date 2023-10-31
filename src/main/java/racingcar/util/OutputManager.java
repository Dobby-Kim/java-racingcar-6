package racingcar.util;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class OutputManager {

    public static void promptForCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void promptForTrials() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void displayRaceHeader() {
        displayBlankLine();
        System.out.println("실행 결과");
    }

    public static void displayBlankLine() {
        System.out.println();
    }

    public static void displayCarPosition(Car car) {
        String position = "-".repeat(Math.max(0, car.getPosition()));
        System.out.println(car.getName() + " : " + position);
    }

    public static void displayWinners(List<Car> winners) {
        String winnerNames = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println("최종 우승자 : " + winnerNames);
    }

}