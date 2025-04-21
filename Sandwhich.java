import java.util.Scanner;

public class Sandwhich {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Ask for sandwich size
            System.out.println("Welcome to the Sandwich Shop!");
            System.out.println("What size sandwich do you want?");
            System.out.println("Type 1 for Regular ($5.45) or 2 for Large ($8.95): ");
            int size = scanner.nextInt();

            double price = 0;

            if (size == 1) {
                price = 5.45;
            } else if (size == 2) {
                price = 8.95;
            } else {
                System.out.println("Invalid size selected. Try again next time.");
                return;
            }

            // Step 2: Ask if they want it loaded
            System.out.println("Do you want your sandwich loaded? (yes or no): ");
            scanner.nextLine(); // catch the leftover newline
            String loaded = scanner.nextLine();

            if (loaded.equalsIgnoreCase("yes")) {
                price = price * 2;
            }

            // Step 3: Ask for age
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            // Step 4: Apply discount if needed
            if (age <= 17) {
                price = price * 0.90; // 10% off
            } else if (age >= 65) {
                price = price * 0.80; // 20% off
            }

            // Step 5: Show the final price
            System.out.printf("Your total is: $" + price);
        }
    }


