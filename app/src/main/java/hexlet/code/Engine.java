package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.askNamePlayer;

public class Engine {
    public static Scanner readFromKeyboard = new Scanner(System.in);

    public static void playGame(String rule, String[] gameQuestions, String[] gameAnswers) {
        String nameUser = askNamePlayer();
        System.out.println(rule);
        int i = 0;
        String userAnswer;
        while (i < gameQuestions.length) {
            System.out.println("Question: " + gameQuestions[i]);
            System.out.print("Your answer: ");
            userAnswer = readFromKeyboard.nextLine();
            if (!gameAnswers[i].equalsIgnoreCase(userAnswer)) {
                System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                        + gameAnswers[i] + "\'.");
                System.out.println("Let's try again," + nameUser);
                System.exit(0);
            } else {
                System.out.println("Correct!");
            }
            i += 1;
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }
}

