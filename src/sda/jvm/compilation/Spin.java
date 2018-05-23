package sda.jvm.compilation;

public class Spin {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        spin();
    }

    static void spin() {
        int i;
        for (i = 0; i < 100; i++) {
            ;    // Loop body is empty
        }
    }

}
