package Lab2;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double height = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double V = height * length * width / 3;

        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f",V);
    }
}
