package games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void startsTheGameCalc() {
        String userName = Cli.greetsThePlayer();

        String rulesOfTheGame = "What is the result of the expression?";

        int countCorrectAnswer = 0;

        Random random = new Random();
        int numberOfRounds = 3;
        int number1;
        int number2;

        for (int i = 0; i < numberOfRounds; i++) {
            if (countCorrectAnswer == -1) {
                break;
            }
            number1 = random.nextInt(100);
            number2 = random.nextInt(100);

            String[] operands = {"+", "-", "*"};
            int selectedOperand = random.nextInt(3);
            String operand = operands[selectedOperand];
            int correctAnswer = switch (operand) {
                case "+" -> number1 + number2;
                case "-" -> number1 - number2;
                case "*" -> number1 * number2;
                default -> 0;
            };
            String correctAnswerToString = Integer.toString(correctAnswer);

            String question = "Question: " + number1 + " " + operands[selectedOperand] + " " + number2;
            countCorrectAnswer = Engine.launchEngine(userName, rulesOfTheGame, question, correctAnswerToString, i, countCorrectAnswer);
        }
    }
}

