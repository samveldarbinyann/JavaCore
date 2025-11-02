package lesson18;

import java.util.Random;

//public class Exc0 {
//    public static void main(String[] args) {
//        int d = 0;
//        int a = 42 / 0;
//
//    }
//}

//class Exc1 {
//    static void subroutine(){
//        int d = 0;
//        int a = 42 / 0;
//    }
//
//    public static void main(String[] args) {
//        subroutine();
//    }
//}
//
//class Exc2{
//    public static void main(String[] args) {
//        int a, d;
//        try{
//            d = 0;
//            a = 42 /d;
//            System.out.println("No message");
//        }catch(ArithmeticException e){
//            System.out.println("Division by zero");
//        }
//    }
//}

//class HandleError {
//    public static void main(String[] args) {
//        int a = 0, b = 0, c = 0;
//        Random rand = new Random();
//        for (int i = 0; i < 32000; i++) {
//            try {
//                b = rand.nextInt();
//                c = rand.nextInt();
//                a = 12345 / (b / c);
//            } catch (ArithmeticException e) {
//                System.out.println("Error - " + e );
//                a = 0;
//            }
//
//            System.out.println("a = " + a);
//        }
//    }
//}

//class MultipleCatches {
//    public static void main(String[] args) {
//        try {
//            int a = args.length;
//            System.out.println("a = " + a);
//            int b = 42 / a;
//            int c[] = {1};
//            c[42] = 99;
//        } catch (ArithmeticException e) {
//            System.out.println("Division by zero " + e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error Array index out of bounds " + e);
//        }
//        System.out.println("After");
//    }
//}

//class SupperSubCatch{
//    public static void main(String[] args) {
//        try {
//            int a = 0;
//            int b = 42/a;
//        }catch (Exception e){
//            System.out.println("Exception");
//        }
//    }
//}

//class NestTry{
//    public static void main(String[] args) {
//        try{
//            int a = args.length;
//            int b = 42/a;
//            System.out.println("a = " + a);
//            try{
//                if(a == 1){
//                    a = a/(a-a);
//                }
//                if(a == 2){
//                    int c[] = {1};
//                    c[42]= 99;
//                }
//            }catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Index out of bounds " + e);
//            }
//        }catch(ArithmeticException e){
//            System.out.println("Division by zero " + e);
//        }
//    }
//}

//class MethNestTry {
//    static void nesttry(int a) {
//        try {
//            if (a == 1) {
//                a = a / (a - a);
//            }
//            if (a == 2) {
//                int c[] = {1};
//                c[42] = 99;
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("index out of bounds " + e);
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            int a = args.length;
//            int b = 42 / a;
//            System.out.println("a = " + a);
//            nesttry(a);
//        } catch (ArithmeticException e) {
//            System.out.println("error " + e);
//        }
//    }
//}

//class ThrowDemo {
//    static void demoproc() {
//        try {
//            throw new NullPointerException("Test");
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException");
//            throw e;
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            demoproc();
//        } catch (NullPointerException e) {
//            {
//                System.out.println("NullPointerException " + e);
//            }
//        }
//    }
//}

//class ThrowsDemo {
//    static void throwOne() throws IllegalAccessException {
//        System.out.println("Throwing Exception");
//        throw new IllegalAccessException();
//    }
//
//    public static void main(String[] args) {
//        try {
//            throwOne();
//        } catch (IllegalAccessException e) {
//            System.out.println("Caught Exception " + e);
//        }
//    }
//}

//class FinallyDemo {
//    static void procA() {
//        try {
//            System.out.println("procA");
//            throw new RuntimeException("Demo");
//        } finally {
//            System.out.println("FinallyDemo");
//        }
//    }
//
//    static void procB() {
//        try {
//            System.out.println("procB");
//            return;
//        } finally {
//            System.out.println("FinallyDemo procB");
//        }
//    }
//
//    static void procC() {
//        try {
//            System.out.println("procC");
//        } finally {
//            System.out.println("FinallyDemo procC");
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            procA();
//        } catch (Exception e) {
//            System.out.println("procA Exception");
//        }
//
//        procB();
//        procC();
//    }
//}
//

//class MyException extends Exception {
//    private int detail;
//
//    MyException(int a) {
//        detail = a;
//    }
//
//    public String toString() {
//        return "MyException: " + detail;
//    }
//}
//
//class ExceptionDemo {
//    static void compute(int a) throws MyException {
//        System.out.println("MyException: " + a);
//        if (a > 10) {
//            throw new MyException(a);
//        }
//        System.out.println("Normal.");
//    }
//
//    public static void main(String[] args) {
//        try {
//            compute(1);
//            compute(20);
//        } catch (MyException e) {
//            System.out.println("MyException: " + e);
//        }
//    }
//}

//class ChainExcDemo {
//    static void demoproc() {
//        NullPointerException e = new NullPointerException("Верхний уровень");
//        e.initCause(new ArithmeticException("Причина"));
//        throw e;
//    }
//
//    public static void main(String[] args) {
//        try {
//            demoproc();
//        } catch (NullPointerException e) {
//            System.out.println("Перехвачено " + e);
//            System.out.println("Первопричина " + e.getCause());
//        }
//    }
//}


//class MultiCatch {
//    public static void main(String[] args) {
//        int a = 10, b = 0;
//        int vals[] = {1, 2, 3};
//
//        try {
//            int result = a / b;
//            vals[10] = 19;
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception " + e);
//        }
//        System.out.println("After Exceptions");
//    }
//}