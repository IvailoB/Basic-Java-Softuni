package Exam;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double costs = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());

        double totalPocketMoney = 5 * pocketMoney;
        double totalMoneyPerDay = 5 * moneyPerDay;

        double savedMoney = totalPocketMoney + totalMoneyPerDay - costs;

        double diff = Math.abs(savedMoney - price);
        if (savedMoney < price){
            System.out.printf("Insufficient money: %.2f BGN.",diff);
        }else {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",savedMoney);

        }


    }

}
