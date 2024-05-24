package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String  askNamePlayer() {
        Scanner readFromKeyboard = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name?  ");
        String nameUser = readFromKeyboard.nextLine();
        System.out.println("Hello, " + nameUser + "!");
        return nameUser;
    }
}
