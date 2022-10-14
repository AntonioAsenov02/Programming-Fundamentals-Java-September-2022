package Exercise4;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            // дали се дели на 8
            // дали има поне едно нечетно число
            if (isSumOfDigitsDivisibleBy8(i) && isNumberOdd(i)){
                System.out.println(i);
            }

        }
    }
    public static boolean isSumOfDigitsDivisibleBy8(int number){

        int sum = 0;

        while (number > 0){
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        if (sum % 8 == 0){
            return true;
        }else {
            return false;
        }

    }
    public static boolean isNumberOdd(int number){

        while (number > 0) {

            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;

            }
        }
        return false;
    }
}
