package lesson17;

public class DynStack implements IntStack {
    private int[] stack;
    private int tos;

    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    public void push(int x) {
        if (tos == stack.length - 1) {
            int [] newStack = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
            stack[++tos] = x;
        }else  {
            stack[++tos] = x;
        }
    }

    public int pop() {
        if (tos < 0){
            System.out.println("Stack underflow");
            return 0;
        }else  {
            return stack[tos--];
        }
    }
}
