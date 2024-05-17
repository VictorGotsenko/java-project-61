package hexlet.code.games;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.checkAnswerNumeric;
import static hexlet.code.Engine.getAnswer;
import static hexlet.code.Engine.randomGenerator;

public class GCD {
    public static void gameGCD() {
        int rangeGenerateNumbers = 100;
        String nameUser = getNameUser();
        int maxQuestions = 3;
        System.out.println("Find the greatest common divisor of given numbers.");

        int[] dim = randomGenerator(rangeGenerateNumbers);
        int q = 1;
        while (q <= maxQuestions) {
            dim = randomGenerator(rangeGenerateNumbers);
            System.out.println("Question: " + dim[0] + " " + dim[1]);
            System.out.print("Your answer: ");
            checkAnswerNumeric(findCDG(dim[0], dim[1]), Integer.parseInt(getAnswer()));
            q += 1;
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }

    public static int findCDG(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return b;
    }
}
