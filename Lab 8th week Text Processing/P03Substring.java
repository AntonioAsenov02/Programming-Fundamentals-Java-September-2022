package Lab8;

import java.util.Scanner;

public class P03Substring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String wordToRemove = scanner.nextLine();
        String wordInput = scanner.nextLine();


        while (wordInput.contains(wordToRemove)){
            wordInput = wordInput.replace(wordToRemove,"");
        }

        System.out.println(wordInput);
    }
}
