package Sumit_Interview_Topics.Strings;

public class Program4 {
    public static void main(String[] args) {
        String s = "occurrences";
        StringBuilder result = new StringBuilder();

        while (s.length() > 0) { // Check the updated length of the string
            char currentChar = s.charAt(0);
            int count = 0;

            // Count occurrences of the current character
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == currentChar) {
                    count++;
                }
            }

            result.append(currentChar).append(count);

            // Remove all occurrences of the current character
            s = s.replace(String.valueOf(currentChar), "");

        }

        System.out.println(result);
    }
}
