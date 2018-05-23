package sda.jvm.compilation;

import java.util.stream.IntStream;

public class SpinStream {

    public static void main(String[] args) {
        spinStream();
    }

    static void spinStream() {
        IntStream.range(0, 100).forEach(value -> {});
    }

}
