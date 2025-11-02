package lesson17;

public interface C {
    void meth1();
    void meth2();
}

interface D extends C{
    void meth3();
}

class MyClass implements D{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
}

class IfExtendTest{
    public static void main(String[] args) {
        MyClass m = new MyClass();

        m.meth1();
        m.meth2();
        m.meth3();
    }
}
