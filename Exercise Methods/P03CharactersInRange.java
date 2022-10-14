package Exercise4;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char last = scanner.nextLine().charAt(0);

        printSymbolsFirstToLast(first, last);
    }

    public static void printSymbolsFirstToLast(char first, char last) {

        if (first < last) {

            for (char i = (char) (first + 1); i < last; i++) {
                System.out.print(i + " ");
            }


        } else {
            for (char j = (char) (last + 1); j < first; j++) {
                System.out.print(j + " ");
            }

        }
    }
}