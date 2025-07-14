/*
Sum of Digits
Sum of all given numbers.
Input = 987
Output = 24
 */
package Java_Basics;
public class TC09_Sum_ofDigits
{
    public static void main(String[] args)
    {
        SumofDigits_Flow1(1234);
    }
    public static void SumofDigits_Flow1(int num) {
        int sum = 0;
        int rem;
      while (num != 0){
          rem = num % 10;
         sum = sum + rem;
         num = num / 10;
      }
        System.out.println(sum);
    }
}
