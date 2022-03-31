package conditionalstatmentEXE;

import java.util.Scanner;

public class BonusSore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initPoint = Integer.parseInt(scanner.nextLine());

        double bonusPoint = 0;

        if (initPoint <= 100) {
            bonusPoint = 5;
        } else if (initPoint <= 1000) {
            bonusPoint = initPoint * 0.20;
        } else {
            bonusPoint = initPoint * 0.10;

        }
        if (initPoint % 2 == 0) {
            bonusPoint = bonusPoint + 1;
        }
    if (initPoint % 10 == 5){
        bonusPoint = bonusPoint + 2;
    }
    System.out.println(bonusPoint);
    System.out.println(bonusPoint + initPoint);
    }

}
