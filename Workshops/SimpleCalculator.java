package Workshops;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("choose an operator (+,-,*,/): ");
        String operator = scanner.nextLine();

        double result;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("Unknown operator!");
            return;
        }
        System.out.println("Result: " + result);



    }public static double calculate(double a, double b, String op) {
        if (op.equals("+")) return a + b;
        else if (op.equals("-")) return a - b;
        else if (op.equals("*")) return a * b;
        else if (op.equals("/")) return a / b;
        else {
            System.out.println("Unknown operator.");
            return 0;
        }
    }


}
