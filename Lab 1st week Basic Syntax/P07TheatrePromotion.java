package Lab1;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (age <= 18 && age >=0 ) {
            switch (day) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 5;
                    break;
            }
        } else if (age <= 64 && age > 18) {
            switch (day) {
                case "Weekday":
                    price = 18;
                    break;
                case "Weekend":
                    price = 20;
                    break;
                case "Holiday":
                    price = 12;
                    break;
            }
        } else if (age <= 122 && age > 64) {
            switch (day) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 10;
                    break;
            }
        }else {
            System.out.println("Error!");
            return;
        }
        System.out.printf("%.0f$",price);
    }
}