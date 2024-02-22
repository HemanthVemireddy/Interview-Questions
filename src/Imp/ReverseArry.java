package Imp;

import java.util.Arrays;

public class ReverseArry
{
    // In Array = [1,2,3,4,5]
    public static void Array(int[] name)
    {
        System.out.println("Actual Array is :\t"+ Arrays.toString(name));
        int start = 0;
        int end = name.length-1;
        int temp = 0;
        while (start < end)
        {
            temp = name[start];
            name[start] = name[end];
            name[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reverse Array is :\t"+ Arrays.toString(name));
    }
    public static void main(String[] args)
    {
        int[] Array = {1,2,3,4,5};
        Array(Array);
    }
}
