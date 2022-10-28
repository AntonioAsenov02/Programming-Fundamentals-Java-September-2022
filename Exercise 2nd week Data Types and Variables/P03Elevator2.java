package Exercise2;

import java.util.Scanner;

public class P03Elevator2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double peoplePerCourse = Double.parseDouble(scanner.nextLine());

        double sum =  Math.ceil(people / peoplePerCourse);

        System.out.printf("%.0f",sum);

    }
}
