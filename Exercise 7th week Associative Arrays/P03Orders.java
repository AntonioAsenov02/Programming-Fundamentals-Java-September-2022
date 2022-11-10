package Exercise7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        String input = scanner.nextLine();
        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String,Integer> productsQuantity = new LinkedHashMap<>();
        while (!input.equals("buy")){

            String [] productsArr = input.split(" ");
            String name = productsArr[0];
            double price = Double.parseDouble(productsArr[1]);
            int quantity = Integer.parseInt(productsArr[2]);

            productsPrice.put(name,price);

            if (!productsQuantity.containsKey(name)){
                productsQuantity.put(name,quantity);
            }else {
                productsQuantity.put(name,productsQuantity.get(name) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {

            String productsName = entry.getKey();
            double finalSum = entry.getValue() * productsQuantity.get(productsName);
            System.out.printf("%s -> %.2f%n",productsName,finalSum);
        }

    }
}
