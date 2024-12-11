package Strings.StringBuilder;

public class Program1
{
    public  static  void SeparateCharacters()
    {

        String input = "sumitM28";
        char [] tocharArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char ch : tocharArray)
        {
            if (Character.isUpperCase(ch))
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args)
    {
        SeparateCharacters();
    }
}


/*
Given string sumitM28  , print small character , number and capital letter separately. Output should be :
sumit
M
28
     */

