package Exercise2;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int currentLiters = 0;

        for (int i = 1; i <= numberOfLines ; i++) {
            int pouredLitters = Integer.parseInt(scanner.nextLine());

            currentLiters += pouredLitters;

            if (currentLiters > capacity ) {
                System.out.println("Insufficient capacity!");
                currentLiters -= pouredLitters;
            }



        }
        System.out.println(currentLiters);

    }
}
