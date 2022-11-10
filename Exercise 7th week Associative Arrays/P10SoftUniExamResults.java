package Exercise7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Map<String,Integer> userPointsMap = new LinkedHashMap<>();
        Map<String,Integer> languageSubmissionsMap = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("exam finished")){

            String[] command2 = command.split("-");
            String user = command2[0];


            if (command2.length == 3) {
                String language = command2[1];
                int points = Integer.parseInt(command2[2]);
                if (!userPointsMap.containsKey(user)) {
                    userPointsMap.put(user, points);
                } else {
                    int currentPoints = userPointsMap.get(user);
                    if (points > currentPoints) {
                        userPointsMap.put(user, points);
                    }
                }


                if (!languageSubmissionsMap.containsKey(language)) {
                    languageSubmissionsMap.put(language, 1);
                } else {
                    languageSubmissionsMap.put(language, languageSubmissionsMap.get(language) + 1);
                }

            }else {
                userPointsMap.remove(user);
            }

            command = scanner.nextLine();
        }

        System.out.println("Results:");
        userPointsMap.entrySet().forEach(entry -> System.out.printf("%s | %d%n",entry.getKey(),entry.getValue()));
        System.out.println("Submissions:");
        languageSubmissionsMap.entrySet().forEach(entry -> System.out.printf("%s - %d%n",entry.getKey(),entry.getValue()));
    }
}
