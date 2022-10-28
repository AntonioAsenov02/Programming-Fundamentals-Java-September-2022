package Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        List<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (firstPlayerDeck.size() != 0 && secondPlayerDeck.size() != 0) {


            int firstPlayerCard = firstPlayerDeck.get(0);
            int secondPlayerCard = secondPlayerDeck.get(0);

            firstPlayerDeck.remove(0);
            secondPlayerDeck.remove(0);


            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerDeck.add(secondPlayerCard);
                secondPlayerDeck.add(firstPlayerCard);
            }
        }

        if (firstPlayerDeck.size() == 0){
            System.out.printf("Second player wins! Sum: %d",getCardsSum(secondPlayerDeck));
        }else if (secondPlayerDeck.size() == 0){
            System.out.printf("First player wins! Sum: %d",getCardsSum(firstPlayerDeck));
        }
    }
    public static int getCardsSum(List<Integer> cardsList){

        int sum = 0;
        for (int element : cardsList) {
            sum += element;
        }
        return sum;
    }
}
