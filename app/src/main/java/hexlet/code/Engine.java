package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static Scanner readFromKeyboard = new Scanner(System.in);
    static void welcomeGame() {
        System.out.println("Welcome to the Brain Games!");
    }

    static void printGameList() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.printf("Your choice: ");
    }

    static int choiceGame() {
        String inputFromKeyboard = "";
        while (!inputFromKeyboard.matches("[0-3]")) {
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

}

