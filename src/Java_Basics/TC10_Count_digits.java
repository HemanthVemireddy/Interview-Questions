/*
Count digits in an integer number
Input = 29845315, Output = 8
 */
package Java_Basics;
import java.util.Scanner;
public class TC10_Count_digits {
    public static void main(String[] args)
    {
        Logic1();
    }
    public static void Logic1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0)
        {
            num = num / 10;
            count++;
        }
        System.out.println("Total Number of counts "+count);
    }
}
