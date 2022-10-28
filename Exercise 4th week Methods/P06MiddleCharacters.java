package Exercise4;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleSymbol(input);

    }
    public static void printMiddleSymbol(String text){

        if (text.length() % 2 != 0){
            int indexOfiMiddleCharacter  = text.length() / 2;

            System.out.println(text.charAt(indexOfiMiddleCharacter));
        }else {

            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;

            System.out.println("" + text.charAt(indexFirstMiddleCharacter) + text.charAt(indexSecondMiddleCharacter));
        }
    }
}
