/*
Prime Number
Prime number is a number that is greater than 1 and divided by 1 or itself only.
Input = 31, Output = The number is prime.
 */
package Java_Basics;
import java.util.Scanner;
public class TC07_Prime_Number
{
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
        if (num <=1)
        {
            System.out.println("Not a Prime number ");
        }
        else
        {
            for (int i = 2; i<=num; i++)
            {
                if (num % i == 0)
                {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("The number is not prime");
            } else {
                System.out.println("The number is prime"); }
        }
    }
    /*
    Prime number is a number that is greater than 1 and divided by 1 or itself only.
    Input = 31, Output = The number is prime.
     */
}
