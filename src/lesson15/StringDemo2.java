package lesson15;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "DDSwfdsdsa";
        String s3 = "POXOS";

        System.out.println(s1.length());
        System.out.println(s2.charAt(2));
        if (s1.equals(s2)) {
            System.out.println("s1 == s2");
        }else  {
            System.out.println("s1 != s2");
        }
    }
}
