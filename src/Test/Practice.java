package Test;

import java.util.*;

public class Practice
{

    public static void main(String[] args)
    {

        Test("AABBCCDDDEEEFFFGGGGGG");
    }

    public static void Test(String num)
    {
        if (num == null)
        {
            System.out.println("Null");
        }

        char[] tochar = num.toCharArray();

        for (int i =0 ; i < num.length(); i++)
        {
            if (tochar[i] >= 'A' && tochar[i] <= 'Z')
            {
                tochar[i] = (char) (tochar[i] + ('a' - 'A'));
            }
        }
    }
}
