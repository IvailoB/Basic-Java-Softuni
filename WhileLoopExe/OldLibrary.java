package WhileLoopExe;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();
        String inputLine = scanner.nextLine();
        boolean wasFound = false;
        int count = 0;
        while (!inputLine.equals("No More Books")) {
            String currentBook = inputLine;
            if (currentBook.equals(wantedBook)) {
                wasFound = true;
                break;
            }
            count++;
            inputLine = scanner.nextLine();
        }
        if (wasFound) {
            System.out.printf("You checked %d " +
                    "books and found it." ,count);
        }else {

            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d book.",count);
        }
    }
}
