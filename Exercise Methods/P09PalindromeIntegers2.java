package Exercise4;

import java.util.Scanner;

public class P09PalindromeIntegers2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            if (isPalindrome(input)){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
            input = scanner.nextLine();
        }


    }

    public static boolean isPalindrome(String input){

        String output = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            char currentSymbol = input.charAt(i);
            output += currentSymbol;

        }
        return input.equals(output);
    }
}
