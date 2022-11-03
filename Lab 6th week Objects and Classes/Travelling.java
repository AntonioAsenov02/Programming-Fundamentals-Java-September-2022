package Lab6;


import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;

            while (sum < budget){
                sum += Double.parseDouble(scanner.nextLine());

            }
            System.out.printf("Going to " + destination + "!%n");

            destination = scanner.nextLine();
        }
    }
}
