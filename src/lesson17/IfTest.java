package lesson17;

public class IfTest {
    public static void main(String[] args) {
        FixedStack myStack = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(10);

        for (int i = 1; i <= 5; i++) {
            myStack.push(i);
        }
        for (int i = 1; i <= 10; i++) {
            myStack2.push(i);
        }

        System.out.println("myStack: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println(myStack.pop());
        }
        System.out.println("myStack2: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
