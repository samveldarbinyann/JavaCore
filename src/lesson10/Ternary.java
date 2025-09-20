package lesson10;

public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute ");
        System.out.println(i + " = " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute ");
        System.out.println(i + " = " + k);


    }
}
