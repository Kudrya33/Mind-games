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
    public static int[] progressionGeneration(int arrayLength, int maxValue) {
        int[] numbers = new int[arrayLength];
        int startNumber = getRandomInt(0, maxValue);
        int countStep = getRandomInt(arrayLength);
        numbers[0] = startNumber;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = startNumber + countStep;
            startNumber = numbers[i];
        }
        return numbers;
    }
}
