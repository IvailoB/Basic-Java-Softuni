package Exam;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());

        int price = 0;
        int profit = 0;

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {

            switch (command) {
                case "sea":
                    price = 680;
                    sea --;
                    break;
                case "mountain":
                    price = 499;
                    mountain --;
                    break;
            }
            if (sea <= 0 && mountain <= 0){
                profit += price;
                System.out.println("Good job! Everything is sold.");
                break;
            }
            if (sea < 0 || mountain < 0){
                command = scanner.nextLine();
                continue;
            }

            profit += price;
            command = scanner.nextLine();

        }
        System.out.printf("Profit: %d leva.",profit);
    }
}
