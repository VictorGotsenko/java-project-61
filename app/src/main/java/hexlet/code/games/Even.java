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
            gameQuestsAnswers[i][1] = checkEven(guessNumber);
        }
        playGame(rule, gameQuestsAnswers);
    }

    static String checkEven(int a) {
        if ((a % 2) == 0) {
            return "yes";
        }
        return "no";
    }
}
