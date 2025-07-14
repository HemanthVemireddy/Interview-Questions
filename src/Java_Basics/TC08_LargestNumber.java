/*
Largest number from 3 number/ given list
 */
package Java_Basics;
import java.util.*;

public class TC08_LargestNumber
{
    public static void main(String[] args)
    {
        //number_Largest_Logic1();
        number_Largest_Logic2();
    }
    public static void number_Largest_Logic1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter Secound Number ");
        int num2 =sc.nextInt();
        System.out.println("Enter Third Number ");
        int num3 =sc.nextInt();

        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println(num1 + " is the largest number.");
        }
        else if (num2 >= num1 && num2 >= num3)
        {
            System.out.println(num2 + " is the largest number.");
        }
        else
        {
            System.out.println(num3 + " is the largest number.");
        }
    }

    public static void number_Largest_Logic2() {
        List<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(100);
        System.out.println(Collections.max(numbers));
    }
}
