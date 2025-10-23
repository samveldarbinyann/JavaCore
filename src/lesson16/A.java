package lesson16;

public class A {
    int i, j;

    void showij() {
        System.out.println("i and j = " + i + " " + j);
    }
}

class B extends A {
    int k;
    void showk () {
        System.out.println("k = " + k);
    }
    void sum () {
        System.out.println("sum = " + (k + i + j));
    }
}
