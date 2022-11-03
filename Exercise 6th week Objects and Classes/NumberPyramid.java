package Excercises6;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        int currentNumber = 0;

        for (int rows = 1; rows <= n ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                currentNumber++;
                if (currentNumber > n){
                    flag = true;
                    break;
                }
                System.out.print(currentNumber + " ");

            }
            if (flag){
                break;
            }
            System.out.println();

        }
    }
}
