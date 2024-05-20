package hexlet.code.games;

import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.numericsRandom;

public class Prime {
    public static void gamePrime() {
        int scopeDimention = 200;
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] gameQuestions = new String[3];
        String[] gameAnswers = new String[3];
        int guessNumber;
        int i = 0;
        while (i < gameQuestions.length) {
            guessNumber = 1 + numericsRandom.nextInt(scopeDimention);
            gameQuestions[i] = String.valueOf(guessNumber);
            gameAnswers[i] = checkIsPrime(guessNumber);
            i += 1;
        }
        playGame(rule, gameQuestions, gameAnswers);
    }

    static String  checkIsPrime(int a) {
        for (int i = 2; i < a; i++) {
            if ((a % i) == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
