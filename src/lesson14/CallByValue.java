package lesson14;

public class CallByValue {
    public static void main(String[] args) {

        MethTest ob = new MethTest();
        int a = 10;
        int b = 20;

        System.out.println("a: " + a + " b: " + b);
        ob.meth(a, b);
        System.out.println("a: " + a + " b: " + b);
    }
}
