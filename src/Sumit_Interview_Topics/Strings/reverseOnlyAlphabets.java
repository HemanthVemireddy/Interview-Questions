package Sumit_Interview_Topics.Strings;

public class reverseOnlyAlphabets
{
    /*
    String s = "34test909gda@sdet!23pro"


    Expected o/p: 34tset909adg@teds!23orp
     */
    public static void main(String[] args) {
        String s = "34test909gda@sdet!23pro";
        System.out.println("Actual string is: "+s);
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Skip non-alphabetic characters at the start pointer
            if (!Character.isLetter(charArray[left])) {
                left++;
            }
            // Skip non-alphabetic characters at the end pointer
            else if (!Character.isLetter(charArray[right])) {
                right--;
            }
            // Swap alphabetic characters
            else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                left++;
                right--;
            }
        }

        String result = new String(charArray);
        System.out.println("Reversed String: " + result);
    }

}
