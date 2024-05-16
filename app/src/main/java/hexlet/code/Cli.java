package hexlet.code;

import static hexlet.code.Engine.readFromKeyboard;
import static hexlet.code.Engine.welcomeGame;

public class Cli {
    private static String nameUser;
    static void askNamePlayer() {
        welcomeGame();
        System.out.printf("May I have your name?  ");
        nameUser = readFromKeyboard.nextLine();
        System.out.println("Hello " + nameUser + " !");
    }

    public static String getNameUser() {
        return nameUser;
    }
}
