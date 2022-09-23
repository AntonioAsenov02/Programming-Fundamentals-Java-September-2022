package Exercise1;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceForOneLightSaber = Double.parseDouble(scanner.nextLine());
        double priceForOneRobe = Double.parseDouble(scanner.nextLine());
        double priceForOneBelt = Double.parseDouble(scanner.nextLine());


        double totalPriceForLightSabers = Math.ceil(countOfStudents + 0.10 * countOfStudents) * priceForOneLightSaber;
        double totalPriceForRobes = countOfStudents * priceForOneRobe;
        double totalPriceForBelts = (countOfStudents - countOfStudents / 6) * priceForOneBelt;


        double totalPrice = totalPriceForLightSabers + totalPriceForRobes + totalPriceForBelts;

        if (totalPrice <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - amountOfMoney);
        }


    }
}
