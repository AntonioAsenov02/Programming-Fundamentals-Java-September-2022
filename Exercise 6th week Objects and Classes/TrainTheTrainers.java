package Excercises6;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        int countGrades = 0;
        double totalGrades = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")){
            String presentationName = input;
            double sumCurrentPresentationGrade = 0;

            for (int i = 1; i <= jury ; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                countGrades++;
                sumCurrentPresentationGrade += grades;
            }

            totalGrades += sumCurrentPresentationGrade;

            System.out.printf("%s - %.2f.%n",presentationName,sumCurrentPresentationGrade / jury);

            input = scanner.nextLine();

        }

        System.out.printf("Student's final assessment is %.2f.",totalGrades / countGrades);
    }
}
