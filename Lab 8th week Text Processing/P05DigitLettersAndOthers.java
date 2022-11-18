package Lab8;

import java.util.Scanner;

public class P05DigitLettersAndOthers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        boolean isLetter = false;
        boolean idDigit = false;
        boolean isOtherSymbol = false;

        String letters = "";
        String digits = "";
        String otherSymbols = "";
        for (int i = 0; i < input.length(); i++) {

            char currentSymbol = input.charAt(i);


            if (currentSymbol >= 65 && currentSymbol <= 90 || currentSymbol >= 97 && currentSymbol <= 122){
                isLetter = true;
            }else if (currentSymbol >= 48 && currentSymbol <= 57){
                idDigit = true;
            }else {
                isOtherSymbol = true;
            }

            if (isLetter){
                letters += currentSymbol;
            }

            if (idDigit){
                digits += currentSymbol;
            }

            if (isOtherSymbol){
                otherSymbols += currentSymbol;
            }

            isLetter = false;
            idDigit = false;
            isOtherSymbol =false;
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(otherSymbols);
    }
}
