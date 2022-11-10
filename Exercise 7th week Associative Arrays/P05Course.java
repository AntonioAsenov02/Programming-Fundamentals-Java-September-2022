package Exercise7;

import java.util.*;

public class P05Course {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        String command = scanner.nextLine();

        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        while (!command.equals("end")){

            String course = command.split(" : ")[0];
            String studentName = command.split(" : ")[1];

            if (!coursesMap.containsKey(course)){
                coursesMap.put(course,new ArrayList<>());
            }

            coursesMap.get(course).add(studentName);

            command = scanner.nextLine();
        }

        coursesMap.entrySet().forEach(entry -> {System.out.println(entry.getKey() + ": " + entry.getValue().size());
        entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));});

    }
}
