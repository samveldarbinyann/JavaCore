package lesson7;

public class RegionTest {
    public static void main(String[] args) {
        int x = 20;
        if(x == 20){
            int y = 30;
            System.out.println(x + " " + y);
        }
//        y = 10; Error!!!
        x = 60;
        System.out.println(x);
    }
}
