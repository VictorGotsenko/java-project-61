package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int RANGE_GENERATE_NUMBERS = 100;
    public static final int NUMBER_GAME_QUESTIONS = 3;
    public static void playGame(String rule, String[][] gameQuestsAnswers) {
        Scanner readFromKeyboard = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name?  ");
        String nameUser = readFromKeyboard.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        System.out.println(rule);
        String userAnswer;
        for (int i = 0; i < NUMBER_GAME_QUESTIONS; i++) {
            System.out.println("Question: " + gameQuestsAnswers[i][0]);
            System.out.print("Your answer: ");
            userAnswer = readFromKeyboard.nextLine();
            if (!gameQuestsAnswers[i][1].equalsIgnoreCase(userAnswer)) {
                System.out.printf("\'%s\' is wrong answer ;(. Correct answer was \'%s\'.\n",
                        userAnswer, gameQuestsAnswers[i][1]);
                System.out.printf("Let's try again, %s !\n", nameUser);
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
}

