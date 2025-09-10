package homework;

public class Homework1 {
    public static void main(String[] args) {

        //1

        int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println("x > y");
        }

        if (y > x) {
            System.out.println("y > x");
        }

        if (x == y) {
            System.out.println("x = y");
        }

        //2

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //3

        int a = 5;
        int b = 7;
        int sum = a + b;
        System.out.println(sum);

        //4

        int n = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (n * i));
        }
    }
}
