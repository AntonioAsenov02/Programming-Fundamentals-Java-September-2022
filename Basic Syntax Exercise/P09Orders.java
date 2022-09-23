package Exercise1;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double pricePerCapsule = 0;
        int days = 0;
        int capsuleCount = 0;

        double sum = 0;
        double currentPrice = 0;

        for (int i = 1; i <= countOfOrders ; i++) {
             pricePerCapsule = Double.parseDouble(scanner.nextLine());
             days = Integer.parseInt(scanner.nextLine());
             capsuleCount = Integer.parseInt(scanner.nextLine());
             currentPrice = days * capsuleCount * pricePerCapsule;

                System.out.printf("The price for the coffee is: $%.2f%n",currentPrice);
                sum += currentPrice;
            }

            System.out.printf("Total: $%.2f",sum);
        }
    }
