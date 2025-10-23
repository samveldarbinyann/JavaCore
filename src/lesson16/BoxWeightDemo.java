package lesson16;

public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight mybox = new BoxWeight(10,20,30,40);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.125);

        double vol;
        vol = mybox.volume();
        System.out.println("Volume of BoxWeight is: " + vol);
        vol = mybox2.volume();
        System.out.println("Volume of BoxWeight is: " + vol);
    }
}
