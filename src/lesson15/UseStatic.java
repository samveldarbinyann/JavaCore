package lesson15;

public class UseStatic {
    static int a = 3;
    static int b;

    static void math(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("static");
        b = 4 * a;
    }

    public static void main(String[] args) {
        math(50);
    }


}
