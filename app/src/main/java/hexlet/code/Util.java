package hexlet.code;

import java.util.Random;

public class Util {
    public static int[] randomGeneratorArray(int range) {
        Random numericsRandom = new Random();
        int[] dim = new int[2];
        dim[0] = 1 + numericsRandom.nextInt(range);
        dim[1] = 1 + numericsRandom.nextInt(range);
        return dim;
    }
    public static int randomGeneratorNum(int range) {
        Random numericsRandom = new Random();
        return  1 + numericsRandom.nextInt(range);
    }

}
