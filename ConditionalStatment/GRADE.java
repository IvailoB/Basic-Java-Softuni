package ConditionalStatment;

import java.util.Scanner;

public class GRADE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int great = Integer.parseInt(scanner.nextLine());
        boolean isExellent = great >=5;
        System.out.println(isExellent);
    }
}
