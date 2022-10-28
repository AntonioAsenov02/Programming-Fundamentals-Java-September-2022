package Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] element = input.split(" ");
            if (input.contains("Add")) {
                wagonsList.add(Integer.valueOf(element[1]));
            } else {
                int passengersToAdd = Integer.parseInt(element[0]);
                for (int index = 0; index < wagonsList.size(); index++) {
                    int currentWagon = wagonsList.get(index);
                    if (currentWagon + passengersToAdd <= maxCapacity){
                        wagonsList.set(index,currentWagon + passengersToAdd);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int element : wagonsList) {
            System.out.print(element + " ");
        }
    }
}
