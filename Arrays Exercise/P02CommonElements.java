package Exercise3;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        String[] inputArr2 = scanner.nextLine().split(" ");

        for (String elementSecondArray : inputArr2) {
            for (String elementFirstArray : inputArr) {

                if (elementFirstArray.equals(elementSecondArray)){
                    System.out.print(elementFirstArray + " ");
                    break;

            }

        }

        }
    }
}
