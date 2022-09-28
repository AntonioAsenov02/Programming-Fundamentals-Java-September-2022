package Exercise2;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int peoplePerCourse = Integer.parseInt(scanner.nextLine());

        int numOfCourses = people / peoplePerCourse;
        if (peoplePerCourse > people){
            System.out.println(1);
            return;
        }
        if (people % peoplePerCourse == 0){
            System.out.println(numOfCourses);
        }else {
            System.out.println(numOfCourses + 1);
        }


    }
}
