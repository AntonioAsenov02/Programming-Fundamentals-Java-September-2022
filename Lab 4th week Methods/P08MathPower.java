package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double numberInput = Double.parseDouble(scanner.nextLine());
        int multiplyTimesInput = Integer.parseInt(scanner.nextLine());

        double result = mathPower(numberInput,multiplyTimesInput);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }
    public static double mathPower(double number, int multiplier){

        double result = Math.pow(number,multiplier);;



        return result;
    }
}
