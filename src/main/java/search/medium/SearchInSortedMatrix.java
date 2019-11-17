package search.medium;

/*
 * You are given a two-dimensional array (matrix) of distinct integers where each row is sorted and each column is also sorted
 * The Matrix does not necessarily have the same height and width.
 * You are also given a target number, and you must write a function that return and array of the row and column indices of the target number if it is contained in matrix and [-1, -1] if it is not contained in the matrix.
 */
public class SearchInSortedMatrix {
    // Complexity: O(n + m) time | O(1) space
    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int[] targetIndices = new int[]{-1, -1};
        int row = 0;
        int col = matrix[row].length - 1;

        while (col >= 0 && row < matrix.length) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            else if (matrix[row][col] < target) row++;
            else col--;
        }

        return targetIndices;
    }
}
