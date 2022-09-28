package Exercise2;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokedTargets = 0;
        int firstPokePower = pokePower;

        while (pokePower >= distanceBetweenTargets) {
            pokePower = pokePower - distanceBetweenTargets;
            pokedTargets++;

            if (pokePower == firstPokePower / 2) {
                if (exhaustionFactor != 0) {
                    pokePower = pokePower / exhaustionFactor;
                }

            }


        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}
