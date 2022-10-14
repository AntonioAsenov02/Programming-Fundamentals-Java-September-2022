package Exercise2;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = "";

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfLines; i++) {
            String modelOfKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;

            if (volume > maxVolume){
                maxVolume = volume;
                maxModelKeg = modelOfKeg;
            }

        }
        System.out.println(maxModelKeg);
    }
}
