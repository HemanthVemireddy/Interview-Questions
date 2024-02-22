package Imp;

public class AccentureInterview
{
    public static String ReplaceZerosInFirstPlace(String Name)
    {
     //   Step 1: Count Zeros in a string using charAt==0
        int ZerosCount = 0;
        for(int i = 0; i <Name.length(); i++)
        {
            if(Name.charAt(i)=='0')
            {
                ZerosCount++;
            }
        }
     // step 2: Create new Char Array and add zeros in char.
        char newchar[] = new char[Name.length()];
        for(int i = 0; i < ZerosCount; i++)
        {
            newchar[i]='0';
        }
    // Step 3:  need to check name string and replace remain values
        int j = ZerosCount;

        for(int i = 0; i < Name.length();i++)
        {
            if(Name.charAt(i)!='0')
            {
                newchar[j++]=Name.charAt(i);
            }
        }
        return new String(newchar);
    }
    public static void main(String[] args)
    {
        String num = "1536630000";
        String x = ReplaceZerosInFirstPlace(num);
        System.out.println(x);

    }
}
