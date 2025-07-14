/*
Reverse only vowels in a string
Input: "hello"
Output: "holle"
 */
package Strings;
public class ReverseOnlyVowels
{
    public static void main(String[] args)
    {
        String name ="hello";
        Logic1(name);
    }

    public static void Logic1(String name)
    {
        char[]toChar = name.toCharArray();
        int start = 0;
        int end = name.length()-1;
        String vowels = "aeiou";

        while (start < end)
        {
            if (vowels.indexOf(toChar[start])== -1)
            {
              start++;
              continue;
            }

            if (vowels.indexOf(toChar[end])==-1)
            {
                end--;
                continue;
            }

            char temp = toChar[start];
            toChar[start]=toChar[end];
            toChar[end]=temp;

            start++;
            end--;
        }
        System.out.println(new String(toChar));
    }

}
