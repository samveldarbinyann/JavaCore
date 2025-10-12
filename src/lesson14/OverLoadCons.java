package lesson14;

public class OverLoadCons {
    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 30);
        Box myBox2 = new Box();
        Box myCube = new Box(5);

        Box myClone = new Box(myBox);

        double vol;

        vol = myBox.volume();
        System.out.println("Volume of Box: " + vol);
        vol = myBox2.volume();
        System.out.println("Volume of Box: " + vol);
        vol = myCube.volume();
        System.out.println("Volume of Box: " + vol);
        vol = myClone.volume();
        System.out.println("Volume of Box: " + vol);
    }
}
