package NestedLoopsExe;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
double allGradesSum =0;
int allGradeCount = 0;
        while (!input.equals("Finish")) {
            String presentationName = input;

            double currentGradeSum = 0;

            for (int i = 0; i < n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                allGradeCount++;
                currentGradeSum += currentGrade;
            }
            allGradesSum +=currentGradeSum;
            System.out.printf("%s - %.2f.%n", presentationName, currentGradeSum / n);

            input = scanner.nextLine();
        }
    System.out.printf("Student's final assessment is %.2f.%n",allGradesSum/ allGradeCount);
    }
}
