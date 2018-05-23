package sda.jvm.compilation;

public class GenericClass {

    public static void main(String[] args) {
        Generic<String> generic = new StringGenericType();
        generic.doSomething();
    }

    interface Generic<T> {
        T doSomething();
    }

    static class StringGenericType implements Generic<String> {

        @Override
        public String doSomething() {
            return "doSomething";
        }
    }

}
