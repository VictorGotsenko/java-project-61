package hexlet.code.games;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.checkAnswerBoolean;
import static hexlet.code.Engine.getAnswer;
import static hexlet.code.Engine.numericsRandom;

public class Prime {
    public static void gamePrime() {
        String nameUser = getNameUser();
        int scopeDimention = 200;
        int maxQuestions = 3;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int q = 1;
        while (q <= maxQuestions) {
            int maskNumber = 1 + numericsRandom.nextInt(scopeDimention);
            System.out.println("Question: " + maskNumber);
            System.out.print("Your answer: ");
            checkAnswerBoolean(checkIsPrime(maskNumber), getAnswer());
            q += 1;
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }

    static boolean checkIsPrime(int a) {
        for (int i = 2; i < a; i++) {
            if ((a % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
