package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.askNamePlayer;

public class Engine {
    public static final int RANGE_GENERATE_NUMBERS = 100;
    public static final int NUMBER_GAME_QUESTIONS = 3;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static void playGame(String rule, String[][] gameQuestsAnswers) {
        Scanner readFromKeyboard = new Scanner(System.in);
        String nameUser = askNamePlayer();
        System.out.println(rule);
        String userAnswer;
        for (int i = 0; i < NUMBER_GAME_QUESTIONS; i++) {
            System.out.println("Question: " + gameQuestsAnswers[i][0]);
            System.out.print("Your answer: ");
            userAnswer = readFromKeyboard.nextLine();
            if (!gameQuestsAnswers[i][1].equalsIgnoreCase(userAnswer)) {
                System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                        + gameQuestsAnswers[i][1] + "\'.");
                System.out.println("Let's try again, " + nameUser + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
}

