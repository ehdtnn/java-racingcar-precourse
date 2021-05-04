package racingcar;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cars {
    public static final String CAR_NAME_DELIMITER = ",";

    private final List<Car> cars;
    private Map<String, Integer> map;

    public Cars(String input) {
        String[] carNames = input.split(CAR_NAME_DELIMITER);

        this.cars = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            this.cars.add(new Car(carNames[i]));
        }
    }

    public int getSize() {
        return this.cars.size();
    }

    public void start() {
        for (Car car : cars) {
            car.move(Utils.makeRandom());
        }
    }

    public Car get(int i) {
        return cars.get(i);
    }


}

