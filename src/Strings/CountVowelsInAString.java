package Strings;

public class CountVowelsInAString {

    public static void main(String[] args)
    {
        Count_Vowels();
        String name = "ExampleName";
        int consonantCount = countConsonants(name);
        System.out.println("Number of consonants in " + name + ": " + consonantCount);
    }

    public static void Count_Vowels()
    {
        String s="Swathi";
        s=s.toLowerCase();

        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println("Vowels present in String "+s+ " is " +count);
    }


    public static int countConsonants(String name) {
        int count = 0;
        name = name.toLowerCase();
        for (char c : name.toCharArray()) {
            if (Character.isLetter(c) && !"aeiou".contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }
}
