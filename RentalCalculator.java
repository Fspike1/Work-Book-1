
import java.util.Locale;
import java.util.Scanner;

public class RentalCalculator {
    public static void main(String[] args) {
        //$29.99 per day and 30% charge drivers under 25


        Scanner scanner = new Scanner(System.in);
     // Get information
     String pickupDate;
        System.out.println("What is your pickup date?");
        String pickDate = scanner.nextLine();


        System.out.println("How many days do you need?: ");
        int daysRented = scanner.nextInt();

        System.out.println("Do you want toll tag? (Yes/No): ");
        String tag = scanner.nextLine().toLowerCase();
        scanner.nextLine();













    }
}
