package lesson12;

public class BoxTest {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();

        mybox.width = 100;
        mybox.height = 100;
        mybox.depth = 100;

        mybox2.width = 200;
        mybox2.height = 200;
        mybox2.depth = 200;

        System.out.println(mybox2.isLargerThan(mybox));

    }
}