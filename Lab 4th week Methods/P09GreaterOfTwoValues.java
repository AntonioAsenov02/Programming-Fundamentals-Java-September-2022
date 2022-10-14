package Lab4;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type  = scanner.nextLine();

        switch (type){
            case "int" :
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char" :
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(gerMax(firstChar,secondChar));
                break;
            case "string" :
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getMax(firstText,secondText));
                break;

        }
    }
    public static int getMax(int firstNumber , int secondNumber){

        if (firstNumber > secondNumber){
            return firstNumber;
        }else {
            return secondNumber;
        }
    }

    public static char gerMax(char firstChar , char secondChar){

        if (firstChar > secondChar){
            return firstChar;
        }else {
            return secondChar;
        }
    }

    public static String getMax(String firstText , String secondText){

        if (firstText.compareTo(secondText) > 0){
            return firstText;
        }else {
            return secondText;
        }
    }
}
