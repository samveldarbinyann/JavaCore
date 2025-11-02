package lesson17;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "Default String";
    }

    static int getDefaultNumber() {
        return 0;
    }
}

class MyIfImpl implements MyIf {
    public int getNumber() {
        return 100;
    }
}
class MyIf2 implements MyIf {
    public int getNumber() {
        return 200;
    }
    public String getString() {
        return "Another Default String";
    }
}

class DefaultIfImpl{
    public static void main(String[] args) {
        MyIfImpl mi = new MyIfImpl();
        System.out.println(mi.getNumber());
        System.out.println(mi.getString());
    }
}