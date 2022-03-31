package conditionalstatmentEXE;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrize = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double allSum = (puzzleCount * 2.60) +
                (dollsCount * 3.00) +
                (teddyCount * 2.10) +
                (minionsCount * 8.20) +
                (trucksCount * 2.00);
        int CountAllToys = puzzleCount + dollsCount + teddyCount + minionsCount + trucksCount;
        double diff = Math.abs(allSum - tripPrize);
        if (CountAllToys >= 50) {
            allSum = allSum * 0.75;
        }
        allSum = allSum * 0.90;
        if (allSum > tripPrize) {
            System.out.printf("Yes! %2f lv left.", diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
