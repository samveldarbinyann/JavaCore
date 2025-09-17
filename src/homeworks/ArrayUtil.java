package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

//        <<<<<<<< 1 >>>>>>>>>
        System.out.println("<<<<<<<< 1 >>>>>>>>>");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

//        <<<<<<<< 2 >>>>>>>>>
        System.out.println("<<<<<<<< 2 >>>>>>>>>");

        System.out.print(numbers[0]);

        System.out.println();
        System.out.println();

//        <<<<<<<< 3 >>>>>>>>>
        System.out.println("<<<<<<<< 3 >>>>>>>>>");

        System.out.print(numbers[numbers.length - 1]);

        System.out.println();
        System.out.println();


//        <<<<<<<< 4 >>>>>>>>>
        System.out.println("<<<<<<<< 4 >>>>>>>>>");

        System.out.println(numbers.length);

        System.out.println();
        System.out.println();

//        <<<<<<<< 5 >>>>>>>>>
        System.out.println("<<<<<<<< 5 >>>>>>>>>");

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);

        System.out.println();
        System.out.println();

//        <<<<<<<< 6 >>>>>>>>>
        System.out.println("<<<<<<<< 6 >>>>>>>>>");

        if (numbers.length <= 2) {
            System.out.println("can't print middle values");
        }
        if (numbers.length > 2 && numbers.length % 2 == 0) {
            int mid1 = numbers[numbers.length / 2];
            int mid2 = numbers[numbers.length / 2 - 1];
            System.out.println(mid1 + " " + mid2);
        }
        if (numbers.length > 2 && numbers.length % 2 != 0) {
            int mid1 = numbers[numbers.length / 2];
            System.out.println(mid1);
        }

        System.out.println();
        System.out.println();

//        <<<<<<<< 7 >>>>>>>>>
        System.out.println("<<<<<<<< 7 >>>>>>>>>");

        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);

        System.out.println();
        System.out.println();

//        <<<<<<<< 8 >>>>>>>>>
        System.out.println("<<<<<<<< 8 >>>>>>>>>");

        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);

        System.out.println();
        System.out.println();

//        <<<<<<<< 9 >>>>>>>>>
        System.out.println("<<<<<<<< 9 >>>>>>>>>");

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        System.out.println();
        System.out.println();

//        <<<<<<<< 10 >>>>>>>>>
        System.out.println("<<<<<<<< 10 >>>>>>>>>");

        int avarage = sum / numbers.length;
        System.out.println(avarage);

    }

}
