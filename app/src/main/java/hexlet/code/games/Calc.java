package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final int NUMBER_OF_ROUNDS = 3;
    public static void startsTheGameCalc() {
        String rules = "What is the result of the expression?";
        String[] questions = Utils.getArray(3);
        String[] answers = Utils.getArray(3);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int numberFirst = Utils.getRandomInt(0, 100);
            int numberLast = Utils.getRandomInt(0, 100);

            String[] operands = {"+", "-", "*"};
            int selectedOperand = Utils.getRandomInt(0, 2);
            String operand = operands[selectedOperand];

            int correctAnswer = answerToQuestion(numberFirst, numberLast, operand);

            String correctAnswerToString = Integer.toString(correctAnswer);
            String question = "Question: " + numberFirst + " " + operands[selectedOperand] + " " + numberLast;

            questions[i] = question;
            answers[i] = correctAnswerToString;
        }
        Engine.upEngine(rules, questions, answers);
    }
    public static int answerToQuestion(int numberFirst, int numberLast, String operand) {
        int answer;
        switch (operand) {
            case "+":
                answer = numberFirst + numberLast;
                return answer;
            case "-":
                answer = numberFirst - numberLast;
                return answer;
            case "*":
                answer = numberFirst * numberLast;
                return answer;
            default:
                throw new Error("Unknown state!");
        }
    }
}

