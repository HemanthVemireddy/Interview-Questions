/*
Reverse a numbers and Number is Palindrome or Not.
Input = 12321
Output =12321
 */
package Java_Basics;
public class TC04_Palindrome {
    public static void main(String[] args) {
        Polindrome_Number(15451);
    }
    public static void Polindrome_Number(int number)
    {
        int reminder;
        int rev =0;
        int temp = number;
      while (number > 0) {
           reminder = number % 10;
           rev = (rev * 10)+reminder;
           number = number / 10;
      }
      System.out.println("Reverse Number is = "+ rev);
     if (temp == rev)
     {
         System.out.println(temp+" is a Palindrome Number");
     }
     else
     {
         System.out.println(temp+" Not Palindrome Number");
     }
    }
    /*
    Input = 12321
    Output =12321
    if u traverse both ways output should be same. from left to right && right to left
     */
}
