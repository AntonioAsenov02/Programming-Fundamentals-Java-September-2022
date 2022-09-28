package Lab2;

import java.util.Scanner;

public class P12RefactorSpecialNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfInters = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countOfInters; i++) {
            int currentNumber = i;
            int sum = 0;
            while (currentNumber > 0) {
                sum = sum + currentNumber % 10;
                currentNumber = currentNumber / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }
}
