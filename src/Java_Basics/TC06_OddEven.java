/*
OddEvenNumbers
Input = 11
Output = Given number is odd number
 */
package Java_Basics;
import java.util.Scanner;
public class TC06_OddEven
{
    public static void main(String[] args) {
        OddEvenNumbers();
    }
    public static void OddEvenNumbers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num = sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.println(num+ " is a Even Number");
        }
        else
        {
            System.out.println(num+ " is a odd Number");
        }
    }
}
