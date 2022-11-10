package Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06StudentsAcademy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());

        Map<String,Double> studentsMap = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(name)){
                studentsMap.put(name,grade);
            }else {
                int gradeCounter = 1;
                gradeCounter++;
                studentsMap.put(name,(studentsMap.get(name) + grade) / gradeCounter);
            }

        }

        for (Map.Entry<String, Double> entry : studentsMap.entrySet()) {

            if (entry.getValue() >= 4.50){
                System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
            }
        }

    }
}
