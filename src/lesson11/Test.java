package lesson11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Enter day");
        int day = sc.nextInt();

        int[] price = {0, 100, 250, 150};
        int ticketPrice = 0;
//        int price = 0;
//        int price2 = 100;
//        int price3 = 250;
//        int price4 = 150;

        switch (day) {
            case 6:
            case 7:
                for (int i = 0; i < price.length; i++) {
                    price[i] += 50;
                }
                break;
        }

        if (age >= 0) {
            if (age < 6) {
                ticketPrice = price[0];
                System.out.println("Ticket price is " + price[0]);
            } else if (age <= 17) {
                ticketPrice = price[1];
                System.out.println("Ticket price is " + price[1]);
            } else if (age <= 59) {
                ticketPrice = price[2];
                System.out.println("Ticket price is " + price[2]);
            } else {
                ticketPrice = price[3];
                System.out.println("Ticket price is " + price[3]);
            }
        }

        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        int total = ticketPrice * quantity;


        System.out.println("Total amount = " + total);


    }
}
