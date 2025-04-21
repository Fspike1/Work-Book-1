import java.util.Scanner;


public class BeginningMiniProject {
    public static void main(String[] args) {
        //asks user for name
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String nameInput = scanner.nextLine();
        System.out.println("Hello Faith! Welcome to the game: ");

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        //print second number
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        //make new line after nextDouble
        scanner.nextLine();

        //show options
        System.out.println("Different Operations:");
        System.out.println("Multiply, Divide, Add, Subtract");
        System.out.println("Pleas select an option");
        String operations = scanner.nextLine();
        //Perform operations based on choice
        double results = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

        // Generate random number between 1 and 6

        int rndmPick = (int)(Math.random()*6) + 1;
        System.out.println("You rolled a: " + rndmPick );

        //ask for a name
        System.out.println("Enter Hero's Name: ");
        String name = scanner.nextLine();

        //ask for strength
        System.out.println("Enter Hero's Strength: ");
        String strength = scanner.nextLine();

        //ask for agility(what is agility?: ability to think and understand quickly
        System.out.println("Enter Agility: ");
        String agility = scanner.nextLine();
        //Display hero's info below
        System.out.println("Hero: " + name + "| Strength: " + strength +  "| Agility: " + agility);


        //ask how many gold coins user found
        System.out.println("How many gold and silver coins did you find?: ");
        double gold = scanner.nextDouble();
        double silver = scanner.nextDouble();















    }
}
