package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomInt(int minValue, int maxValue) {
        Random rn = new Random();
        return rn.nextInt(maxValue - minValue + 1) + minValue;
    }

    public static int getRandomInt(int value) {
        Random rn = new Random();
        return rn.nextInt(value);
    }

}
