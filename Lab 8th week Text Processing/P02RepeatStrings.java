package Lab8;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i <= inputArr.length - 1 ; i++) {

            String word = inputArr[i];


            for (int j = 0; j <= word.length() - 1 ; j++) {
                System.out.print(word);
            }
        }
    }
}
