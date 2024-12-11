package Sumit_Interview_Topics.Strings;

public class UpperCaseToLowerCase
{
    public static void main(String[] args)
    {
        Method1();
    }

    public static void Method1()
    {
        String s = "HEMANTH";
        char[] charArray = s.toCharArray();

        for(int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] >= 'A' && charArray[i] <='Z')
            {
                charArray[i] = (char)(charArray[i]+32);
            }
        }
        System.out.println(String.valueOf(charArray));
    }
}
