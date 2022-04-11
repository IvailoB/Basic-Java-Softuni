package Exam;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalQuantity = 0;
        double totalDegrees = 0;
        double average = 0;
        for (int i = 1; i <= n; i++) {
            double quantity = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());
            totalQuantity += quantity;
            totalDegrees = totalDegrees + (quantity * degrees);
            average = totalDegrees / totalQuantity;
        }
        System.out.printf("Liter: %.2f%n",totalQuantity);
        System.out.printf("Degrees: %.2f%n",average);
        if (average < 38){

            System.out.println("Not good, you should baking!");
        }else if (average <=42){

            System.out.println("Super!");
        }else {

            System.out.println("Dilution with distilled water!");

        }
    }
}
