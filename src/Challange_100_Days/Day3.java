package Challange_100_Days;

public class Day3
{
    /*
     suppose in a array we need to find non repeated integer
     using xor operation
     */
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,1,2};
        int result = 0;

        for(int i = 0; i < arr.length; i++)
        {
            result = result ^ arr[i];
        }
        System.out.println("Non repeated array is = "+result);
    }
}
