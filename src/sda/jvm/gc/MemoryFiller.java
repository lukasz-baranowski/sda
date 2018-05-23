package sda.jvm.gc;

import java.util.Random;

public class MemoryFiller {

    public static void main(String[] args) {
        // intLoop();
        randomLoop();
    }

    private static void randomLoop() {
        Random r = new Random();
        while (true) {
            new String(String.valueOf(r.nextLong()));
        }
    }

    private static void intLoop() {
        int i = 0;
        while (true) {
            new String(String.valueOf(i++));

            if (i % 1000000 == 0) {
                System.out.println(i);
            }
        }
    }

}
