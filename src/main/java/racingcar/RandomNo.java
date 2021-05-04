package racingcar;

public class RandomNo {
    public static final int MIN_RANDOM_NO = 0;
    public static final int MAX_RANDOM_NO = 9;
    private int randomNo;

    public RandomNo(int randomNo) {
        if (!validateRandomNo(randomNo)) {
            throw new IllegalArgumentException("랜덤 숫자는 0~9 사이여야 합니다.");
        }
        this.randomNo = randomNo;
    }

    public boolean validateRandomNo(int randomNo) {
        return randomNo >= MIN_RANDOM_NO && randomNo <= MAX_RANDOM_NO;
    }
}
