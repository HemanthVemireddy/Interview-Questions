package Sumit_Interview_Topics.Strings;

public class MainMethod_Overload
{
    public  static  void main(int a)
    {
        System.out.println("This is Int  arguments.");
    }
    public static void main(double a)
    {
        System.out.println("This is double  arguments.");
    }
    public static void main(char a)
    {
        System.out.println("This is Char  arguments");
    }
    public  static  void main(int[] a)
    {
        System.out.println("This is Int array arguments.");
    }
    public static void main(double[] a)
    {
        System.out.println("This is double array arguments.");
    }
    public static void main(char[] a)
    {
        System.out.println("This is Char Array arguments");
    }

    public static void main(String[] args)
    {
        MainMethod_Overload.main(10);
    }
}
