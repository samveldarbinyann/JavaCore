package lesson8;

public class Avarage {
    public static void main(String[] args) {
        double nums[] = {10.3, 10.9, 36.8, 46.9, 5.6};
        double result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        System.out.println("The average is " + result / nums.length);
    }
}

