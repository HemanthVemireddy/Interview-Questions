package Strings;

import java.util.Scanner;

public class CountOccurenceOfParticularCharacterInString
{
    public static void main(String[] args)
    {
        Logic2();
    }
    public static void Logic1()
    {
        String str="Praveen";
        str=str.toLowerCase();
        char[] charArray = str.toCharArray();
        int occurrence = 0;
        char toFind='e';
        for (int i = 0; i < charArray.length; i++) {
            if (toFind == charArray[i]) {
                occurrence++;
            }
        }
        System.out.println("Character "+toFind+" present " +occurrence+ " times");
    }

    public static void Logic2()
    {
        String str = "banana";
        str = str.toLowerCase();
        char finElement = 'a';
        int count = 0;
        for (int i = 0; i< str.length(); i++)
        {
            if (str.charAt(i)==finElement)
            {
                count++;
            }
        }
        System.out.println("Character '" + finElement + "' appears " + count + " times.");
    }
}



