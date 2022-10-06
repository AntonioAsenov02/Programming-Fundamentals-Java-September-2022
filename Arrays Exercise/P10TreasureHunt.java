package Exercise3;

import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] itemsArr = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {

            String[] commandParts = command.split(" ");


            switch (commandParts[0]) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {

                        boolean alreadyContains = false;
                        for (int j = 0; j < itemsArr.length; j++) {

                            if (commandParts[i].equals(itemsArr[j])) {
                                alreadyContains = true;
                                break;
                            }
                        }
                        if (!alreadyContains) {
                            String newTreasureChest = commandParts[i] + " " + String.join(" ", itemsArr);
                            itemsArr = newTreasureChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(commandParts[1]);

                    if (position <= itemsArr.length - 1 && position >= 0) {

                        String dropItem = itemsArr[position];

                        for (int i = position; i < itemsArr.length - 1; i++) {

                            itemsArr[i] = itemsArr[i + 1];

                        }
                        itemsArr[itemsArr.length - 1] = dropItem;

                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int numberOfStealingItems = Integer.parseInt(commandParts[1]);

                    if (numberOfStealingItems >= 0 && numberOfStealingItems < itemsArr.length) {
                        for (int i = 0; i < numberOfStealingItems; i++) {

                            System.out.print(itemsArr[itemsArr.length - numberOfStealingItems + i]);

                            if (i != numberOfStealingItems - 1) {
                                System.out.print(", ");

                            }

                        }
                        String[] tempoChest = new String[itemsArr.length - numberOfStealingItems];
                        for (int i = 0; i < tempoChest.length; i++) {
                            tempoChest[i] = itemsArr[i];
                        }
                        itemsArr = tempoChest;


                    } else if (numberOfStealingItems >= 0) {
                        for (int i = 0; i < itemsArr.length; i++) {

                            System.out.print(itemsArr[i]);

                            if (i != itemsArr.length - 1) {
                                System.out.print(", ");
                            }
                        }

                        itemsArr = new String[0];
                    }
                    System.out.println();
                    break;
            }


            command = scanner.nextLine();

        }


        String treasureCount = String.join("", itemsArr);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }

        double averageTreasure = (1.0 * charCounter / itemsArr.length);

        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);

        } else {
            System.out.println("Failed treasure hunt.");
        }

    }
}
