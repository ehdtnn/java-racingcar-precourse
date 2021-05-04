package racingcar;

public class CarName {

    public static final String EMPTY = "";
    public static final int MAX_NAME_SIZE = 5;

    private String name;

    public CarName(String name) {
        if (!validNameEmpty(name)) {
            throw new IllegalArgumentException("자동차 이름은 공백 사용 금지");
        }
        if (!validNameSize(name)) {
            throw new IllegalArgumentException("자동차 이름은 5자 초과 금지");
        }
        this.name = name;
    }

    private boolean validNameEmpty(String name) {
        return !EMPTY.equals(name);
    }

    public static boolean validNameSize(String name) { return name.length() <= MAX_NAME_SIZE; }

    public String getName() {
        return this.name;
    }
}
