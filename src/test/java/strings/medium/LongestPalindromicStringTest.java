package strings.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicStringTest {
    @Test
    public void TestCase1() {
        assertTrue(LongestPalindromicString.longestPalindromicSubstring("aba").equals("aba"));
    }

    @Test
    public void TestCase2() {
        assertTrue(LongestPalindromicString.longestPalindromicSubstring("it's highnoon").equals("noon"));
    }

    @Test
    public void TestCase3() {
        assertTrue(LongestPalindromicString.longestPalindromicSubstring("noon high it is").equals("noon"));
    }

    @Test
    public void TestCase4() {
        assertTrue(LongestPalindromicString.longestPalindromicSubstring("abccbait's highnoon").equals("abccba"));
    }

    @Test
    public void TestCase5() {
        assertTrue(LongestPalindromicString.longestPalindromicSubstring("abaxyzzyxf").equals("xyzzyx"));
    }

    @Test
    public void TestCase6() {
        assertTrue(
                LongestPalindromicString.longestPalindromicSubstring("abcdefgfedcbazzzzzzzzzzzzzzzzzzzz")
                        .equals("zzzzzzzzzzzzzzzzzzzz"));
    }

    @Test
    public void TestCase7() {
        assertTrue(LongestPalindromicString.longestPalindromicSubstring("abcdefgfedcba").equals("abcdefgfedcba"));
    }

    @Test
    public void TestCase8() {
        assertTrue(LongestPalindromicString.longestPalindromicSubstring("abcdefghfedcbaa").equals("aa"));
    }

    @Test
    public void TestCase9() {
        assertTrue(
                LongestPalindromicString.longestPalindromicSubstring("abcdefggfedcba").equals("abcdefggfedcba"));
    }

    @Test
    public void TestCase10() {
        assertTrue(
                LongestPalindromicString.longestPalindromicSubstring("zzzzzzz2345abbbba5432zzbbababa")
                        .equals("zz2345abbbba5432zz"));
    }

    @Test
    public void TestCase11() {
        assertTrue(LongestPalindromicString.longestPalindromicSubstring("z234a5abbbba54a32z").equals("5abbbba5"));
    }

    @Test
    public void TestCase12() {
        assertTrue(LongestPalindromicString.longestPalindromicSubstring("z234a5abbba54a32z").equals("5abbba5"));
    }

    @Test
    public void testIsPalindromic1() {
        assertTrue(LongestPalindromicString.isPalindromic("a", 0, 0));
        assertTrue(LongestPalindromicString.isPalindromic("aa", 0, 1));
        assertTrue(LongestPalindromicString.isPalindromic("aaa", 0, 2));
        assertTrue(LongestPalindromicString.isPalindromic("aba", 0, 2));
        assertFalse(LongestPalindromicString.isPalindromic("aba", 0, 1));
        assertFalse(LongestPalindromicString.isPalindromic("aba", 1, 2));
        assertFalse(LongestPalindromicString.isPalindromic("ab", 0, 1));
        assertTrue(LongestPalindromicString.isPalindromic("5abbba5", 0, 6));
        assertTrue(LongestPalindromicString.isPalindromic("zz2345abbbba5432zz", 0, 17));
        assertTrue(LongestPalindromicString.isPalindromic("zzzzzzzzzzzzzzzzzzzz", 0, 19));
        assertTrue(LongestPalindromicString.isPalindromic("abaxyzzyxf", 3, 8));
        assertFalse(LongestPalindromicString.isPalindromic("abaxyzzyxf", 2, 9));
    }
}