package Topics.Strings;

public class bufferstring
{
    public static void main(String[] args)
    {
        /*

        1.How to Convert String to Integer.

         */

        String num = "9";

        int convernum = Integer.parseInt(num);

        System.out.println(convernum);


         /*

        2.How to Convert Integer to String.

         */

        int num1 = 60;
        String tc = String.valueOf(num1);
        String tc1 = Integer.toString(num1);
        System.out.println(tc);


    }
}
