package Lab6;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFound = false;

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                count++;

                if (i + j == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,magicNumber);
                    isFound = true;
                    break;
                }

            }
            if (isFound == true){
            break;

        }
    }
        if (!isFound){
            System.out.printf("%d combinations - neither equals %d",count,magicNumber);
        }
}
    }