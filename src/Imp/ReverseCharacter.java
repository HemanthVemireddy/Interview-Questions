package Imp;

public class ReverseCharacter
{
    public static void reversharacter(String name)
    {
       String[] removeSpace = name.split("\\s+");
       String reverse = "";
       StringBuilder sb = new StringBuilder();
       for(String s : removeSpace)
       {
           sb.reverse();
           reverse = reverse+sb.toString() +" ";
       }
       System.out.println(reverse.trim());
    }
    public static void main(String[] args)
    {
        String name = "ONE TWO";
        reversharacter(name);
    }
}
