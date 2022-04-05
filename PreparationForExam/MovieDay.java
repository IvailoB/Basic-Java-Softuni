package PreparationForExam;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForPhotos = Integer.parseInt(scanner.nextLine());
        int scene = Integer.parseInt(scanner.nextLine());
        int timeForScene = Integer.parseInt(scanner.nextLine());

        double preparation = timeForPhotos * 0.15;
        double totalTimeForScenes = scene * timeForScene;
        double neededTime = preparation + totalTimeForScenes;

        if (neededTime <= timeForPhotos){
            System.out.printf("You manage to finish the movie on time! You have %d minutes left.",Math.round(timeForPhotos - neededTime));
        }else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.",Math.round(neededTime - timeForPhotos));
        }
    }
}
