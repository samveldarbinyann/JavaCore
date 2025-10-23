package lesson16;

public class FindAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,15);
        Triangle t = new Triangle(15,20);
        Figure x;

        x = r;
        System.out.println("area = " + x.area());
        x = t;
        System.out.println("area = " + x.area());
    }
}
