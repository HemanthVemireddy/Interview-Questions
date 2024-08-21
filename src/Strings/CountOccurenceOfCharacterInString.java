package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfCharacterInString {

    public static void main(String [] args){
        String s="aabbcc";
        char[] EverySinglecharfromWord=s.toCharArray(); //Coverts the string to individual character

        Map<Character,Integer> charcountMap=new HashMap<>();

        //EverySingleCharacter from word is stored to character in forEachLoop
        for(char character:EverySinglecharfromWord)
        {
            if(charcountMap.containsKey(character))
            {
                charcountMap.put(character,charcountMap.get(character)+1);
            }
            else
            {
                charcountMap.put(character,1);
            }
        }
        for (Map.Entry<Character,Integer> hashtable:charcountMap.entrySet())
        {
            if (hashtable.getValue() > 1)
            {
                System.out.println(hashtable.getKey()+" = "+hashtable.getValue());
            }
        }

    }
}
