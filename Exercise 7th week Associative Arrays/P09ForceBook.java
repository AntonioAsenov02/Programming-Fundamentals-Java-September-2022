package Exercise7;

import java.util.*;

public class P09ForceBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        String command = scanner.nextLine();

        Map<String, List<String>> usersMap = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")){

            if (command.contains(" | ")){

                String forceSide = command.split("\\s+\\|\\s+")[0];
                String forceUser = command.split("\\s+\\|\\s+")[1];

                if (!usersMap.containsKey(forceSide)){
                    usersMap.put(forceSide,new ArrayList<>());
                }

                boolean isExistingUser = false;
                for (List<String> listUser : usersMap.values()) {
                    if (listUser.contains(forceUser)){
                        isExistingUser = true;
                        break;
                    }
                }
                if (!isExistingUser){
                    usersMap.get(forceSide).add(forceUser);
                }

            }else if (command.contains(" -> ")){

                String user = command.split("\\s+->\\s+")[0];
                String side = command.split("\\s+->\\s+")[1];

                usersMap.entrySet().forEach(entry -> entry.getValue().remove(user));

                if (usersMap.containsKey(side)){

                    usersMap.get(side).add(user);
                }else {

                    usersMap.put(side,new ArrayList<>());
                    usersMap.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n",user,side);
            }

            command = scanner.nextLine();

        }

        usersMap.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });
    }
}
