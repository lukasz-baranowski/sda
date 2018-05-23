package sda.jvm.jit;

public class JitExamples {

    public String getValueFromSupplier(Supplier<String> supplier) {
        return supplier.get();
    }

    public String businessMethod(String param) {
        Supplier<String> stringSupplier = new StringSupplier("my" + param);
        return getValueFromSupplier(stringSupplier);

    }

    // zostanie zamieniona na
    public String businessMethod2(String param) {
        Supplier<String> stringSupplier = new StringSupplier("my" + param);
        return stringSupplier.get();
    }


    public String getValueFromSupplier2(Supplier<String> supplier) {
        if (supplier == null) {
            throw new IllegalArgumentException("Supplier cannot be null");
        }
        return supplier.get();
    }

    // businessMethod zostanie zamieniona na
    public String businessMethod3(String param) {
        Supplier<String> supplier = new StringSupplier("my" + param);
        if (supplier == null) {
            throw new IllegalArgumentException("Supplier cannot be null");
        }
        return supplier.get();
    }

    // a JIT usunie fragment kodu, ktory jest "martwy"
    public String businessMethod4(String param) {
        Supplier<String> supplier = new StringSupplier("my" + param);
        return supplier.get();
    }

    interface Supplier<T> {
        T get();
    }

    static class StringSupplier implements Supplier<String> {
        private String field;

        public StringSupplier(String param) {
            this.field = param;
        }

        @Override
        public String get() {
            return this.field;
        }

    }
}
