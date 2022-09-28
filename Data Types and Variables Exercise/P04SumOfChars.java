package Exercise2;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int symbolsCount = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int currentSymbol = 1; currentSymbol <= symbolsCount ; currentSymbol++) {

            char value = scanner.nextLine().charAt(0);
            sum += (int) value;

        }
        System.out.printf("The sum equals: %d",sum);
    }
}
