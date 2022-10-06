package Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")){

            // swap index 1 with index 3
            if (command.contains("swap")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                // взимаме елемента на съответната позиция(-2;87)
                int element1 = numbersArr[index1];
                int element2 = numbersArr[index2];

                //извършваме действието размяна
                numbersArr[index1] = element2;
                numbersArr[index2] = element1;



            }else if (command.contains("multiply")){

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = numbersArr[index1];
                int element2 = numbersArr[index2];

                int product = element1 * element2;

                numbersArr[index1] = product;

            }else if (command.equals("decrease")){

                for (int i = 0; i <= numbersArr.length - 1; i++) {
                    numbersArr[i] -= 1;

                }

            }


            command = scanner.nextLine();
        }
        if (command.equals("end")){
            for (int i = 0; i <= numbersArr.length - 1; i++) {
                int currentNumber = numbersArr[i];
                if (i != numbersArr.length -1){
                    System.out.print(currentNumber + ", ");
                }else {
                    System.out.println(currentNumber);
                }


            }
        }
    }
}
