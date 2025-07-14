package Strings;

public class ReverseTheSentence {

    public static void main(String[] args)
    {
        String str = " Java is fun ";
        Logic1(str);

    }
    public static void Logic1(String str)
    {

        String [] strSplit = str.split(" "); //  //s means separating it by space

        for(int i=strSplit.length-1; i>=0; i--)
        {
            System.out.print(strSplit[i]+" ");
        }
    }
}
