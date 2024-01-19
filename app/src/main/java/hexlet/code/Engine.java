package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int NUMBER_OF_ROUNDS = 3;
    public static void upEngine(String rules, String[] questions, String[] answers) {

        System.out.println("May I have your name?");

        Scanner scanUserName = new Scanner(System.in);
        String userName = scanUserName.next();

        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        int countCorrectAnswer = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            Scanner scanAnswer = new Scanner(System.in);
            String playerAnswer = scanAnswer.nextLine();

            System.out.println("Your answer: " + playerAnswer);

            if (playerAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                countCorrectAnswer++;
            }
            if (playerAnswer.equalsIgnoreCase(answers[i]) && countCorrectAnswer == NUMBER_OF_ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
                break;
            }
            if (!playerAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + answers[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
