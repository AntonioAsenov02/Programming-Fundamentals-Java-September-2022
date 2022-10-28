package Exercise1;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--){
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }
        String enteredPassword = scanner.nextLine();
        int counter = 0;

        while (!enteredPassword.equals(password)){
            counter++;

            if (counter <= 3){
                System.out.println("Incorrect password. Try again.");

            }else {
                System.out.printf("User %s blocked!", username);
                break;

            }
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(password)){
            System.out.printf("User %s logged in.",username);
        }
    }
}
