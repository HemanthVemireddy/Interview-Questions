/*
 Reverse string but keep special characters in place
Input: "a,b$c"
Output: "c,b$a"
 */
package Strings;
public class ReverseOnlyLetters
{
    public static void main(String[] args)
    {
      String name = "a,b$c";
      Logic1(name);
    }
    public static void Logic1(String name)
    {
        char[] chars = name.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start < end)
        {
            if (!Character.isLetter(chars[start]))
            {
                start++;
            }
            else if (!Character.isLetter(chars[end]))
            {
                end--;
            }
            else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(new String(chars));
    }
}
