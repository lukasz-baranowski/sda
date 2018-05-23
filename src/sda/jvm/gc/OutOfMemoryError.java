package sda.jvm.gc;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        int i = 0;
        while (true) {
            strings.add(String.valueOf(i++));
            if (i % 1000 == 0) {
                System.out.println(i);
            }
        }
    }
}
