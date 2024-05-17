package hexlet.code.games;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.checkAnswerNumeric;
import static hexlet.code.Engine.getAnswer;
import static hexlet.code.Engine.randomGenerator;

public class Calc {
    public static void gameCalc() {
        String nameUser = getNameUser();
        int rangeGenerateNumbers = 10;

        System.out.println("What is the result of the expression?");
// Question No 1
        int[] dim = randomGenerator(rangeGenerateNumbers);
        System.out.println("Question: " + dim[0] + " * " + dim[1]);
        System.out.print("Your answer: ");
        checkAnswerNumeric((dim[0] * dim[1]), Integer.parseInt(getAnswer()));
// Question No 2
        dim = randomGenerator(rangeGenerateNumbers);
        System.out.println("Question: " + dim[0] + " + " + dim[1]);
        System.out.print("Your answer: ");
        checkAnswerNumeric((dim[0] + dim[1]), Integer.parseInt(getAnswer()));

// Question No 3
        dim = randomGenerator(rangeGenerateNumbers);
        System.out.println("Question: " + dim[0] + " - " + dim[1]);
        System.out.print("Your answer: ");
        checkAnswerNumeric((dim[0] - dim[1]), Integer.parseInt(getAnswer()));
        System.out.println("Congratulations, " + nameUser + "!");
    }
}
