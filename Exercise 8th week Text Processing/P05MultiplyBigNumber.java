package Exercise8;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        BigInteger number1 = new BigInteger(scanner.nextLine());
        BigInteger number2 = new BigInteger(scanner.nextLine());

        BigInteger sum = number1.multiply(number2);

        System.out.println(sum);
    }
}
