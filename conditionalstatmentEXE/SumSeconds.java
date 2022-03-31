package conditionalstatmentEXE;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ftime = Integer.parseInt(scanner.nextLine());
        int stime = Integer.parseInt(scanner.nextLine());
        int ttime = Integer.parseInt(scanner.nextLine());

        int sum = ftime + stime + ttime;
        int min = sum /60;
        int sec = sum % 60;

        System.out.printf ("%d:%0d" , min , sec);

    }
}
