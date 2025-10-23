package lesson16;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb =  new A();
        B SubOb =  new B();

        superOb.i = 10;
        superOb.j = 20;
        superOb.showij();
        System.out.println();

        SubOb.i = 15;
        SubOb.j = 25;
        SubOb.k = 35;
        SubOb.showk();
        System.out.println();

        SubOb.sum();
        System.out.println();
    }
}