package Exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06ReplaceRepeatingChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        List<Character> symbolsList = new ArrayList<>();

        int symbolCount = 0;
        for (char symbol : input.toCharArray()) {

            if (symbolsList.size() == 0) {
                symbolsList.add(symbol);
            }else {

                char currentSymbol = symbolsList.get(symbolsList.size() - 1);
                if (symbol == currentSymbol){
                    symbolCount++;
                }else {
                    symbolCount = 0;
                    symbolsList.add(symbol);
                }

            }


        }
        for (char character : symbolsList) {
            System.out.print(character);
        }
    }
}
