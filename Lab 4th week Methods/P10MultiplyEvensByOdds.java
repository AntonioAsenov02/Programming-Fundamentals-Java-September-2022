package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int num = Math.abs(Integer.parseInt(scanner.nextLine()));


        System.out.println(getMultipleOfEvenAndOdds(num));

    }

    public static int getMultipleOfEvenAndOdds(int num){

        int evensSum = getEvenSum(num);
        int oddsSum = getOddsSum(num);

        return evensSum * oddsSum;
    }

    public static int getEvenSum(int num){

        String intToString = Integer.toString(num);

        int[] arr = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();


        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;

    }
    public static int getOddsSum(int num){

        String intToString = Integer.toString(num);

        int[] arr = Arrays.stream(intToString.split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
