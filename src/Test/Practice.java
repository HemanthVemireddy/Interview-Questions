package Test;

import java.util.*;

public class Practice
{

    public static void main(String[] args)
    {

        Test("Hemanth");
    }

    public static void Test(String name)
    {
        char[] convertchar = name.toCharArray();
        HashMap<Character,Integer>hashMap = new HashMap<Character,Integer>();
        for (char c : convertchar)
        {
            if (hashMap.containsKey(c))
            {
                hashMap.put(c, hashMap.get(c)+1);
            }
            else
            {
                hashMap.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> hash: hashMap.entrySet())
        {
            if (hash.getValue() > 0)
            {

            }
        }
    }
}
