package PreparationForExam;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int starPoint = 301;
        int successShots = 0;
        int refusedShots = 0;

        String pole = scanner.nextLine();
        while (!pole.equals("Retire")) {

            int points = Integer.parseInt(scanner.nextLine());


            switch (pole) {
                case "Double":
                    points = points * 2;
                    break;
                case "Triple":
                    points = points * 3;
                    break;
            }
            if (points <= starPoint) {
                starPoint -= points;
                successShots++;
            } else {
                refusedShots++;
            }
            if (starPoint == 0) {
                break;
            }

            pole = scanner.nextLine();

        }

        if (starPoint == 0) {
            System.out.printf("%s won the leg with %d shots.", name, successShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, refusedShots);
        }
    }
}
