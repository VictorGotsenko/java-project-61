package hexlet.code;

import java.util.Random;

public class Util {
    static Random numericsRandom = new Random();
    public static int[] randomGeneratorArray(int range) {
        int[] dim = new int[2];
        dim[0] = 1 + numericsRandom.nextInt(range);
        dim[1] = 1 + numericsRandom.nextInt(range);
        return dim;
    }
    public static int randomGeneratorNum(int range) {
        return  1 + numericsRandom.nextInt(range);
    }

}
