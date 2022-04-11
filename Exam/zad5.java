package Exam;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());

        int profit = 0;

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {

            if (command.equals("sea") && sea > 0) {
                profit += 680;
                sea--;
            }

            if (command.equals("mountain") && mountain > 0) {
                profit += 499;
                mountain--;
            }

            if (sea == 0 & mountain == 0) {
                break;
            }

            if (scanner.hasNext()) {
                command = scanner.nextLine();
            }
        }

        if (sea == 0 && mountain == 0) {
            System.out.println("Good job! Everything is sold.");
        }
        System.out.println("Profit: " + profit + " leva.");
    }
}