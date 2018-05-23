package sda.jvm.gc;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class WeakHashMapFiller {

    public static void main(String[] args) throws InterruptedException {
        Map<String, String> map = new WeakHashMap();
        int i = 0;
        while (true) {
            String iString = String.valueOf(i);
            map.put(iString, iString);

            if (i % 100000 == 0) {
                System.out.println(i);
                //TimeUnit.SECONDS.sleep(2);
            }

            if (i == 25000000) {
                i = -1;
                map.clear();

                System.out.println("Sleeping...");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Wake up...");
            }
            i++;
        }

    }
}
