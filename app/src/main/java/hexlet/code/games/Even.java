package hexlet.code.games;

import static hexlet.code.Cli.getNameUser;
import static hexlet.code.Engine.checkAnswerBoolean;
import static hexlet.code.Engine.getAnswer;
import static hexlet.code.Engine.numericsRandom;

public class Even {
    public static void gameEven() {
        String nameUser = getNameUser();
        int maxQuestions = 3;
        int rangeGenerateNumbers = 10;
        int guessNumber;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int q = 1;
        while (q <= maxQuestions) {
            guessNumber = 1 + numericsRandom.nextInt(rangeGenerateNumbers);
            System.out.println("Question: " + guessNumber);
            System.out.print("Your answer: ");
            checkAnswerBoolean(checkEven(guessNumber), getAnswer());
            q += 1;
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }

    static boolean checkEven(int a) {
        if ((a % 2) == 0) {
            return true;
        }
        return false;
    }
}
