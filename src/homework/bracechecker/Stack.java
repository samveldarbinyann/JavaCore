package homework.bracechecker;

public class Stack {
    private int[] array = new int[10];
    private int size;

    Stack() {
        size = -1;
    }

    void push(int value) {
        if (size == array.length) {
            System.out.println("Stack is full");
        }else {
            array[++size] = value;
        }
    }

    int pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return 0;
        }else {
            return array[size--];
        }
    }
}
