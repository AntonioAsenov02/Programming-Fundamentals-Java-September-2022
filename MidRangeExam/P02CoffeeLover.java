package MidRangeRealTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CoffeeLover {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" "))
                                .collect(Collectors.toList());



        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        while (numberOfCommands > 0){

            String input = scanner.nextLine();

            String [] commandElements = input.split(" ");

            String command = commandElements[0];

            switch (command){

                case "Include" :
                    coffeeList.add(commandElements[1]);
                    break;
                case  "Remove" :

                    String elementToRemove = commandElements[1];
                    int indexOfElement = Integer.parseInt(commandElements[2]);

                    if (indexOfElement <= coffeeList.size() - 1){

                        if (elementToRemove.equals("first")){
                            for (int i = 1; i <= indexOfElement ; i++) {
                                coffeeList.remove(0);
                            }

                            }else if (elementToRemove.equals("last")){
                            for (int i = 1; i <= indexOfElement ; i++) {
                                coffeeList.remove(coffeeList.size() - 1);
                            }
                        }
                    }
                    break;
                case  "Prefer" :

                    int firstIndex = Integer.parseInt(commandElements[1]);
                    int secondIndex = Integer.parseInt(commandElements[2]);

                    if (firstIndex <= coffeeList.size() - 1 && secondIndex <= coffeeList.size() - 1){

                        String valueOfFirstElement = coffeeList.get(firstIndex);
                        String valueOfSecondElement = coffeeList.get(secondIndex);

                        coffeeList.set(firstIndex,valueOfSecondElement);
                        coffeeList.set(secondIndex,valueOfFirstElement);
                    }
                    break;
                case  "Reverse" :

                    Collections.reverse(coffeeList);
                    break;
            }

            numberOfCommands--;




        }

        System.out.println("Coffees:");
       // System.out.println();
        for (String element : coffeeList)  {
            System.out.print(element + " ");
        }
    }
}
