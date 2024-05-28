package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_GAME_QUESTIONS;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Prime {
    public static void gamePrime() {
        final int scopeDimention = 200;
        String[][] gameQuestsAnswers = new String[NUMBER_GAME_QUESTIONS][2];
        int guessNumber = 0;
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < NUMBER_GAME_QUESTIONS; i++) {
            guessNumber = randomGeneratorNum(scopeDimention);
            gameQuestsAnswers[i][0] = String.valueOf(guessNumber);
            gameQuestsAnswers[i][1] = checkIsPrime(guessNumber) ? "yes" : "no";
        }
        playGame(rule, gameQuestsAnswers);
    }

    static boolean  checkIsPrime(int a) {
        if (a <= 1) {    //Простое число — это натуральное число больше 1
            return false;
        }
        for (int i = 2; i < a; i++) {
            if ((a % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
