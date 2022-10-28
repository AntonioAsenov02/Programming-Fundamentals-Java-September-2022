package Lab5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulatorAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            String[] elements = command.split(" ");
            int element;
            if (command.contains("Contains")) {
                element = Integer.parseInt(elements[1]);
                containsNumber(integerList, element);
            } else if (command.contains("even")) {
                printEvenNumbers(integerList);
            } else if (command.contains("odd")) {
                printOddNumbers(integerList);
            } else if (command.contains("Get")) {
                printNumbersSum(integerList);
            } else if (command.contains("Filter")) {
                printFilteredNumbers(integerList, elements[1], Integer.parseInt(elements[2]));
            }


            command = scanner.nextLine();
        }
    }

    public static void containsNumber(List<Integer> numbersList, int number) {

        if (numbersList.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEvenNumbers(List<Integer> numbersLit) {

        for (int element : numbersLit) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(List<Integer> numbersLit) {

        for (int element : numbersLit) {
            if (element % 2 != 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static void printNumbersSum(List<Integer> numberList) {

        int sum = 0;
        for (int element : numberList) {
            sum += element;
        }
        System.out.println(sum);
    }

    public static void printFilteredNumbers(List<Integer> numbersList, String condition, int number) {

        switch (condition) {
            case ">":
                for (int element : numbersList) {
                    if (element > number) {
                        System.out.print(element + " ");
                    }

                }
                System.out.println();
                break;
            case ">=":
                for (int element : numbersList) {
                    if (element >= number) {
                        System.out.print(element + " ");
                    }
                }
                System.out.println();
                break;
            case "<":
                for (int element : numbersList) {
                    if (element < number) {
                        System.out.print(element + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int element : numbersList) {
                    if (element <= number) {
                        System.out.print(element + " ");
                    }
                }
                System.out.println();
                break;
        }
    }
}
