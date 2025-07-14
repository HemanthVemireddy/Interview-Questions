/*
Swap two numbers
Input: a = 100, b= 200;
Output: a = 200, b= 100;
 */
package Java_Basics;
public class TC01_SwapToIntegers {
    public static void main(String[] args) {
        int a = 10,  b = 20;
        int c = 100, d = 200;
        Logic1(a,b);
        Logic2(c,d);

    }
    public static void Logic1(int a, int b)
    {
        System.out.println("Before swaping a = "+ a   +" && B =  "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping  a =  "+ a   +" && B =  "+b);
    }

    public static void Logic2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping  a = " + a + " && B =  " + b);
    }

    public static void Logic3(int a, int b)
    {
        a = a^b;
        b = a ^b;
        a = a^b;
        System.out.println("After swaping  a = " + a + " && B =  " + b);
    }
}
