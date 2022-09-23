package Exercise1;

import java.util.Scanner;

public class P07VendingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1.0 && coins != 2.0) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {

                sum += coins;
            }
                input = scanner.nextLine();

        }
        String input2 = scanner.nextLine();

        while (!input2.equals("End")){

            double price = 0;
            boolean isValid = true;
            switch (input2){
                case "Nuts" :
                    price = 2.0;
                    break;
                case "Water" :
                    price = 0.7;
                    break;
                case "Crisps" :
                    price = 1.5;
                    break;
                case "Soda" :
                    price = 0.8;
                    break;
                case "Coke" :
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    isValid = false;
                    break;
            }

            if (sum >= price && isValid){
                System.out.printf("Purchased %s%n",input2);
                sum = sum - price;
            }else if (sum < price && isValid){
                System.out.printf("Sorry, not enough money%n");
            }


            input2 = scanner.nextLine();
        }
        if (input2.equals("End")){
            System.out.printf("Change: %.2f",sum);
        }
    }
}
