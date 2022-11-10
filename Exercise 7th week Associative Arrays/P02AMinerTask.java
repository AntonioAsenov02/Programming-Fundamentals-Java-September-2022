package Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        String input = scanner.nextLine();
        Map<String, Integer> itemsMap = new LinkedHashMap<>();

        while (!input.equals("stop")){

            int quantity = Integer.parseInt(scanner.nextLine());

            if (!itemsMap.containsKey(input)){

                itemsMap.put(input,quantity);
            }else {
                int resources = itemsMap.get(input);
                itemsMap.put(input,resources + quantity);
            }


            input = scanner.nextLine();
        }

        itemsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
