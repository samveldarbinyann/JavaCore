package lesson17;

public class IfTest2 {
    public static void main(String[] args) {
        DynStack myDynStack = new DynStack(5);
        DynStack myDynStack2 = new DynStack(10);

        for (int i = 1; i <= 20; i++) {
            myDynStack.push(i);
        }
        for (int i = 1; i <= 50; i++) {
            myDynStack2.push(i);
        }

        System.out.println("Stack after popping: ");
        for (int i = 1; i <= 20; i++) {
            System.out.println(myDynStack.pop());
        }
        System.out.println("Stack after popping: ");
        for (int i = 1; i <= 50; i++) {
            System.out.println(myDynStack2.pop());
        }
    }
}
