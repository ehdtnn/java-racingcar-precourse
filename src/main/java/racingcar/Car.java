package racingcar;

public class Car {
    public static final int POSITION_INIT_VAL = 0;

    private final CarName name;
    private final CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition(POSITION_INIT_VAL);
    }

    public void move(int random) {
        this.position.move(random);
    }

    public int getPosition() {
        return this.position.getPosition();
    }
}
