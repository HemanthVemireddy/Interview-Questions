/*
Armstrong number -
Armstrong number is a number that is equal to the sum of cubes of its digits.
Input: 153 , Output: Yes
153 is an Armstrong number. ==> (1*1*1) + (5*5*5) + (3*3*3) = 153
 */
package Java_Basics;
public class TC02_Armstrong_Number
{
    public static void main(String[] args) {
        Armstrong(153);
    }


    public static void Armstrong(int num)
    {
       int LastDigit ;
       int sum=0;
       int temp = num;
       while(num>0){
       LastDigit = num % 10;
       num = num / 10;
       sum = sum + (LastDigit * LastDigit * LastDigit);}
       System.out.println(sum);
       if (temp == sum)
       {
           System.out.println(temp+" Armstrong Number");
       }
       else
       {
           System.out.println(temp+" Not a Armstrong Number");
       }
    }

    //suppose u can pick any number contains more than two digits = 123
    // each digit multiply with 3 like 1 * 3  = 1 * 1 * 1 * 1 = 1
    //             + 2 * 3  = 2 * 2 * 2 =8
    //             + 3 * 3= 3 * 3 * 3 = 27 -> 1 + 8 + 27 = 36
}
