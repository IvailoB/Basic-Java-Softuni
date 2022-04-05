package PreparationForExam;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintedEggs = Integer.parseInt(scanner.nextLine());

        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;
        String color = "";

        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <= paintedEggs; i++) {
            String paint = scanner.nextLine();


            switch (paint) {
                case "red":
                    redEggs++;
                    if (maxNum < redEggs){
                        maxNum = redEggs;
                        color = "red";
                    }
                    break;
                case "orange":
                    orangeEggs++;
                    if (maxNum < orangeEggs){
                        maxNum = orangeEggs;
                        color = "orange";
                    }
                    break;
                case "blue":
                    blueEggs++;
                    if (maxNum < blueEggs){
                        maxNum = blueEggs;
                        color = "blue";
                    }
                    break;
                case "green":
                    greenEggs++;
                    if (maxNum < greenEggs){
                        maxNum = greenEggs;
                        color ="green";
                    }
                    break;

            }

        }
        System.out.printf("Red eggs: %d%n", redEggs);
        System.out.printf("Orange eggs: %d%n", orangeEggs);
        System.out.printf("Blue eggs: %d%n", blueEggs);
        System.out.printf("Green eggs: %d%n", greenEggs);
        System.out.printf("Max eggs: %d -> %s",maxNum, color);
    }
}
