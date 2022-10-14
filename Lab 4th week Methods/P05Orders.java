package Lab4;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (productInput) {
            case "coffee":
                printTotalSum(quantity,1.5);
                break;
            case "water":
                printTotalSum(quantity,1.0);
                break;
            case "coke":
                printTotalSum(quantity,1.4);
                break;
            case "snacks":
                printTotalSum(quantity, 2.0);
                break;
        }
    }
    public static void printTotalSum(int quantity, double price){

        double totalSum = quantity * price;
        System.out.printf("%.2f",totalSum);
    }
}
