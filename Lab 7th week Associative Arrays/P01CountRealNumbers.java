package Lab7;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();


        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int number : numbersArr) {

            countMap.putIfAbsent(number,0);
            countMap.put(number,countMap.get(number) + 1);


//            if (!countMap.containsKey(number)) {
//                countMap.put(number, 0);
//
//            }
//            int value = countMap.get(number);
//            countMap.put(number,value + 1);



         //   if (!countMap.containsKey(number)){
            //      countMap.put(number,1);
         //   }else {
         //       int value = countMap.get(number);
          //      countMap.put(number,value + 1);
       // }
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.printf("%d -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
