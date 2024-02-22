package InterviewQues;
public class convertToLowercase {

    public static String convertToLowercase(String input) {
        // Check if the input string is not null
        if (input == null) {
            return null;
        }

        // Convert each character to lowercase manually
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // Check if the character is an uppercase letter
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Convert to lowercase by adding the ASCII offset
                chars[i] = (char) (chars[i] + ('a' - 'A'));
            }
        }

        // Create a new string from the modified character array
        return new String(chars);
    }

    public static void main(String[] args) {
        // Example usage
        String originalText = "Hello World";
        String lowercaseText = convertToLowercase(originalText);

        System.out.println("Original Text: " + originalText);
        System.out.println("Lowercase Text: " + lowercaseText);
    }
}

