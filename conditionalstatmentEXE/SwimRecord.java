package conditionalstatmentEXE;

import java.util.Scanner;

public class SwimRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wordlRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForUnitDistance = Double.parseDouble(scanner.nextLine());

        double totalTime = distance * timeForUnitDistance;
        double addingTime = Math.floor(distance/15)*12.5;

        double sumTime = addingTime + totalTime;

        if (sumTime < wordlRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sumTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", sumTime-wordlRecord);

        }
    }
}
