package Exercise2;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        double sum = (n1 + n2) / n3 * n4;

        System.out.printf("%.0f",sum);
    }
}
