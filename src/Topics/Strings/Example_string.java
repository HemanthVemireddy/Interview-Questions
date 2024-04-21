package Topics.Strings;

import java.util.Arrays;
import java.util.StringJoiner;

public class Example_string
{
    public static void main(String[] args)
    {
        splitString();
        defaultStringMethod();
    }
    public static void stringCon()
    {
        // String Concatination

        //1. using + operator

        String s = "Hemanth" + "Kumar";
        System.out.println(s);

        //2. Using StringBuilder
        String x = (new StringBuilder()).append("Hemanth").append("Kumar").toString();

        System.out.println(x);

        //3. Using StringJoiner
        StringJoiner str = new StringJoiner("");
        str.add("Hemanth");
        str.add("Kumar");

        System.out.println(str.toString());
    }

    public static void splitString()
    {
        String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        System.out.println(Arrays.toString(fruits));
    }

    public static  void defaultStringMethod()
    {
        /* By Default Java.lang.String   class provides Defaults Methods

        1. toLowerCase()
        2. toUpperCase()
        3. Trim()
        4. StartWith()
        5. EndWith()
        6. ChatAt()
        7. Length()
        8. ValueOf() --> Convert Int, Floot, Char into String
        9. Replace

         */

        String exm = " Example";
        System.out.println(exm.toLowerCase());


        System.out.println(exm.toLowerCase());


        System.out.println(exm.trim());

        System.out.println(exm.startsWith(" "));
        System.out.println(exm.endsWith("e"));


    }


}
