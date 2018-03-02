package io;

public class Model {
    public static final int RAND_MIN = 0;
    public static final int RAND_MAX = 100;
    public static boolean checker = true;

    public static int getRandMin() {
        return RAND_MIN;
    }

    public static int getRandMax() {
        return RAND_MAX;
    }

    public static boolean isChecker() {
        return checker;
    }
}
