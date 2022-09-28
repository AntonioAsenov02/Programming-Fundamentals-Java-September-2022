package Exercise2;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalAmountSpices = 0;

        while (yield >= 100){

            int consumptions = yield - 26;
            totalAmountSpices += consumptions;
            days++;
            yield = yield - 10;

        }
        System.out.println(days);

        if (totalAmountSpices >= 26){
            totalAmountSpices = totalAmountSpices - 26;
        }
        System.out.println(totalAmountSpices);
    }
}
