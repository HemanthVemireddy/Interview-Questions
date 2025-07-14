package Strings;

import java.util.Scanner;

public class CountVowelsInAString
{

    public static void main(String[] args)
    {
        Logic1();
    }
    public static void Logic1()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String ");
       String s = sc.nextLine();
       s=s.toLowerCase();

        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Vowels present in String "+s+ " is " +count);
    }
}
