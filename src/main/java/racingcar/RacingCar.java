package racingcar;

import utils.Utils;
import view.Message;

public class RacingCar {
    public static void main(String[] args) {
        Message.showInputCarsMessage();
        String carNames = Utils.readUserString();

        Message.showInputRoundMessage();
        int round = Utils.readUserInt();

        Message.showInfoMessage();
        Cars cars = new Cars(carNames);
        for (int i = 0; i < round; i++) {
            cars.start();
            Message.showResultMessage(cars);
            Message.showNextLine();
        }
    }

}
