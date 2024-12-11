package Strings.Exercise;

public class Exercise2_lexicographically
{
    public static void main(String[] args)
    {
        Test();
    }
    public static void Test()
    {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";

        System.out.println("String 1:\t"+str1);
        System.out.println("String 2:\t"+str2);

        int result = str1.compareTo(str2);

       if (result > 0)
       {
         System.out.println(str1+" Greater Than "+str2);
       }
       else if (result == 0)
       {
           System.out.println(str1+" Is Equal "+str2);
       }
       else
       {
           System.out.println(str1+" Less than "+str2);
       }


    }
}
