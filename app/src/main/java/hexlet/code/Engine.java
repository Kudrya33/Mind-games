package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int upEngine(String userName, String rules, String question,
                               String correctAnswer, int i, int countAnswer) {
        int finish = 3;
        int numberRound;
        numberRound = i;
        if (numberRound == 0) {
            System.out.println(rules);
        }
        if (numberRound < 3) {
            System.out.println(question);

            Scanner scanAnswer = new Scanner(System.in);
            String playerAnswer = scanAnswer.nextLine();

            System.out.println("Your answer: " + playerAnswer);

            if (playerAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                countAnswer++;
            }
            if (playerAnswer.equalsIgnoreCase(correctAnswer) && countAnswer == finish) {
                System.out.println("Congratulations, " + userName + "!");
            }
            if (!playerAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                countAnswer = -1;
            }
        }
        return countAnswer;
    }
}
