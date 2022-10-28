package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListOfProducts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> productsList = new ArrayList<>();

        int  n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            productsList.add(input);
        }

        Collections.sort(productsList);

        for (int i = 0; i < productsList.size(); i++) {

            System.out.println(i + 1 + "." + productsList.get(i));
        }
    }
}
