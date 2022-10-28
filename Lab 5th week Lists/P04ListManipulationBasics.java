package Lab5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("end")){


            String [] elements  = input.split(" ");
            if (input.contains("Add")){
                int firstElement = Integer.parseInt(elements[1]);

                numbersList.add(firstElement);
            } else if (input.contains("RemoveAt")){
                int element = Integer.parseInt(elements[1]);

                numbersList.remove(element);
            } else if (input.contains("Remove")){
                int element = Integer.parseInt(elements[1]);

                numbersList.remove(Integer.valueOf(element));

            }else if (input.contains("Insert")){
                int firstElement = Integer.parseInt(elements[1]);
                int secondElement = Integer.parseInt(elements[2]);

                numbersList.add(secondElement,firstElement);
            }


            input = scanner.nextLine();
        }
        if (input.equals("end")){
            for (int element : numbersList) {
                System.out.print(element + " ");
            }
        }
    }
}
