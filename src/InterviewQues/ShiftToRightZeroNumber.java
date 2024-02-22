package InterviewQues;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShiftToRightZeroNumber {
    private static int[] ShiftToRight(int [] a)
    {
        if(a.length == 1)
        {
            return a;
        }
        int newArray[] = new int[a.length];
        System.out.println("New Array Duplicate Array \t:"+Arrays.toString(newArray));
        int count = 0;
        for(int number : a)
        {
            if(number != 0)
            {
                newArray[count] = number;
                count++;
            }
        }
        return newArray;
    }

    public static void main(String[] args)
    {
        int [] i = new int[]{0,3,4,5,0,6,7,8,0};
        System.out.println("Displaying non zero right \t"+ Arrays.toString(ShiftToRight(i)));
    }
}
