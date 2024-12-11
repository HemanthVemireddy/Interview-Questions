package Sumit_Interview_Topics.Strings;

import java.util.Arrays;

public class LowerCaseToUpperCase
{
    public static void main(String[] args)
    {
        Method1();
    }

    public static void Method1()
    {
        String s = "hemanthreddy";
        char[] arr = s.toCharArray();

        for (int i = 0; i< arr.length; i++)
        {
            if (arr[i] >= 'a' && arr[i]<= 'z')
            {
                arr[i] = (char)(arr[i] - 32);
            }
        }
        System.out.println("\n");
        System.out.println(String.valueOf(arr));
    }

}
