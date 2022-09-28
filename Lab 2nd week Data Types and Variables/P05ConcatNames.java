package Lab2;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        String symbol = scanner.nextLine();

        System.out.printf("%s%s%s",name,symbol,lastName);
    }
}
