package lesson17;

class A {
    public interface NestedIf{
        boolean test(int x);
    }
}

class B implements A.NestedIf{
    public boolean test(int x) {
        return x < 0 ? false : true;
    }
}

class Test {
    public static void main(String[] args) {
        A.NestedIf a = new B();

        if(a.test(10)){
            System.out.println(true);
        }
        if(a.test(-12)){
            System.out.println(false);
        }
    }
}