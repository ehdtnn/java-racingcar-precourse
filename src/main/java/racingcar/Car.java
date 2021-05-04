package racingcar;

public class Car {
    public static final int MIN_MOVABLE = 4;
    public static final int MAX_MOVABLE = 9;

    private final CarName name;
    private CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition();
    }

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = new CarPosition(position);
    }

    public int move(int random) {
        if (isMovable(random)) {
            return addPosition();
        }
        return position.getPosition();
    }

    private boolean isMovable(int random) {
        return random >= MIN_MOVABLE && random <= MAX_MOVABLE;
    }

    private int addPosition() {
        return position.addPosition();
    }

    public String getCarName() {
        return name.getName();
    }

    public int getCarPosition() {
        return position.getPosition();
    }

    public boolean isWinner(int max) {
        return max <= position.getPosition();
    }
}
