package Challange_100_Days;

import java.util.Arrays;
import java.util.Comparator;

public class Day5
{
    public static void main(String[] args)
    {
        int [] nums = {3,32,30};
        LargestNumber(nums);
    }

    public static void LargestNumber(int [] nums)
    {

        String arr[] = new String[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {

            public int compare(String a, String b)
            {
                String order1 = a + b;
                String order2 =  b + a;
                return order2.compareTo(order1);
            }

        });

        System.out.println("Sorted Values:");
        for (String value : arr)
        {
            System.out.print(value + " ");
        }
    }
}
