package Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();


        int maxLength = 0;
        int length  = 1;

        int startIndex = 0;
        int bestStart = 0;

        for (int element = 1; element <= numberArr.length - 1; element++) {
            if (numberArr[element] == numberArr[element - 1]){
                length++;

            }else {
                length = 1;
                startIndex = element;
            }
            if (length > maxLength){
                maxLength = length;
                bestStart = startIndex;
            }
        }
        for (int i = bestStart; i < bestStart + maxLength; i++) {
            System.out.print(numberArr[i] + " ");

        }
    }
}
