package sda.jvm.memory;

public class Frames {

    public static void main(String[] args) {
        Step1 step1 = new Step1();
        step1.method1();
    }

    static class Step1 {
        void method1() {
            Step2 step2 = new Step2();
            System.out.println("method1");
            step2.method2();
        }
    }

    static class Step2 {
        int value = 0;

        void method2() {
            System.out.println("method2");
            Step3 step3 = new Step3();
            this.value = 2;
            int local = 222;
            step3.method3(local);
        }
    }

    static class Step3 {
        void method3(int value) {
            System.out.println("method3 " + value);
//            throw new RuntimeException("Some exception");
        }
    }

}
