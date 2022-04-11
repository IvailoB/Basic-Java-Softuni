package Exam;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int units = n % 10;
        int tens = n / 10 % 10;
        int thousands = n / 100 % 10;
        for (int a = 1; a <= units; a++) {
            for (int b = 1; b <= tens; b++) {
                for (int c = 1; c <= thousands; c++) {
                    int sum = a * b * c;
                    System.out.printf("%d * %d * %d = %d;%n", a, b, c, sum);

                }
            }
        }

    }
}
