package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.askNamePlayer;

public class Engine {
    public static int rangeGenerateNumbers = 100;
    public static int numberGameQuestions = 3;
    public static void playGame(String rule, String[][] gameQuestsAnswers) {
        Scanner readFromKeyboard = new Scanner(System.in);
        String nameUser = askNamePlayer();
        System.out.println(rule);
        String userAnswer;
        for (int i = 0; i < numberGameQuestions; i++) {
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

