package Imp;

public class ReverseString
{
    public static void ReverseString(String name)
    {
        System.out.println("Actual String is :\t"+name);
        int length = name.length();
        String rev = "";
        String Lowername = name.toUpperCase();
        for (int i = length-1; i >=0; i--)
        {
            rev = rev +Lowername.charAt(i);
        }
        System.out.println("Reverse Number is :\t"+rev);
    }
    public static void main(String[] args)
    {
        String name = "I am Hemanth";
        ReverseString(name);
    }
}
