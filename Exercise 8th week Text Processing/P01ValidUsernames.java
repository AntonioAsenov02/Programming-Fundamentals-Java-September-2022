package Exercise8;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String[] inputArr = input.split(", ");

        for (String username : inputArr) {

            if (isValidUsername(username)){
                System.out.println(username);
            }
        }
    }

    public static boolean isValidUsername(String username){

        if (username.length() < 3 || username.length() > 16){

            return false;
        }

        for (char character : username.toCharArray()) {

            if (!Character.isLetterOrDigit(character) && character != '-' && character != '_'){

                return false;
            }
        }
        return true;
    }

}
