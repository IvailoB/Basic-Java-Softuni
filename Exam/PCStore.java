package Exam;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processor$ = Double.parseDouble(scanner.nextLine());

        double videoCard$ = Double.parseDouble(scanner.nextLine());

        double RAM$ = Double.parseDouble(scanner.nextLine());

        int countRAM = Integer.parseInt(scanner.nextLine());

        double discount = Double.parseDouble(scanner.nextLine());

        double RAM = RAM$ * 1.57;
        double processor = processor$ * 1.57;
        double videoCard = videoCard$ * 1.57;

        double totalRAM = countRAM * RAM;

        double procent = discount * 100;

        double priceProcessor = processor - (processor * discount);
        double priceVideoCard = videoCard - (videoCard * discount);
        double total = priceProcessor + priceVideoCard + totalRAM;
        System.out.printf("Money needed - %.2f leva.", total);


    }
}
