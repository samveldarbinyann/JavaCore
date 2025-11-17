package lesson19;

import java.util.Arrays;

public enum Apple {
    Jonathan(10), GoldenDel(20), RedDel(9), Winesap(30), Cortland(14);
    private int price;

    Apple(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    Apple(){
        price = 0;
    }
    }

//class EnumDemo {
//    public static void main(String[] args) {
//        Apple ap;
//        ap = Apple.Jonathan;
//        System.out.println(ap);
//        ap = Apple.GoldenDel;
//        System.out.println(ap);
//        ap = Apple.RedDel;
//        System.out.println(ap);
//
//        switch (ap) {
//            case Jonathan:
//                System.out.println("Jonathan");
//                break;
//            case GoldenDel:
//                System.out.println("GoldenDel");
//                break;
//            case RedDel:
//                System.out.println("RedDel");
//                break;
//        }
//    }
//}

//class EnumDemo2 {
//    public static void main(String[] args) {
//        Apple ap;
//
//        Apple apples[] = Apple.values();
//        for (Apple apple : apples) {
//            System.out.println(apple.name());
//        }
//
//        ap = Apple.valueOf("Jonathan");
//        System.out.println(ap);
//    }
//}

class EnumDemo3 {
    public static void main(String[] args) {
        for (Apple apple : Apple.values()) {
            System.out.println(apple.getPrice()+" Cents");
        }
    }
}