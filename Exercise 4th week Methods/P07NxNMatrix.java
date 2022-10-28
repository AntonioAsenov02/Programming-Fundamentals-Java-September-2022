package Exercise4;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        printMatrix(num);

    }
    public static void printMatrix(int num){

        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <= num ; col++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
