package NestedLoopsExe;

import java.util.Scanner;

public class SumPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);

            if (currentNum < 0) {

                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= currentNum; i++) {
                if (currentNum % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeSum += currentNum;
            } else {
                nonPrimeSum += currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
