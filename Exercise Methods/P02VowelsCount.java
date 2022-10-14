package Exercise4;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();


        printVowelsCount(textInput.toLowerCase());
    }
    public static void printVowelsCount(String text){

        int vowelsCount = 0;

        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'u' || symbol == 'i' || symbol == 'o' || symbol == 'e'){
                vowelsCount++;
        }

        }
        System.out.println(vowelsCount);
    }
}
