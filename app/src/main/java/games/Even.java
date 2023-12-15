package games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void startsTheGameEven() {
        System.out.println("May I have your name?");

        Scanner scanUserName = new Scanner(System.in);
        String userName = scanUserName.next();

        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int countCorrectAnswer = 0;
        String correctAnswer;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int evenNumber = random.nextInt(100);
            System.out.println("Question: " + evenNumber);

            Scanner scanAnswerEven = new Scanner(System.in);
            String answerForEven = scanAnswerEven.next();

            if (evenNumber % 2 == 0 && answerForEven.equalsIgnoreCase("yes")) {
                System.out.println("Your answer: 'Yes'\nCorrect!");
                countCorrectAnswer++;
            }
            if (evenNumber % 2 != 0 && answerForEven.equalsIgnoreCase("no")) {
                System.out.println("Your answer: 'No'\nCorrect!");
                countCorrectAnswer++;
            } else if (evenNumber % 2 == 0 && answerForEven.equalsIgnoreCase("no") || evenNumber % 2 != 0 && answerForEven.equalsIgnoreCase("yes")) {
                correctAnswer = answerForEven.equalsIgnoreCase("Yes") ? "no" : "yes";
                System.out.println("'" + answerForEven + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\nLet's try again, " + userName + "!");
                break;
            }
        }
        if (countCorrectAnswer == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
