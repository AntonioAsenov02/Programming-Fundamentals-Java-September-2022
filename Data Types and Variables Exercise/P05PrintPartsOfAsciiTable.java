package Exercise2;

import java.util.Scanner;

public class P05PrintPartsOfAsciiTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        for (int code = first; code <= last ; code++) {
            System.out.print((char) code + " ");

        }

        }
    }
