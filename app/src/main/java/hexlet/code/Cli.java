package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String  askNamePlayer() {
        Scanner readFromKeyboard = new Scanner(System.in);
        String nameUser;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?  ");
        nameUser = readFromKeyboard.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        return nameUser;
    }
}
