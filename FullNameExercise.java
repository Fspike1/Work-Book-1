import java.util.Scanner;

public class FullNameExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine() .trim();
        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 2) {
            System.out.println("First Name: " + nameParts[0]);
            
        }
            



    }
}
