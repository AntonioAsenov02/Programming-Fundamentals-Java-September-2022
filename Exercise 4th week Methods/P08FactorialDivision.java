package Exercise4;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        long factorial1 = getFactorial(num1);
        long factorial2 = getFactorial(num2);


        double factorialDivision = factorial1 * 1.0 / factorial2;

        System.out.printf("%.2f",factorialDivision);
    }
    public static long getFactorial(int num){

        long factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
