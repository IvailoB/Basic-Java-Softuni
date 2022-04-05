package WhileLoopExe;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double coinsChange = change * 100;
        int countCoins = 0;
        while (coinsChange > 0) {
            Math.round(coinsChange);
            if (coinsChange >= 200) {
                coinsChange -= 200;
                countCoins++;
            } else if (coinsChange >= 100) {
                coinsChange -= 100;
                countCoins++;
            } else if (coinsChange >= 50) {
                coinsChange -= 50;
                countCoins++;
            } else if (coinsChange >= 20) {
                coinsChange -= 20;
                countCoins++;
            } else if (coinsChange >= 10) {
                coinsChange -= 10;
                countCoins++;
            } else if (coinsChange >= 5) {
                coinsChange -= 5;
                countCoins++;
            } else if (coinsChange >= 2) {
                coinsChange -= 2;
                countCoins++;
            } else if (coinsChange >= 1) {
                coinsChange -= 1;
                countCoins++;
            }else {
                break;
            }
        }
        System.out.println(countCoins);
    }
}

