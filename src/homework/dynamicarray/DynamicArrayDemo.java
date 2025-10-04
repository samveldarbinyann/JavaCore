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
    }
}
