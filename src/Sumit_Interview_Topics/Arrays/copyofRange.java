package Sumit_Interview_Topics.Arrays;

import java.util.Arrays;

public class copyofRange {
    public static void main(String[] args)
    {
        int[] arr= {1,2,3,5,7,9};
        int n = 2;
        //method1(arr,n);
        Method2(arr, 0, n - 1);
        printArray(arr);

        Method2(arr, n, arr.length - 1);
        printArray(arr);

        Method2(arr, 0, arr.length - 1);
        printArray(arr);

    }

    public static void method1(int[] arr,int n)
    {
        // Step 1: Slice array into two parts

        int[] part1 = Arrays.copyOfRange(arr,n, arr.length);
        System.out.println(Arrays.toString(part1));


        int[] part2 = Arrays.copyOfRange(arr,0,n);
        System.out.println(Arrays.toString(part2));

        // Step 2: Combine arrays
        int[] result = new int[arr.length];
        System.arraycopy(part1, 0, result, 0, part1.length);
        System.arraycopy(part2, 0, result, part1.length, part2.length);

        // Output the result
        System.out.println(Arrays.toString(result));
    }

     // swap the array
    public static void Method2(int[] arr, int start, int end)
    {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // For a newline after printing the array
    }
}
