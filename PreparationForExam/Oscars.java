package PreparationForExam;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statue =  rent * 0.70;
        double catering = statue * 0.85;
        double sounds = catering / 2;

        double total = rent + statue + catering + sounds;
        System.out.printf("%.2f", total);
    }
}
