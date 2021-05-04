package view;


import racingcar.Car;
import racingcar.Cars;

public class Message {

    public final static String DASH = "-";

    public static void showInputCarsMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은쉼표(,) 기준으로구분) : ");
    }

    public static void showInputRoundMessage() {
        System.out.println("시도할 회수는 몇회인가요? : ");
    }

    public static void showInfoMessage() {
        System.out.println("실행 결과");
    }

    public static void showResultMessage(Cars cars) {
        for (int i = 0; i < cars.getSize(); i++) {
            String name = cars.get(i).getCarName();
            int position = cars.get(i).getCarPosition();
            System.out.println(name + " : " + appendDash(position));
        }
    }

    public static void showNextLine() {
        System.out.println("");
    }

    private static String appendDash(int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append(DASH);
        }
        return sb.toString();
    }

    public static void showWinnerMessage(String winner) {
        System.out.println(winner + "가 최중 우승했습니다.");
    }

}

