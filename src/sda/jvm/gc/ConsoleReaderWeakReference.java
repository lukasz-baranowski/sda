package sda.jvm.gc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class ConsoleReaderWeakReference {

    public static void main(String[] args) throws IOException {
        List<WeakReference<String>> list = new ArrayList<>();

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number:");
            String s = br.readLine();

            try {
                int n = Integer.valueOf(s);
                for (int i = 0; i < n; i++) {
                    String toAdd = String.valueOf(i);
                    WeakReference<String> ref = new WeakReference<>(toAdd);
                    list.add(ref);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + s);
            }

            System.out.println("ArrayList size: " + list.size());
        }
    }

}
