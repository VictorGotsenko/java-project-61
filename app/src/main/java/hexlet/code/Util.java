package hexlet.code;

public class Util {
    public static int randomGeneratorNum(int range) {
        // generate random number between 1..range (include range)
        return (int) (1 + Math.random() * range);
    }

}
