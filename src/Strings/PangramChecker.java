package Strings;

import java.util.HashSet;

public class PangramChecker
{

    public static boolean isPangram(String sentence)
    {
        // Convert the sentence to lowercase to handle case insensitivity
        sentence = sentence.toLowerCase();

        // Use a HashSet to store the unique letters
        HashSet<Character> letters = new HashSet<>();

        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Add the letter to the HashSet
                letters.add(c);
            }
        }

        // Check if the HashSet contains all 26 letters of the alphabet
        return letters.size() == 26;
    }

    public static void main(String[] args)
    {
        String sentence = "The quick brown fox jumps over the lazy dog";
        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
}
