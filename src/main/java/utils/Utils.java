package utils;

import java.util.Scanner;

public class Utils {

    public static final int MIN_NAME_SIZE = 1;
    public static final int MAX_NAME_SIZE = 5;
    public static final int MATH_RANDOM_MAX = 10;
    public static final Scanner scanner = new Scanner(System.in);

    public static int readUserInt() {
        return scanner.nextInt();
    }

    public static String readUserString() {
        return scanner.nextLine();
    }

    public static boolean validName(String name) {
        return name.length() >= MIN_NAME_SIZE && name.length() <= MAX_NAME_SIZE;
    }

    public static int makeRandom() {
        return (int) (Math.random() * MATH_RANDOM_MAX);
    }
}
