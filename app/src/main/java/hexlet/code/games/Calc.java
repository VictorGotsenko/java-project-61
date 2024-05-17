package hexlet.code.games;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.checkAnswerNumeric;
import static hexlet.code.Engine.getAnswer;
import static hexlet.code.Engine.randomGenerator;

public class Calc {
    public static void gameCalc() {
        String nameUser = getNameUser();
        int rangeGenerateNumbers = 10;
        int maxQuestions = 3;
        String operation = " * ";
        int result = 0;

        System.out.println("What is the result of the expression?");
        int[] dim = randomGenerator(rangeGenerateNumbers);
        int q = 1;
        while (q <= maxQuestions) {
            dim = randomGenerator(rangeGenerateNumbers);
            if (q == 1) {
                result = dim[0] * dim[1];
            }
            if (q == 2) {
                operation = " + ";
                result = dim[0] + dim[1];
            }
            if (q == 3) {
                operation = " - ";
                result = dim[0] - dim[1];
            }
            System.out.println("Question: " + dim[0] + operation + dim[1]);
            System.out.print("Your answer: ");
            checkAnswerNumeric(result, Integer.parseInt(getAnswer()));
            q += 1;
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
