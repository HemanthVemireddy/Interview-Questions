package Imp;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesWords
{
    public static void DuplicateCharacter(String name)
    {
        char[] space = name.toCharArray();
        Set<Character>duplicateString = new HashSet<Character>();

        for (Character A : space)
        {
            if(!String.valueOf(A).isEmpty()) {
                duplicateString.add(A);
            }
        }
        for(Character ch : duplicateString)
        {
            System.out.print(ch+" ");
        }

    }
    public static void main(String[] args)
    {
        String name = "Hello All Hello ";
        DuplicateCharacter(name);
    }
}
