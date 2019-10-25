package dynamicprogramming.medium;

/*
 * Write a function that takes in two strings and returns the minimum number of edit operations that need to be performed on the first string to obtain the second string. There are three edit operations: insertion of a character, deletion of a character, and substitution of a character for another.
 */
public class LevenshteinDistance {
    // O(m*n) time | O(m*n) space
    public static int levenshteinDistance(String str1, String str2) {
        int[][] mins = new int[str1.length() + 1][str2.length() + 1];
        for (int r = 0; r <= str1.length(); r++) {
            for (int c = 0; c <= str2.length(); c++) {
                mins[r][c] = c;
            }
            mins[r][0] = r;
        }
        for (int r = 1; r <= str1.length(); r++) {
            for (int c = 1; c <= str2.length(); c++) {
                if (str1.charAt(r - 1) == str2.charAt(c - 1)) mins[r][c] = mins[r - 1][c - 1];
                else mins[r][c] = 1 + Math.min(mins[r - 1][c - 1], Math.min(mins[r][c - 1], mins[r - 1][c]));
            }
        }
        return mins[str1.length()][str2.length()];
    }
}
