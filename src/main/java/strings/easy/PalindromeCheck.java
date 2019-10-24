package strings.easy;

/*
 * Write a function that takes in a non-empty string and that returns a boolean representing whether or not the string is a palindrome. A palindrome is defined as a string that is written the same forward and backward.
 */
public class PalindromeCheck {
    // O(n) time | O(1) space
    public static boolean isPalindrome(String str) {
        int len = str.length();
        String rev = "";
        for (int i=len-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
}
