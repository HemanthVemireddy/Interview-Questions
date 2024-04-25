package Challange_100_Days;

public class Day4
{
    /*
       Check Even or odd with out using any operation
     */

    public static void main(String[] args)
    {
        int number = 16;

        if((number & 1) == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
