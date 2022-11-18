package Lab8;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] toRemoveWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i <= toRemoveWordsArr.length - 1 ; i++) {

            String currentWord = toRemoveWordsArr[i];

            if (text.contains(currentWord)){


                text = text.replace(currentWord, repeatString("*", currentWord.length()));
            }
        }

        System.out.println(text);
    }

    public static String repeatString (String s,int count){

        String result = "";
        for (int i = 0; i <= count - 1 ; i++) {


            result += s;
        }
        return result;
    }
}
