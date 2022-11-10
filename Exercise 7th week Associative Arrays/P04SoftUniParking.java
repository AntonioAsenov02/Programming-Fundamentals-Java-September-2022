package Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> userMap = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {

            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String name = input.split(" ")[1];


            if (command.equals("register")){
                String licensePlateNumber = input.split(" ")[2];
                if (!userMap.containsKey(name)){
                    userMap.put(name,licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n",name,licensePlateNumber);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n",userMap.get(name));
                }

            }else if (command.equals("unregister")){

                if (userMap.containsKey(name)){
                    userMap.remove(name);
                    System.out.printf("%s unregistered successfully%n",name);
                }else {
                    System.out.printf("ERROR: user %s not found%n",name);
                }
            }
        }

        for (Map.Entry<String, String> entry : userMap.entrySet()) {

            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
