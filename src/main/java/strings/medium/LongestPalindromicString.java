package strings.medium;

/*
 * Write a function that, given a string, returns its longest palindromic substring.
 * A palindrome is defined as a string that is written the same forward and backward.
 * Assume that there will only be one longest palindromic substring
 */
public class LongestPalindromicString {
    // Complexity: O(n^3) time | O(1) space
    public static String longestPalindromicSubstring(String str) {
        String longestStr = "";
        for (int startIdx = 0; startIdx < str.length(); startIdx++) {
            for (int endIdx = startIdx; endIdx < str.length(); endIdx++) {
                String subStr = str.substring(startIdx, endIdx + 1);
                if (subStr.length() > longestStr.length() && isPalindromic(subStr)) longestStr = subStr;
            }
        }
        return longestStr;
    }

    // Complexity: O(n) time | O(1) space
    public static boolean isPalindromic(String str) {
        int mid = str.length() / 2;
        int i = 0;
        while (i < mid) {
            if (str.charAt(i) != str.charAt(str.length() -1 - i)) return false;
            i++;
        }
        return true;
    }
}
