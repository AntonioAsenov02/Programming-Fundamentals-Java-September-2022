package Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> guestList = new ArrayList<>();

        int commandCount = Integer.parseInt(scanner.nextLine());



        while (commandCount >= 1){
            String command = scanner.nextLine();
            String[] elements = command.split(" ");

            if (command.contains("not")){
                if (guestList.contains(elements[0])){
                    guestList.remove(elements[0]);
                }else {
                    System.out.println(elements[0] + " " + "is not in the list!");
                }

            }else {
                if (guestList.contains(elements[0])){
                    System.out.println(elements[0] + " " + "is already in the list!");
                }else {
                    guestList.add(elements[0]);
                }
            }
            commandCount--;
        }

        for (String element : guestList) {
            System.out.println(element);
        }
    }
}
