package Lab1;

import java.util.Scanner;

public class P06ForeignLanguage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        switch (country){
            case "England" :
            case "USA" :
                System.out.println("English");
                break;
            case "Argentina" :
            case "Spain" :
            case "Mexico" :
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
