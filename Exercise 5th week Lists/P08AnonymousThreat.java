package Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> inputList = Arrays.stream(scanner.nextLine().split(" "))
                                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("3:1")){


            if (command.contains("merge")){
                int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                int endIndex = Integer.parseInt(command.split("\\s+")[2]);

                if (startIndex < 0){
                    startIndex = 0;
                }
                if (endIndex > inputList.size() - 1){
                    endIndex = inputList.size() - 1;
                }

                boolean isValidIndex = startIndex <= inputList.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                if (isValidIndex){
                    String resultMerge = "";

                    for (int index = startIndex; index <= endIndex ; index++) {
                        String currentText = inputList.get(index);
                        resultMerge += currentText;
                    }

                    for (int index = startIndex; index <= endIndex ; index++) {
                        inputList.remove(startIndex);
                    }
                    inputList.add(startIndex,resultMerge);
                }
            }else if (command.contains("divide")){

                int index = Integer.parseInt(command.split("\\s+")[1]);
                int parts = Integer.parseInt(command.split("\\s+")[2]);

                String elementForDivide = inputList.get(index);
                inputList.remove(index);

                int partSize = elementForDivide.length() / parts;

                int beginIndexOfText = 0;

                for (int part = 1; part < parts ; part++) {
                    inputList.add(index,elementForDivide.substring(beginIndexOfText,beginIndexOfText + partSize));
                    index++;
                    beginIndexOfText += partSize;
                }

                inputList.add(index,elementForDivide.substring(beginIndexOfText));
            }
            command = scanner.nextLine();
        }

        //може и така да се пинтира
       // System.out.println(String.join(" ",inputList));

        for (String element : inputList) {
            System.out.print(element + " ");
        }
    }
}
