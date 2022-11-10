package Exercise7;

import java.util.*;

public class P07LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();


        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");

            for (int i = 0; i <= inputArr.length - 1; i += 2) {

                int quantity = Integer.parseInt(inputArr[i]);
                String element = inputArr[i + 1].toLowerCase();

                if (element.equals("shards") || element.equals("fragments") || element.equals("motes")) {
                    int currentQuantity = items.get(element);
                    items.put(element, currentQuantity + quantity);
                } else {

                    if (!junkItems.containsKey(element)) {
                        junkItems.put(element, quantity);
                    } else {

                        int currentQuantity = junkItems.get(element);
                        junkItems.put(element, currentQuantity + quantity);
                    }
                }

                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin){
                break;
            }
        }

            items.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
            junkItems.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        }
    }
