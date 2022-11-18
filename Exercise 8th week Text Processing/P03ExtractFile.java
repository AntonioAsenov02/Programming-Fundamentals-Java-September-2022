package Exercise8;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split("\\\\");


        String file = inputArr[inputArr.length - 1];

        String fileName = file.substring(0,file.indexOf('.'));
        String fileExtension = file.substring(file.lastIndexOf('.') + 1);

        System.out.printf("File name: %s%nFile extension: %s",fileName,fileExtension);


    }
}
