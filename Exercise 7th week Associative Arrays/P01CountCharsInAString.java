package Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine().replaceAll(" ", "");


        Map<Character,Integer> charactersMap = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {

            if (!charactersMap.containsKey(symbol)){
                charactersMap.put(symbol,1);
            }else {
                int value = charactersMap.get(symbol);
                charactersMap.put(symbol,value + 1);
            }
        }

        charactersMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
