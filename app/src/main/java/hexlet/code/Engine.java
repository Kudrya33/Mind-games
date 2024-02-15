package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;

    public static void startTheEngine(String rules, String[][] questionsAndAnswers) {

        System.out.println("May I have your name?");

        Scanner scanUserName = new Scanner(System.in);
        String userName = scanUserName.next();

        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        int countCorrectAnswer = 0;

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println(questionsAndAnswers[i][0]);

            Scanner scanAnswer = new Scanner(System.in);
            String playerAnswer = scanAnswer.nextLine();

            System.out.println("Your answer: " + playerAnswer);

            if (playerAnswer.equalsIgnoreCase(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
                countCorrectAnswer++;
            }
            if (playerAnswer.equalsIgnoreCase(questionsAndAnswers[i][1]) && countCorrectAnswer == NUMBER_OF_ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
                break;
            }
            if (!playerAnswer.equalsIgnoreCase(questionsAndAnswers[i][1])) {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }

}
