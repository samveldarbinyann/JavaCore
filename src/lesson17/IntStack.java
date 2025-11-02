package lesson17;

public interface IntStack {
    void push(int x);
    int pop();

    default void clear(){
        System.out.println("The method is not used.");
    }

    default int[] popNElements(int n){
        return getElements(n);
    }

    default int[] skipAndPopNElements(int skip, int n){
        getElements(skip);
        return getElements(n);
    }

    private int[] getElements(int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = pop();
        }
        return result;
    }
}
