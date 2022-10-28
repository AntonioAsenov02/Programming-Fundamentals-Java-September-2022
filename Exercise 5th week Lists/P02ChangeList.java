package Exercise5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){

            String[] elements = command.split(" ");
            if (command.contains("Delete")){
                numbersList.removeAll(Collections.singleton(Integer.valueOf(elements[1])));
            }else if (command.contains("Insert")){
                numbersList.add(Integer.valueOf(elements[2]),Integer.valueOf(elements[1]));
            }


            command = scanner.nextLine();
        }

        for (int element : numbersList) {
            System.out.print(element + " ");
        }
    }
}
