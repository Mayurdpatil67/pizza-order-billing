import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Pizza Ordering System!");
        System.out.print("Do you want a deluxe pizza? (yes/no): ");
        boolean isDeluxe = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Do you want a vegetarian pizza? (yes/no): ");
        boolean isVeg = scanner.nextLine().equalsIgnoreCase("yes");

        Pizza pizza;
        if (isDeluxe) {
            pizza = new DeluxPizza(isVeg);
        } else {
            pizza = new Pizza(isVeg);

            System.out.print("Do you want extra cheese? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                pizza.addExtraCheese();
            }

            System.out.print("Do you want extra toppings? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                pizza.addExtraToppings();
            }
        }

        System.out.print("Do you want takeaway? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            pizza.takeAway();
        }

        System.out.println("\nYour final bill:");
        pizza.getBill();

        scanner.close();
    }
}
