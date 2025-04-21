import java.util.Locale;

public class WorkingWithStrings {
    public static void main(String[] args) {

        //#1
        String name = "Faith ";
        System.out.println(" Hello " + name + " ! ");
        //#2
        String input = "Chicken Alfredo";
        System.out.println("The string has " + input.length() + " characters. " );

        //#3
        String word = "Glowing";
        System.out.println("First character" + word.charAt(0));
        System.out.println("Last character" + word.charAt(word.length()-1));

        //#4
        String str = "Healing Energy";
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        //#5
        String phrase = "You're really learning JAVA! ";
        boolean hasJava = phrase.contains("Java");
        if (hasJava) {
            System.out.println("You have Java");
        }else {
            System.out.println("You don't have Java");
        }











    }
}
