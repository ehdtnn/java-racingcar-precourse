package racingcar;

public class CarPosition {

    public static final int MIN_POSITION = 0;

    private int position;

    public CarPosition() {
        this.position = getPosition();
    }

    public CarPosition(int position) {
        if (validPosition()) {
            throw new IllegalArgumentException("위치 값은 0보다 같거나 커야 합니다.");
        }
        this.position = position;
    }

    public boolean validPosition() {
        return this.position >= MIN_POSITION;
    }

    public int addPosition() {
        return ++position;
    }

    public int getPosition() {
        return position;
    }
}
