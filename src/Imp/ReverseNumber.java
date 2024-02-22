package Imp;

public class ReverseNumber
{
    public static void ReverseNum(int number)
    {
        System.out.println("Actual number is :\t"+number);
        int rev = 0;
        int sum;
        while(number!=0)
        {
            rev = rev * 10 + number % 10;
            number = number / 10;

        }
        System.out.println("Reverse Number is :\t"+rev);
    }
    public static void main(String[] args)
    {
        int number = 12345;
        ReverseNum(number);
    }
}
