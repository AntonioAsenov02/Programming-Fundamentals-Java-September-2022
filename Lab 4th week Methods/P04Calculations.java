package Lab4;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        switch (input){
            case "add" :
                printAddNumbers(n1,n2);
                break;
            case "multiply" :
                printMultiplyNumbers(n1,n2);
                break;
            case "subtract" :
                printSubtractNumbers(n1,n2);
                break;
            case "divide" :
                printDivideNumber(n1,n2);
                break;
        }
    }


    public static void printAddNumbers( int n1 , int n2){

        System.out.println(n1 + n2);

    }
    public static void printMultiplyNumbers(int n1, int n2){

        System.out.println(n1 * n2);
    }

    public static void printSubtractNumbers(int n1,int n2){

        System.out.println(n1 - n2);
    }
    public static void printDivideNumber(int n1 , int n2){

        System.out.println(n1 / n2);
    }
}
