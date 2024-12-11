package Strings.Exercise;

public class Exercise1
{
    /*
    Original String = Java Exercises!
    The character at position 0 is J
    The character at position 10 is i
    */
    public static void main(String[] args) {

        String Original  = "Java Exercises!";
        Test(Original);
    }

    public static void Test(String Original)
    {
        int length = Original.length();

       for (int i = 0; i <= length-1; i++)
       {
           System.out.println("The character at position "+ i +" is " + Original.charAt(i));
       }
    }

}
