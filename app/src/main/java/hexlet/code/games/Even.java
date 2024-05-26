package hexlet.code.games;

import static hexlet.code.Engine.NUMBER_GAME_QUESTIONS;
import static hexlet.code.Engine.RANGE_GENERATE_NUMBERS;
import static hexlet.code.Engine.playGame;
import static hexlet.code.Util.randomGeneratorNum;

public class Even {
    public static void gameEven() {
        String[][] gameQuestsAnswers = new String[NUMBER_GAME_QUESTIONS][2];
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int guessNumber;
        for (int i = 0; i < NUMBER_GAME_QUESTIONS; i++) {
            guessNumber = randomGeneratorNum(RANGE_GENERATE_NUMBERS);
            gameQuestsAnswers[i][0] = String.valueOf(guessNumber);
            if (checkEven(guessNumber)) {
                gameQuestsAnswers[i][1] = "yes";
            } else {
                gameQuestsAnswers[i][1] = "no";
            }
        }
        playGame(rule, gameQuestsAnswers);
    }

    static boolean checkEven(int a) {
        if ((a % 2) == 0) {
            return true;
        }
        return false;
    }
}
