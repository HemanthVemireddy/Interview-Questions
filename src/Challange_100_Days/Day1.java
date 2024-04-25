package Challange_100_Days;

import java.util.Arrays;

public class Day1
{
    /*
    Print Even Words

    String Words = "sky is blue and vast"

    o/p : is   2 {Even}
          blue 4 {Even}
          vast 4 {Even}

     */
    public static void main(String[] args)
    {
        String s = "sky is blue and vast";
        EvenWords(s);
    }

    public static void EvenWords(String text)
    {
        try
        {
            String[] strArray = text.split(" ");

            System.out.println("String is : "+Arrays.toString(strArray));

            for (String currentWord : strArray)
            {
                if (currentWord.length() % 2 == 0)
                {
                    System.out.println("EvenWords : "+currentWord + " " +currentWord.length());
                }
            }
        }
        catch (Exception e)
        {

        }
    }
}
