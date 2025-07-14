/*
Fibonacci Series –
In Fibonacci series, next number is the sum of previous two numbers
Input = First 10 Numbers
Output = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
The first two numbers of Fibonacci series are 0 and 1
 */
package Java_Basics;
public class TC03_Fibonacci
{
    public static void main(String[] args) {
        Fibonacci_Series(10);
    }

    public static void Fibonacci_Series(int number)
    {
    int Num1 = 0;
    int Num2 = 1;
    int Num3;
    for (int i = 0; i <= number;i++)
    {
        System.out.print(" "+ Num1);
        Num3 = Num1 + Num2;
        Num1 = Num2;
        Num2 = Num3;
    }


    }
    /*
    In Fibonacci series, next number is the sum of previous two numbers
    Input = First 10 Numbers
    Output = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
    The first two numbers of Fibonacci series are 0 and 1.
     */
}
