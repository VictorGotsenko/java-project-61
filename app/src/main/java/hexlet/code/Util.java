package hexlet.code;

import java.util.Random;

public class Util {
    public static Random numericsRandom = new Random();
    public static int[] randomGenerator(int range) {
        int[] dim = new int[2];
        dim[0] = 1 + numericsRandom.nextInt(range);
        dim[1] = 1 + numericsRandom.nextInt(range);
        return dim;
    }
}
