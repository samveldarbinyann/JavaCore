package lesson17;

public class Client implements Callback {
    @Override
    public void callback(int x) {
        System.out.println(x);
    }
}
