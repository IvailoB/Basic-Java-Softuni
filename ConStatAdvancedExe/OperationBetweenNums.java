package ConStatAdvancedExe;

import java.util.Scanner;

public class OperationBetweenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        double result = 0;
        String oodOrEven = "";
        boolean isZero = false;

        if (operator == '+') {
            result = numOne + numTwo;
            if (result % 2 == 0) {
                oodOrEven = "even";
            } else {
                oodOrEven = "odd";
            }
        } else if (operator == '-') {
            result = numOne - numTwo;
            if (result % 2 == 0) {
                oodOrEven = "even";
            } else {
                oodOrEven = "odd";
            }
        } else if (operator == '*') {
            result = numOne * numTwo;
            if (result % 2 == 0){
                oodOrEven = "even";
            }else {
                oodOrEven = "odd";
            }
        } else if (operator == '/') {
            if (numTwo == 0){
                isZero = true;
            }else {
                result = numOne * 1.0 / numTwo;
            }
        } else if (operator == '%') {
            if (numTwo == 0){
                isZero = true;
            }else {
                result = numOne % numTwo;
            }
        }

        if (operator == '+' || operator =='-' || operator == '*'){
            System.out.printf("%d %c %d = %.0f - %s",numOne,operator,numTwo, result, oodOrEven);
        }else if (!isZero && operator == '/'){
            System.out.printf("%d / %d = %.2f",numOne,numTwo, result);
        }else if (!isZero && operator == '%'){
            System.out.printf("%d %% %d = %.0f",numOne,numTwo, result);
        }else if (isZero && operator == '/' || operator == '%'){
            System.out.printf("Cannot divide %d by zero", numOne);
        }

    }
}
