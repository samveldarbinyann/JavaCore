package lesson13;

public class OverLoadDemo {
    public static void main(String[] args) {
        OverLoad demo = new OverLoad();
        double result;

        demo.test();
        demo.test(10);
        demo.test(10, 20);
        demo.test(10.156);
        result = demo.test(10.156);
        System.out.println("result: " + result);
    }
}
