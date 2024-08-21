package Strings;

public class RearrangeString
{
    public static void main(String[] args)
    {
        String input = "Hemanth";
        String output = RearrangeCharacter(input);
        System.out.println(output);
    }
    public static String RearrangeCharacter(String name)
    {
        if (name.length()==0 || name == null)
        {
            System.out.println("The String is Null ");
            return name;
        }

            char[] tochar = name.toCharArray();

            char temp = tochar[1];
            tochar[1] = tochar[0];
            tochar[0] = temp;

            temp = tochar[name.length()-1];
            tochar[name.length()-1] = tochar[name.length()-2];
            tochar[name.length()-2] = temp;

            return new String(tochar);

    }
}
