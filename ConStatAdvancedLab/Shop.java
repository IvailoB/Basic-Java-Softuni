package ConStatAdvancedLab;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;


        switch (product) {
            case "coffee":
                if (city.equals("Sofia")) {
                    price = 0.50;
                    System.out.println(price * quantity);
                } else if (city.equals("Plovdiv")) {
                    price = 0.40;
                    System.out.println(price * quantity);

                } else if (city.equals("Varna")) {
                    price = 0.45;
                    System.out.println(price * quantity);
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    price = 0.80;
                    System.out.println(price * quantity);
                } else if (city.equals("Plovdiv")) {
                    price = 0.70;
                    System.out.println(price * quantity);

                } else if (city.equals("Varna")) {
                    price = 0.70;
                    System.out.println(price * quantity);
                }
                break;
            case "beer":
                if (city.equals("Sofia")){
                    price = 1.20;
                    System.out.println(price*quantity);
                }else if (city.equals("Plovdiv")){
                    price = 1.15;
                    System.out.println(price*quantity);

                }else if (city.equals("Varna")){
                    price = 1.10;
                    System.out.println(price*quantity);
                }
                break;
            case "sweets":
                if (city.equals("Sofia")){
                    price = 1.45;
                    System.out.println(price*quantity);
                }else if (city.equals("Plovdiv")){
                    price = 1.30;
                    System.out.println(price*quantity);

                }else if (city.equals("Varna")){
                    price = 1.35;
                    System.out.println(price*quantity);
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")){
                    price = 1.60;
                    System.out.println(price*quantity);
                }else if (city.equals("Plovdiv")){
                    price = 1.50;
                    System.out.println(price*quantity);

                }else if (city.equals("Varna")){
                    price = 1.55;
                    System.out.println(price*quantity);
                }
                break;
        }
    }
}
