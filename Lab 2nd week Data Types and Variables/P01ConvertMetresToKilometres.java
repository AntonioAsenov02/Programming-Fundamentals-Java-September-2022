package Lab2;

import java.util.Scanner;

public class P01ConvertMetresToKilometres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int metres = Integer.parseInt(scanner.nextLine());

        double kilometres = metres / 1000.0;

        System.out.printf("%.2f",kilometres);


    }
}
