package Test;

import java.util.*;

public class Practice
{

    public static void main(String[] args)
    {
        Practice p = new Practice();
        p.Anagram("pac","cap");
    }

    public static void Anagram(String s1, String s2)
    {
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        if (str1.length()!=str2.length())
        {
            System.out.println("Both are Not Equal So Not a anagram Number !!");
        }
        else
        {
            char[] tocharstr1 = str1.toCharArray();
            char[] tocharstr2 = str2.toCharArray();

            Arrays.sort(tocharstr1);
            Arrays.sort(tocharstr2);


            if(Arrays.equals(tocharstr1,tocharstr2)==true)
            {
                System.out.println("Given String is Anagram ");
            }
            else
            {
                System.out.println("Faill ....");
            }
        }
    }
}
