package conditionalstatmentEXE;

import java.util.Scanner;

public class timePlus15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int allmin = (hour * 60 + min)+15;

        int newhour = allmin/60;
        int newMin = allmin % 60;

        if (newhour > 23){
            newhour = 0;
        System.out.printf("%d:%02d",newhour, newMin);

        }else
        System.out.printf("%d:%02d",newhour, newMin);
    }
}
