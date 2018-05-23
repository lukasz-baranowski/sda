package sda.jvm.gc;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ObjectSizeAdder {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(new String(new byte[1000]));
        String string = new String("dupa");


        TimeUnit.SECONDS.sleep(10);

        // System.out.println(instrumentation.getObjectSize(string));
        List<String> objects = new ArrayList<>();

        byte[][] tab = new byte[100][];

        tab[0] = new byte[1024 * 1024 * 50];

        String.valueOf(new byte[1000]);

        TimeUnit.SECONDS.sleep(10);

        tab[1] = new byte[1024 * 1024 * 50];

        String string1 = new String(new byte[1024]);


        System.out.println("End");

        while (true) {

        }

    }

}
