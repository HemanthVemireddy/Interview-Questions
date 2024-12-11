package Sumit_Interview_Topics.Arrays;

public class SecondLargestElementArray
{
    public static void main(String[] args)
    {
        Method1();
    }
    public static void Method1()
    {
        int [] arr = new int[] {10,20,30,40,50,60,70,80,90};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        System.out.println("Range start : "+ largest);
        System.out.println("Range start : "+second_largest);

        for(int i =0; i<arr.length; i++)
        {
            if (arr[i] > largest)
            {
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest = arr[i];
            }
        }
        if(second_largest == Integer.MIN_VALUE)
        {
            System.out.println("There is no second largest element present");
        }

        else {
            System.out.println("Second largest element is ="+second_largest);
        }
    }
}
