package Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("End")) {

            String[] elements = command.split("\\s+");

            if (command.contains("Add")) {
                numbersList.add(Integer.parseInt(elements[1]));
            } else if (command.contains("Insert")) {
                if (Integer.parseInt(elements[2]) > numbersList.size() - 1 && Integer.parseInt(elements[2]) < 0){
                    System.out.println("Invalid index");
                }else {
                    numbersList.add(Integer.parseInt(elements[2]), Integer.parseInt(elements[1]));
                }
            } else if (command.contains("Remove")) {
                if (Integer.parseInt(elements[1]) > numbersList.size() - 1 && Integer.parseInt(elements[1]) < 0 ){
                    System.out.println("Invalid index");
                }else {
                    numbersList.remove(Integer.parseInt(elements[1]));
                }
            } else if (command.contains("left")) {
                printLeftList(numbersList, command);
            } else if (command.contains("right")) {
                printRightList(numbersList,command);
            }


            command = scanner.nextLine();
        }

        for (int element : numbersList) {
            System.out.print(element + " ");
        }
    }

    public static void printLeftList(List<Integer> numbersList, String command) {

        String[] elements = command.split("\\s+");
        int elementCount = Integer.parseInt(elements[2]);

        for (int i = 1; i <= elementCount; i++) {

            int currentNumber = numbersList.get(0);
            numbersList.add(currentNumber);
            numbersList.remove(0);
        }
    }

    public static void printRightList(List<Integer> numbersList, String command) {

        String[] elements = command.split("\\s+");
        int elementCount = Integer.parseInt(elements[2]);

        for (int i = 1; i <= elementCount; i++) {

            int currentNumber = numbersList.get(numbersList.size() -1 );
            numbersList.add(0,currentNumber);
            numbersList.remove(numbersList.size() - 1);
        }
    }
}