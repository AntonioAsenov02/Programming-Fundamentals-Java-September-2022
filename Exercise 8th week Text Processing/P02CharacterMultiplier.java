package Exercise8;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();

        String[] inputArr = input.split("\\s+");

        String first = inputArr[0];
        String second = inputArr[1];

        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();

        int sum = 0;

        int length = 0;
        int smallerLength = 0;

        if (firstArr.length > secondArr.length){
            length = firstArr.length;
            smallerLength = secondArr.length;
        }else {
            length = secondArr.length;
            smallerLength = firstArr.length;
        }

        for (int i = 0; i < length ; i++) {


            while (smallerLength - 1 >= i){
                sum += firstArr[i] * secondArr[i];
                i++;
            }

            if (firstArr.length > secondArr.length){
                sum += firstArr[i];
            }else if (secondArr.length > firstArr.length){
                sum += secondArr[i];
            }

        }
        System.out.println(sum);
    }
}
