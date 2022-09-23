package Exercise1;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String pack = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (day) {
            case "Friday":
                switch (pack) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15;
                        break;
                }
        }
        switch (day) {

            case "Saturday":
                switch (pack) {
                    case "Students":
                        price = 9.80;
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20;
                        break;
                }
        }
        switch (day) {
            case "Sunday":
                switch (pack) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16;
                        break;
                    case "Regular":
                        price = 22.50;
                        break;
                }
        }
        double allPrice = peopleNumber * price;


        if (peopleNumber >= 30) {
            switch (pack) {
                case "Students":
                    price = allPrice - (allPrice * 0.15);
                    System.out.printf("Total price: %.2f",price);
                    return;
            }
        }
        if (peopleNumber >= 100) {
            switch (pack) {
                case "Business":
                    price = (peopleNumber - 10) * price;
                    System.out.printf("Total price: %.2f",price);
                    return;
            }
        }
        if (peopleNumber >= 10 && peopleNumber <= 20) {
            switch (pack) {
                case "Regular":
                    price = allPrice - (allPrice * 0.05);
                    System.out.printf("Total price: %.2f",price);
                    return;
            }
        }
        System.out.printf("Total price: %.2f", allPrice);
    }
}