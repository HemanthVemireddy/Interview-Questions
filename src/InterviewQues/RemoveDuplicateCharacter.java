package InterviewQues;

import java.util.Arrays;

public class RemoveDuplicateCharacter {

    public static void removeDuplicate(char str[] , int length)
    {
        int index = 0;
        for(int i = 0; i <length; i++)
        {
            int j;
            for(j = 0; j < i; j++)
            {
                if(str[i]==str[j])
                {
                    break;
                }
            }
            if(i == j)
            {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }
    public static void main(String[] args)
    {
        String info = "javaTpoint is the best learning website";
        char str[] = info.toCharArray();
        int length = info.length();
        removeDuplicate(str,length);
    }
}
