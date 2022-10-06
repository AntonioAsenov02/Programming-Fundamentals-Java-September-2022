package Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbersArr.length - 1 ; index++) {

            int currentNumber  = numbersArr[index];

            if (index == numbersArr.length -1){
                break;
            }

            boolean isMagic = false;


            for (int i = index + 1 ; i <= numbersArr.length - 1 ; i++) {

                int nextNumber = numbersArr[i];

                if (currentNumber + nextNumber == magicNumber){
                    isMagic = true;
                    System.out.printf("%d %d%n",currentNumber,nextNumber);
                    }else {
                    isMagic = false;


                }

            }
        }
    }
}
