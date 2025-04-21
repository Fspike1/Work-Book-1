package Workshops;

import java.util.Scanner;

public class SentenceAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        //.length() returns the number of characters in the string, including spaces and punctuation.
        int length = sentence.length();
        System.out.println(" The sentence has " + length + "characters. ");

        // split(" ") breaks the string wherever it finds a space. This creates an array of words — even though they haven’t learned arrays, we’re not doing anything array-ish except .length and reading from it.

        String[] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("The sentence has " + wordCount + " words. " );












    }



}
