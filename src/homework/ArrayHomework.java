package homework;

public class ArrayHomework {
    public static void main(String[] args) {

        System.out.println("<---------- 1 ---------->");

        int[] nums = {5, 8, 99, 64, 26, 6, 59, -3, 3, 75};
        int n = 6;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                sum++;
            }
        }
        System.out.println(sum);

        System.out.println();
        System.out.println();

        System.out.println("<---------- 2 ---------->");

        int[] nums2 = {33, 69, 5, 78, 95, -6, 10, 7, 5, 8};
        for (int i = 0; i < nums2.length / 2; i++) {
            int temp = nums2[i];
            nums2[i] = nums2[nums2.length - i - 1];
            nums2[nums2.length - i - 1] = temp;
        }
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("<---------- 3 ---------->");

        int[] nums3 = {65, 87, 2, 98, 2, 98, -6, 8, 8, 7};

        int count = 0;
        for (int i = 0; i < nums3.length; i++) {
            boolean isAlredyCounted = false;
            for (int j = 0; j < i; j++) {
                if (nums3[j] == nums3[i]) {
                    isAlredyCounted = true;
                    break;
                }
            }
            if (!isAlredyCounted) {
                for (int j = i + 1; j < nums3.length; j++) {
                    if (nums3[j] == nums3[i]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

        System.out.println();
        System.out.println();

        System.out.println("<---------- 4 ---------->");

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowel = {'ա', 'է', 'ը', 'ի', 'օ',};
        int vowels = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (chars[i] == vowel[j]) {
                    vowels++;
                }
                if (chars[i] == 'Ո' && i + 1 < chars.length && chars[i + 1] == 'ւ') {
                    vowels++;
                    i++;
                }
            }
        }
        System.out.println(vowels);

    }

}
