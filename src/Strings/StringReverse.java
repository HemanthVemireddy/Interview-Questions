package Strings;

public class StringReverse {

    public static void main(String [] args)
    {
        String s="selenium";
        Loic1(s);
    }
    public static void Loic1(String s)
    {
        String rev="";

        //Using standard method
        //with out using default function
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.print(rev);



        //String s="selenium";
        //   String s1= s.substring(0,1).toUpperCase()+s.substring(0);
        // System.out.println(s1);
    }

    public static void DefaultMethod(String s)
    {
        //Using stringBuffer
       StringBuffer sb=new StringBuffer(s);
        StringBuffer reversed=sb.reverse();
        System.out.println(reversed);
    }
}
