import java.util.Scanner;

public class OutputAssignment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Please choose the following: ");
        System.out.println("A, D, S, M");
        String operationInput = scanner.nextLine();
        System.out.println("You chose * M");

        double result = num1 * num2;
        System.out.println("result: " + result);










    }
}
