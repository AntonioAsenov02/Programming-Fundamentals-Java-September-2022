package Exercise8;

import java.util.Scanner;

public class P08LettersChangeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();
        String[] codes = input.split("\\s+");


        double totalSum = 0;
        for (String code : codes) {

            double modifiedNumber = modifiedNumber(code);

            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f",totalSum);
        }

    public static double modifiedNumber(String code){

        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter,' ')
                .replace(secondLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)){

            number = number / ((int) firstLetter - 64);
        }else {

            number = number * ((int) firstLetter - 96);


        }
        if (Character.isUpperCase(secondLetter)){

            number = number - ((int) secondLetter - 64);
        }else {

            number = number + ((int) secondLetter - 96);
        }


        return number;
    }
}
