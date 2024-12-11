package Sumit_Interview_Topics.Arrays;

import java.util.Arrays;

public class MovePositiveLeft
{
    public static void main(String[] args)
    {
        method1();
    }
    public static void method1()
    {
       int arr[] = new int[]{1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
       int j = 0; //to check the position
       for (int i = 0; i< arr.length; i++)
       {
           if (arr[i] > 0)
           {
               if (i != j)
               {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;

               }
               j++;
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
