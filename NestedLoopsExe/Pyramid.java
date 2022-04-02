package NestedLoopsExe;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int currentNum = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                currentNum++;

                if (currentNum>n){
                    flag = true;
                    break;
                }
                System.out.print(currentNum + " ");
            }
            if (flag){
                break;
            }
            System.out.println();
        }

    }
}
