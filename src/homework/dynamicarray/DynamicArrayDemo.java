package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(12);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(46);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(-6);

        int arrayValue = dynamicArray.getByIndex(6);
        System.out.println(arrayValue);

        int arrayValue2 = dynamicArray.getByIndex(30);
        System.out.println(arrayValue2);

        dynamicArray.print();

        dynamicArray.deleteByIndex(3);
        dynamicArray.deleteByIndex(4);
        dynamicArray.set(2, 20);
        dynamicArray.print();
        dynamicArray.set(4, 60);
        dynamicArray.print();
        dynamicArray.add(2, 14);
        dynamicArray.print();
        dynamicArray.exists(999);
        dynamicArray.getIndexByValue(20);

    }
}
