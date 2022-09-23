package Exercise1;

import java.util.Scanner;

public class P11RageExpenses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadsets = lostGames / 2;
        int countMouses = lostGames / 3;
        int countKeyboards = lostGames / 6;
        int countDisplay = lostGames / 12;

        double rageExpenses = countHeadsets * headsetPrice + countMouses * mousePrice
                + countKeyboards * keyboardPrice + countDisplay * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",rageExpenses);

    }
}
