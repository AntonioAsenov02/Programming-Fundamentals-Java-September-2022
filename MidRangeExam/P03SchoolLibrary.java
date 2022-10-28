package MidRangeRealTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03SchoolLibrary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        List<String> booksList = Arrays.stream(scanner.nextLine().split("\\&"))
                                .collect(Collectors.toList());



        String input = scanner.nextLine();

        while (!input.equals("Done")){

            String [] commandElements = input.split(" \\| ");

            String command = commandElements[0];

            switch (command){

                case "Add Book" :

                    String bookName = commandElements[1];

                    if (!booksList.contains(bookName)){
                        booksList.add(0,bookName);
                    }

                    break;
                case "Take Book" :

                    String bookName1 = commandElements[1];

                    if (booksList.contains(bookName1)){
                        booksList.remove(bookName1);
                    }

                    break;
                case "Swap Books" :

                    String book1 = commandElements[1];
                    String book2 = commandElements[2];

                    if (booksList.contains(book1) && booksList.contains(book2)){

                        int indexOfBook1 = booksList.indexOf(book1);
                        int indexOfBook2 = booksList.indexOf(book2);

                        booksList.set(indexOfBook1,book2);
                        booksList.set(indexOfBook2,book1);

                    }
                    break;
                case "Insert Book" :

                    String book = commandElements[1];

                    if (!booksList.contains(book)){
                        booksList.add(book);
                    }

                    break;
                case  "Check Book" :

                    int indexOfBook = Integer.parseInt(commandElements[1]);

                    if (indexOfBook <= booksList.size() - 1){

                        String theBook = booksList.get(indexOfBook);
                        System.out.println(theBook);
                    }

                    break;
            }



            input = scanner.nextLine();
        }

        for (String element : booksList) {
            if (booksList.indexOf(element) != booksList.size() - 1) {
                System.out.print(element + ", ");
            } else {
                System.out.print(element);
            }
        }
    }
}
