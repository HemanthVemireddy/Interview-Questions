package InterviewQues;
import java.util.HashSet;
        import java.util.Set;

public class LongestSubstring {

    public static String findLongestSubstring(String s) {
        int n = s.length();
        int start = 0, end = 0;
        int maxLength = 0;
        String longestSubstring = "";

        Set<Character> charSet = new HashSet<>();

        while (end < n) {
            if (!charSet.contains(s.charAt(end))) {
                charSet.add(s.charAt(end));
                end++;

                if (end - start > maxLength) {
                    maxLength = end - start;
                    longestSubstring = s.substring(start, end);
                }
            } else {
                charSet.remove(s.charAt(start));
                start++;
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        String example1 = "aab";
        String example2 = "pwwkew";
        String example3 = "abcbcabcda";

        System.out.println("Example 1: " + findLongestSubstring(example1));
        System.out.println("Example 2: " + findLongestSubstring(example2));
        System.out.println("Example 3: " + findLongestSubstring(example3));
    }
}
