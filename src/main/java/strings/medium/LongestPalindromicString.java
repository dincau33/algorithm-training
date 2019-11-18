package strings.medium;

import java.util.NoSuchElementException;

/*
 * Write a function that, given a string, returns its longest palindromic substring.
 * A palindrome is defined as a string that is written the same forward and backward.
 * Assume that there will only be one longest palindromic substring
 */
public class LongestPalindromicString {

    // Complexity: O(n^2) time | O(1) space
    public static String longestPalindromicSubstring(String str) {
        return longestPalindromicSubstringHelper(str);
    }

    private static String longestPalindromicSubstringHelper(String str) {
        String longestStr = "";
        for (int startIdx = 0; startIdx < str.length(); startIdx++) {
            for (int endIdx = startIdx; endIdx < str.length(); endIdx++) {
                if (isPalindromic(str, startIdx, endIdx)) {
                    if ((endIdx - startIdx + 1) > longestStr.length()) longestStr = str.substring(startIdx, endIdx + 1);
                }
            }
        }
        return longestStr;
    }

    // Complexity: O(n) time | O(1) space
    public static boolean isPalindromic(String str, int startIdx, int endIdx) {
        if (startIdx < 0 || endIdx >= str.length()) throw new NoSuchElementException();
        int mid = (endIdx - startIdx + 1) / 2;
        int i = 0;
        while (i < mid) {
            if (str.charAt(startIdx + i) != str.charAt(endIdx - i)) return false;
            i++;
        }
        return true;
    }

}
