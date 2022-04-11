package Exam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double reward = 0;
        double charity = 0;
        double remainingMoney = 0;
        double moneyPerDancer = 0;
        if (place.equals("Bulgaria")) {

            reward = dancers * points;
            switch (season) {
                case "summer":
                    reward = reward * 0.95;
                    break;
                case "winter":
                    reward = reward * 0.92;
                    break;
            }
        }

        if (place.equals("Abroad")) {
            reward = (dancers * points) * 1.5;
            switch (season) {
                case "summer":
                    reward = reward * 0.90;
                    break;
                case "winter":
                    reward = reward * 0.85;
                    break;
            }


        }
        charity = reward * 0.25;
        remainingMoney = reward - charity;
        moneyPerDancer = charity / dancers;

        System.out.printf("Charity - %.2f%n", remainingMoney);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);
    }
}
