package lesson17;

public class IfTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(30);
        FixedStack fs = new FixedStack(10);

        mystack = ds;
        for (int i = 0; i <= 50; i++) {
            mystack.push(i);
        }
        mystack = fs;
        for (int i = 0; i <= 10; i++) {
            mystack.push(i);
        }


        mystack = ds;
        System.out.println("Stack after popping: ");
        for (int i = 1; i <= 50; i++) {
            System.out.println(mystack.pop());
        }
        mystack = fs;
        System.out.println("Stack after popping: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(mystack.pop());
        }
    }
}
