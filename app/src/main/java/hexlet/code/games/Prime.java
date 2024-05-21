package hexlet.code.games;

import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Prime {
    public static void gamePrime() {
        final int scopeDimention = 200;
        final int numberGameQuestions = 3;
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] gameQuestions = new String[numberGameQuestions];
        String[] gameAnswers = new String[numberGameQuestions];
        int guessNumber;
        int i = 0;
        while (i < gameQuestions.length) {
            guessNumber = randomGeneratorNum(scopeDimention);
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
