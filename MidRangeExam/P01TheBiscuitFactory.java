package MidRangeRealTest;

import java.util.Scanner;

public class P01TheBiscuitFactory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int biscuitsPerPersonPerDay = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int producedBiscuitsFor30daysCompetitor = Integer.parseInt(scanner.nextLine());

        double averageBiscuitsPerDay = 0;





        for (int day = 1; day <= 30 ; day++) {



            if (day % 3 == 0){
                 averageBiscuitsPerDay += Math.floor(biscuitsPerPersonPerDay * countOfWorkers * 0.75);
            }else {
                averageBiscuitsPerDay += biscuitsPerPersonPerDay * countOfWorkers;
            }

        }

        double differenceOfBiscuits = 0;

        if (producedBiscuitsFor30daysCompetitor > averageBiscuitsPerDay){
            differenceOfBiscuits += producedBiscuitsFor30daysCompetitor - averageBiscuitsPerDay;

            double differenceInPercentage = (differenceOfBiscuits / producedBiscuitsFor30daysCompetitor) * 100;
            System.out.printf("You have produced %.0f biscuits for the past month.%nYou produce %.2f percent less biscuits.",
                    averageBiscuitsPerDay,differenceInPercentage);
        }else {
            differenceOfBiscuits += averageBiscuitsPerDay - producedBiscuitsFor30daysCompetitor;

            double differenceInPercentage = (differenceOfBiscuits / producedBiscuitsFor30daysCompetitor) * 100;
            System.out.printf("You have produced %.0f biscuits for the past month.%nYou produce %.2f percent more biscuits.",
                    averageBiscuitsPerDay,differenceInPercentage);
        }
    }

}
