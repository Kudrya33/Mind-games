package games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void startsTheGameCalc() {
        System.out.println("May I have your name?");

        Scanner scanUserName = new Scanner(System.in);
        String userName = scanUserName.next();

        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");

        int countCorrectAnswer = 0;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);

            String[] operands = {"+", "-", "*"};
            int selectedOperand = random.nextInt(3);
            String operand = operands[selectedOperand];
            int answerCalc = switch (operand) {
                case "+" -> number1 + number2;
                case "-" -> number1 - number2;
                case "*" -> number1 * number2;
                default -> 0;
            };

            System.out.println("Question: " + number1 + " " + operands[selectedOperand] + " " + number2);

            Scanner scanAnswer = new Scanner(System.in);
            int playerAnswer = scanAnswer.nextInt();

            if (answerCalc == playerAnswer) {
                countCorrectAnswer++;
                System.out.println("Your answer: " + playerAnswer + "\nCorrect!");
            }
            if (answerCalc != playerAnswer) {
                System.out.println("Your answer: " + playerAnswer);
                System.out.println("'" + playerAnswer + "' " + "is wrong answer ;(. Correct answer was " + "'" + answerCalc + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (countCorrectAnswer == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}

