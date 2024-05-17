package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Cli.getNameUser;

public class Engine {
    static Scanner readFromKeyboard = new Scanner(System.in);
    public static Random numericsRandom = new Random();

    static void welcomeGame() {
        System.out.println("Welcome to the Brain Games!");
    }

    static void printGameList() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.printf("Your choice: ");
    }

    static int choiceGame() {
        String inputFromKeyboard = "";
        while (!inputFromKeyboard.matches("[0-6]")) {
            inputFromKeyboard = readFromKeyboard.nextLine();
        }
//        readFromKeyboard.close();
        int result = Integer.parseInt(inputFromKeyboard);
        return result;
    }

    public static String getAnswer() {
        String answer;
        answer = readFromKeyboard.nextLine();
        return answer;
    }

    public static void checkAnswerNumeric(int rightAnswer, int userAnswer) {
        String nameUser = getNameUser();
        if (!(userAnswer == rightAnswer)) {
            System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                    + rightAnswer + "\'.");
            System.out.println("Let's try again," + nameUser);
            System.exit(0);
        } else {
            System.out.println("Correct!");
        }
    }

    public static void checkAnswerBoolean(boolean rightAnswer, String userAnswer) {
        String nameUser = getNameUser();
        boolean userAnswerBool = false;
        String rightAnswerTxt = rightAnswer ? "yes" : "no";
        if (userAnswer.equalsIgnoreCase("yes")) {
            userAnswerBool = true;
        }

        if (!userAnswerBool == rightAnswer) {
            System.out.println("\'" + userAnswer + "\' is wrong answer ;(. Correct answer was \'"
                    + rightAnswerTxt + "\'.");
            System.out.println("Let's try again," + nameUser);
            System.exit(0);
        } else {
            System.out.println("Correct!");
        }
    }

    public static int[] randomGenerator(int range) {
        int[] dim = new int[2];
        dim[0] = 1 + numericsRandom.nextInt(range);
        dim[1] = 1 + numericsRandom.nextInt(range);
        return dim;
    }

}

