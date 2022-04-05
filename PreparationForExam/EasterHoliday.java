package PreparationForExam;

import java.util.Scanner;

public class EasterHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String date = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double totalPrice = 0;
        switch (destination) {
            case "France":
                if (date.equals("21-23")) {
                    price = 30;
                }
                if (date.equals("24-27")) {
                    price = 35;
                }
                if (date.equals("28-31")) {
                    price = 40;
                }
                break;
            case "Italy":
                if (date.equals("21-23")) {
                    price = 28;
                }
                if (date.equals("24-27")) {
                    price = 32;
                }
                if (date.equals("28-31")) {
                    price = 39;
                }
                break;
            case "Germany":
                if (date.equals("21-23")) {
                    price = 32;
                }
                if (date.equals("24-27")) {
                    price = 37;
                }
                if (date.equals("28-31")) {
                    price = 43;
                }
                break;

        }
        totalPrice = price * nights;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
