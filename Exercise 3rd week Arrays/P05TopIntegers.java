package Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index <= numbersArr.length - 1; index++) {

            int currentNumber = numbersArr[index];

            if (index == numbersArr.length - 1) {
                System.out.print(currentNumber + " ");
                break;
            }

            boolean isTop = false;
            for (int compareNumber = index + 1; compareNumber <= numbersArr.length - 1; compareNumber++) {

                int nextNumber = numbersArr[compareNumber];

                if (currentNumber > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }


            }
            if (isTop) {
                    System.out.print(currentNumber + " ");

                }
            }


        }
    }