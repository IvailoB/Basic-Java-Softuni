package WhileLoopExe;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int spendingCounter = 0;

        while (ownedMoney < neededMoney && spendingCounter < 5) {
            daysCounter++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if ("save".equals(command)) {
                spendingCounter = 0;
                ownedMoney += money;
            } else if ("spend".equals(command)) {
                ownedMoney -= money;
                spendingCounter++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
        }
        if (spendingCounter == 5) {
            System.out.printf("You can't save the money. %n");
            System.out.printf("%d", daysCounter);
        }
        if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
