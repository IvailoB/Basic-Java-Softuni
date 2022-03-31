package ConditionalStatment;

import java.util.Scanner;

public class EVEN_ODD {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());

        if (num1 % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
