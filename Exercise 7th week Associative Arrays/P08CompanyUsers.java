package Exercise7;

import java.util.*;

public class P08CompanyUsers {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<String, List<String>> companiesMap = new LinkedHashMap<>();
        while (!input.equals("End")) {

            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (!companiesMap.containsKey(companyName)) {
                List<String> employees = new ArrayList<>();
                employees.add(employeeId);
                companiesMap.put(companyName,employees);
            }else {
                List<String> employees = companiesMap.get(companyName);
                if (!employees.contains(employeeId)){
                    employees.add(employeeId);
                }
            }


            input = scanner.nextLine();
        }

        companiesMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        });

    }
}
