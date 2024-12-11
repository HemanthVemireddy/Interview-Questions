package Sumit_Interview_Topics.Strings;

public class Method_Overload
{
    public static void m1()
    {
        System.out.println("No arguments present");
    }
    public static void m1(int num)
    {
        System.out.println("int arguments present");
    }
    public static void m1(char c)
    {
        System.out.println("char arguments present");
    }
    public static void m1(String num)
    {
        System.out.println("String arguments present");
    }
    public static void m1(int num, String num1)
    {
        System.out.println("int, string arguments present");
    }


    public static void main(String[] args)
    {
        Method_Overload.m1(10);
    }
}
