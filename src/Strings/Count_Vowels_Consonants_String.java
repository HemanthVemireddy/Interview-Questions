package Strings;

import java.util.Scanner;

public class Count_Vowels_Consonants_String
{
    public static void main(String[] args)
    {
        Count_Vowels_Consonants_String ch = new Count_Vowels_Consonants_String();
        ch.Logic1();
    }

    public static void Logic1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        // Use nextLine() to read the entire input line
        String name = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        // Define vowels
        String vowels = "aeiou";
        // Convert the string to lowercase to make the check case-insensitive
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);
            // Check if the character is a letter
            if (Character.isLetter(ch))
            {
                //This method checks if the character ch exists in the string
                if (vowels.indexOf(ch) != -1)
                {
                    vowelCount++;
                }
                else
                {
                    consonantCount++;
                }
            }
        }
        // Output the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        // Close the scanner
        sc.close();
    }
}
