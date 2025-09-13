package lesson6;

public class LightSpeed {
    public static void main(String[] args) {
        int lightspeed = 186000;
        long day = 1000;
        long seconds = day * 24 * 60 * 60;
        long distance = lightspeed * seconds;
        System.out.println("The distance between the light speed is " + distance + " MH");
    }
}
