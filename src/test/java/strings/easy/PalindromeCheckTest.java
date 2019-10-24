package strings.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {
    @Test
    public void TestCase1() {
        assertTrue(PalindromeCheck.isPalindrome("a"));
    }

    @Test
    public void TestCase2() {
        assertTrue(!PalindromeCheck.isPalindrome("ab"));
    }

    @Test
    public void TestCase3() {
        assertTrue(PalindromeCheck.isPalindrome("aba"));
    }

    @Test
    public void TestCase4() {
        assertTrue(!PalindromeCheck.isPalindrome("abb"));
    }

    @Test
    public void TestCase5() {
        assertTrue(PalindromeCheck.isPalindrome("abba"));
    }

    @Test
    public void TestCase6() {
        assertTrue(PalindromeCheck.isPalindrome("abcdcba"));
    }

    @Test
    public void TestCase7() {
        assertTrue(PalindromeCheck.isPalindrome("abcdefghhgfedcba"));
    }

    @Test
    public void TestCase8() {
        assertTrue(PalindromeCheck.isPalindrome("abcdefghihgfedcba"));
    }

    @Test
    public void TestCase9() {
        assertTrue(!PalindromeCheck.isPalindrome("abcdefghihgfeddcba"));
    }
}