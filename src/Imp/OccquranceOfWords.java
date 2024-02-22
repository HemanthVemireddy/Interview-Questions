package Imp;

import java.util.HashMap;
import java.util.Map;

public class OccquranceOfWords
{
    // Hemanth Kumar Reddy Hemanth
    // Hemanth 2 Kumar 1 Reddy 1

    public static void CountCharacter(String name)
    {
        char[] tochar = name.toCharArray();

        Map<Character, Integer> hash = new HashMap<Character,Integer>();

        for(Character c : tochar)
        {
            if(hash.containsKey(c))
            {
                hash.put(c, hash.get(c)+1);
            }
            else
            {
                hash.put(c,1);
            }
        }
        System.out.println("Count of Character :\t"+hash.toString());
    }

    public static void CountString(String name)
    {
        String[] split = name.split("\\s+");
        Map<String, Integer> xcv = new HashMap<String, Integer>();

        for(String b : split)
        {
            if(xcv.containsKey(b))
            {
                xcv.put(b, xcv.get(b)+1);
            }
            else
            {
                xcv.put(b, 1);
            }
        }
        System.out.println(name+" "+xcv);
    }
    public static void main(String[] args)
    {
        CountCharacter("HEEEEEMABBBB");
        CountString("Hemanth Kumar Reddy");
    }
}
