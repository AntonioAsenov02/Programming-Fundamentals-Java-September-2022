package Exercise2;

import java.util.Scanner;

public class P11SnowBalls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        int snowBallBiggest = 0;
        int snowTimeBiggest = 0;
        int snowQualityBiggest = 0;

        for (int currentSnowBalls = 1; currentSnowBalls <= numberOfLines ; currentSnowBalls++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double snowBallValue = Math.pow(snowBallSnow / snowBallTime,snowBallQuality);

            if (snowBallValue > maxValue){
                maxValue = snowBallValue;
                snowBallBiggest = snowBallSnow;
                snowTimeBiggest = snowBallTime;
                snowQualityBiggest = snowBallQuality;
            }





        }
        System.out.printf("%d : %d = %.0f (%d)",snowBallBiggest,snowTimeBiggest,maxValue,snowQualityBiggest);
    }
}
