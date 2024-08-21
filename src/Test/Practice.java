package Test;

import java.util.*;

public class Practice
{

    public static void main(String[] args)
    {
        Test();
    }

    public static void Test()
    {
      Scanner sc = new Scanner(System.in);

      String First = sc.next();
      String Secound = sc.next();

      System.out.println("First String is : "+First);
      System.out.println("Secound String is : "+Secound);

      if (First.length()!= Secound.length())
      {
          System.out.println("Both Strings length are not Equal");
      }
      else
      {
          char[] firstTochar = First.toCharArray();
          char[] SecoundToChar = Secound.toCharArray();

          Arrays.sort(firstTochar);
          Arrays.sort(SecoundToChar);

          if (Arrays.equals(firstTochar,SecoundToChar)== true)
          {
              System.out.println("Both are Equal so Both Strings are Anagram");
          }
          else
          {
              System.out.println("Both are Not Anagram");
          }
      }
    }
}
