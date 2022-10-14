package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println(df.format(calculate(firstNumber,operator,secondNumber)));


    }
    public static double calculate(int firstNumber , String operator, int secondNumber){

        double result = 0;
        switch (operator){
            case "/" :
                result = Math.abs(firstNumber / secondNumber);
                break;
            case "*" :
                result = Math.abs(firstNumber * secondNumber);
                break;
            case "+" :
                result = Math.abs(firstNumber + secondNumber);
                break;
            case "-" :
                result = Math.abs(firstNumber - secondNumber);
                break;
        }
        return result;
    }
}
