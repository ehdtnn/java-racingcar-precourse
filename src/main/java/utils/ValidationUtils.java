package utils;

public class ValidationUtils {

    public static final int MIN_NAME_SIZE = 1;
    public static final int MAX_NAME_SIZE = 5;

    public static boolean validName(String name) {
        return name.length() >= MIN_NAME_SIZE && name.length() <= MAX_NAME_SIZE;
    }
}
