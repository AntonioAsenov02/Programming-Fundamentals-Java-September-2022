package Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> lessonsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());


        String entrance = scanner.nextLine();

        while (!entrance.equals("course start")) {

            String[] tokens = entrance.split(":");
            String command = tokens[0];
            String lesson = tokens[1];

            if (command.contains("Add")) {

                if (!lessonsList.contains(lesson)) {
                    lessonsList.add(lesson);
                }

            } else if (command.equals("Insert")) {

                if (!lessonsList.contains(lesson)) {
                    lessonsList.add(Integer.parseInt(tokens[2]), lesson);
                }

            } else if (command.equals("Remove")) {
                if (lessonsList.contains(lesson)) {
                    lessonsList.remove(lesson);
                }
                int indexLesson = lessonsList.indexOf(lesson);
                if (lessonsList.get(indexLesson + 1).equals(lesson + "-Exercise")) {
                    lessonsList.remove(indexLesson + 1);
                }

            } else if (command.equals("Swap")) {

                String lessonTitle2 = entrance.split(":")[2];
                if (lessonsList.contains(lesson) && lessonsList.contains(lessonTitle2)) {
                    int lesson1Index = lessonsList.indexOf(lesson);
                    int lesson2Index = lessonsList.indexOf(lessonTitle2);
                    lessonsList.set(lesson1Index, lessonTitle2);
                    lessonsList.set(lesson2Index, lesson);
                }

                String exOne = lesson + "-Exercise";
                String exTwo = lessonTitle2 + "-Exercise";
                if (lessonsList.contains(exOne)) {
                    lessonsList.remove(lessonsList.indexOf(exOne));
                    lessonsList.add(lessonsList.indexOf(lesson + 1), exOne);
                }
                if (lessonsList.contains(exTwo)) {
                    lessonsList.remove(lessonsList.indexOf(exTwo));
                    lessonsList.add(lessonsList.indexOf(lessonTitle2) + 1, exTwo);
                }

            } else if (command.equals("Exercise")) {
                String exercise = lesson + "-Exercise";
                //слагаме упражнение ако има лекция и го няма
                int indexLessonTitle = lessonsList.indexOf(lesson);
                if (lessonsList.contains(lesson)) {
                    //има ли упражнение
                    if (indexLessonTitle == lessonsList.size() - 1) {
                        lessonsList.add(indexLessonTitle + 1, exercise);
                    } else if (!lessonsList.get(indexLessonTitle + 1).equals(exercise)) {
                        lessonsList.add(indexLessonTitle + 1, exercise);
                    }
                } else {
                    lessonsList.add(lesson);
                    lessonsList.add(exercise);
                }
            }


            entrance = scanner.nextLine();
        }

        printLessons(lessonsList);


    }

    public static void printLessons(List<String> lessonList) {

        int counter = 1;
        for (String element : lessonList) {
            System.out.println(counter + "." + element);
            counter++;
        }
    }

}
