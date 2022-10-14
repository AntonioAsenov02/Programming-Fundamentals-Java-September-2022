package Lab4;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int repeatTimesInput = Integer.parseInt(scanner.nextLine());


        System.out.println(repeatedInput(inputText,repeatTimesInput));
    }

    public static String repeatedInput(String input, int repeat) {

        String result = "";
        for (int i = 1; i <= repeat; i++) {
            result += input;
        }
        return result;
    }
}
