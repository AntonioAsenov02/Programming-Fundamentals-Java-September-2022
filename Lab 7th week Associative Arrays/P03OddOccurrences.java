package Lab7;


import java.lang.reflect.Array;
import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        String[] wordsArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word : wordsArr) {

            word = word.toLowerCase();

            wordsMap.putIfAbsent(word,0);
            wordsMap.put(word,wordsMap.get(word) + 1);

        }

        List<String> newWordsList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {

            if (entry.getValue() % 2 != 0){
                newWordsList.add(entry.getKey());
            }
        }

        for (String word : newWordsList) {
            if (newWordsList.indexOf(word) != newWordsList.size() - 1) {
                System.out.print(word + ", ");
            } else {
                System.out.print(word);
            }
        }


    }
}
