package sda.jvm.jit;

public class InfiniteLoop {

    public static void main(String[] args) {
        while (true) {
            new String("....");
        }
    }

}
