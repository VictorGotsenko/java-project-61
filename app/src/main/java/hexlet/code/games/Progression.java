package hexlet.code.games;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.checkAnswerNumeric;
import static hexlet.code.Engine.getAnswer;
import static hexlet.code.Engine.numericsRandom;
import static hexlet.code.Engine.randomGenerator;

public class Progression {
    public static void gameProgression() {
        String nameUser = getNameUser();
        int scopeProgression = 10;
        int maxQuestions = 3;

        System.out.println("What number is missing in the progression?");

        int[] dimRndInitialStep = randomGenerator(scopeProgression);
        int[] dimProgression = generateProgression(dimRndInitialStep, scopeProgression);
        int maskN = 0;
        int q = 1;
        while (q <= maxQuestions) {
            dimRndInitialStep = randomGenerator(scopeProgression);
            dimProgression = generateProgression(dimRndInitialStep, scopeProgression);
            System.out.print("Question: ");
            maskN = printProgression(dimProgression);
            System.out.print("Your answer: ");
            checkAnswerNumeric(maskN, Integer.parseInt(getAnswer()));
            q += 1;
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }

    static int[] generateProgression(int[] dimRnd, int scope) {
        int[] dim = new int[scope];
        dim[0] = dimRnd[0];
        for (int i = 1; i < scope; i++) {
            dim[i] = dim[i - 1] + dimRnd[1];
        }
        return dim;
    }

    static int printProgression(int[] dimProgression) {
        int guessNumber = 0;
        int maskNumber = 1 + numericsRandom.nextInt(dimProgression.length);
        for (int i = 0; i < dimProgression.length; i++) {
            if (i == maskNumber) {
                System.out.print(".. ");
                guessNumber = dimProgression[i];
            } else {
                System.out.print(dimProgression[i] + " ");
            }
        }
        System.out.println();
        return guessNumber;
    }
}
