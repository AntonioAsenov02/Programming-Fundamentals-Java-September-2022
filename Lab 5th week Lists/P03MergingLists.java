package Lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();


        int minList = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minList; i++) {

            int numberFirstList = firstList.get(i);
            int numberSecondList = secondList.get(i);

            resultList.add(numberFirstList);
            resultList.add(numberSecondList);

        }
        if (firstList.size() > secondList.size()){
            resultList.addAll(firstList.subList(minList, firstList.size()));
        }else if (secondList.size() > firstList.size()){
            resultList.addAll(secondList.subList(minList, secondList.size()));
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]","" ));
    }
}
