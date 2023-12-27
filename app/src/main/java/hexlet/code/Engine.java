package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int NUMBER_OF_ROUNDS = 3;
    public static int upEngine(String userName, String rules, String[] questionAndAnswer, int i, int countAnswer) {
        int numberRound;
        numberRound = i;
        if (numberRound == 0) {
            System.out.println(rules);
        }
        if (numberRound < NUMBER_OF_ROUNDS) {
            System.out.println(questionAndAnswer[0]);

            Scanner scanAnswer = new Scanner(System.in);
            String playerAnswer = scanAnswer.nextLine();

            System.out.println("Your answer: " + playerAnswer);

            if (playerAnswer.equalsIgnoreCase(questionAndAnswer[1])) {
                System.out.println("Correct!");
                countAnswer++;
            }
            if (playerAnswer.equalsIgnoreCase(questionAndAnswer[1]) && countAnswer == NUMBER_OF_ROUNDS) {
                System.out.println("Congratulations, " + userName + "!");
            }
            if (!playerAnswer.equalsIgnoreCase(questionAndAnswer[1])) {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + questionAndAnswer[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                countAnswer = -1;
            }
        }
        return countAnswer;
    }
}
