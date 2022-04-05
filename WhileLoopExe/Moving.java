package WhileLoopExe;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int width = Integer.parseInt(scanner.nextLine());
            int length = Integer.parseInt(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());


            int Space = width * length * height;
            int sumBoxes = 0;

            String input = scanner.nextLine();
            while (!input.equals("Done")) {

                int numberBoxes = Integer.parseInt(input);
                sumBoxes += numberBoxes;

                if (sumBoxes >= Space) {
                    break;
                }
                input = scanner.nextLine();
            }
            int diff = Math.abs(Space - sumBoxes);
            if (sumBoxes <= Space) {
                System.out.printf("%d Cubic meters left.", diff);
            } else {
                System.out.printf("No more free space! You need %d Cubic meters more.", diff);
            }

    }
}

