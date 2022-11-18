package Lab8;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        while (!input.equals("end")){

            String initInput = input;
            String newN = "";
            for (int i = input.length() - 1; i >= 0 ; i--) {

                char newName = input.charAt(i);
                newN += newName;

            }
            System.out.printf("%s = %s%n",initInput,newN);

            input = scanner.nextLine();
        }

    }
}
