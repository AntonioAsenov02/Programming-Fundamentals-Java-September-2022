package Lab2;

import javafx.util.converter.BigDecimalStringConverter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class P03ExactSuOfRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(BigInteger.valueOf(0));

        for (int i = 1; i <= num ; i++) {

            BigDecimal currentNum = new BigDecimal(scanner.nextLine());

            sum = sum.add(currentNum);

        }
        System.out.println(sum);
    }
}
