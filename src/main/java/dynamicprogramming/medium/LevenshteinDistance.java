package dynamicprogramming.medium;

public class LevenshteinDistance {
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
