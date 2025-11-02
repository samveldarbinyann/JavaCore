package homeworks.homeworks1;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 3, 9, 0, 2};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }
}
