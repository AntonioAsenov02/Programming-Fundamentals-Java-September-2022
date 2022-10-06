package Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSum {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);


         int [] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                         .mapToInt(Integer::parseInt)
                         .toArray();

         boolean isFound = false;

        for (int index = 0; index <= numberArr.length - 1 ; index++) {

            int currentElement = numberArr[index];
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {

                leftSum += numberArr[leftIndex];
            }


            for (int rightIndex = index + 1; rightIndex <=numberArr.length - 1 ; rightIndex++) {

                rightSum += numberArr[rightIndex];
            }

            if (leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("no");
        }
    }
}
