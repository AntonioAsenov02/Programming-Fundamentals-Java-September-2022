package Exercise4;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String output = "";
        while (!input.equals("END")){
            for (int i = input.length() - 1; i >= 0 ; i--) {
                char currentSymbol = input.charAt(i);
                output += currentSymbol;


            }
            if (input.equals(output)){
                System.out.println(true);
                output = "";
        }else {
                System.out.println(false);
                output = "";
            }

            input = scanner.nextLine();
        }
    }
}
