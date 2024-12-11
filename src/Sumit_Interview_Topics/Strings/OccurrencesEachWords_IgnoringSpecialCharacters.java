package Sumit_Interview_Topics.Strings;

public class OccurrencesEachWords_IgnoringSpecialCharacters
{
    public static void main(String[] args)
    {
        Method();
    }

    public static void Method()
    {
        String s = "This is a test, test sentence to find, find a repetitive words. repetitive words!";
        System.out.println("Original string: " + s);


        String rep = s.replaceAll("[^a-zA-Z]","").toString();
        System.out.println("replaced string: " + rep);


        String[] strarr = rep.split("\\s");
        System.out.println("string arr: " + strarr);
    }
}
