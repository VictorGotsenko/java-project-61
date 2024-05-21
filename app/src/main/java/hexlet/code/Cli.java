package hexlet.code;

import static hexlet.code.Engine.readFromKeyboard;

public class Cli {
    public static String  askNamePlayer() {
        String nameUser;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?  ");
        nameUser = readFromKeyboard.nextLine();
        System.out.println("Hello " + nameUser + "!");
        return nameUser;
    }
}
