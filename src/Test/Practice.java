package Test;

import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Test();
    }
    public static void Test()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String ");
      String text = sc.nextLine();
      char[] charArr = text.toCharArray();
      String vowels = "aeiou";
     int startPosition = 0;
     int Lastposition = text.length()-1;
     while (startPosition < Lastposition) {
         while (startPosition < Lastposition && vowels.indexOf(charArr[startPosition]) == -1) {
             startPosition++;
         }
         while (startPosition < Lastposition && vowels.indexOf(charArr[Lastposition]) == -1) {
             Lastposition--;
         }
         char temp = charArr[startPosition];
         charArr[startPosition] = charArr[Lastposition];
         charArr[Lastposition] = temp;
         startPosition++;
         Lastposition--;
     }
        System.out.println(new String(charArr));
    }
}
