package hexlet.code.games;

import static hexlet.code.Engine.numberGameQuestions;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Prime {
    public static void gamePrime() {
        final int scopeDimention = 200;
        String[][] gameQuestsAnswers = new String[numberGameQuestions][2];
        int guessNumber = 0;
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < numberGameQuestions; i++) {
            guessNumber = randomGeneratorNum(scopeDimention);
            gameQuestsAnswers[i][0] = String.valueOf(guessNumber);
            gameQuestsAnswers[i][1] = checkIsPrime(guessNumber);
        }
        playGame(rule, gameQuestsAnswers);
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
