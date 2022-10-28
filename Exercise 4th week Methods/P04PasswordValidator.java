package Exercise4;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();

        boolean isPasswordLengthValid = isLengthValid(password);
        if (!isPasswordLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isPasswordContentValid = isContentValid(password);
        if (!isPasswordContentValid){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isPasswordCountOfDigitsValid = isCountOfDigitsValid(password);
        if (!isPasswordCountOfDigitsValid){
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordLengthValid && isPasswordContentValid && isPasswordCountOfDigitsValid){
            System.out.println("Password is valid");
        }

    }

    public static boolean isLengthValid(String password) {

        String[] characters = password.split("");


        if (characters.length >= 6 && characters.length <= 10) {
            return true;

        } else {
            return false;
        }

    }

    public static boolean isContentValid(String password) {

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;

    }

    public static boolean isCountOfDigitsValid(String password){

        int countDigits = 0;

        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)){
                countDigits++;
            }
        }
        return countDigits >= 2;
    }
}
