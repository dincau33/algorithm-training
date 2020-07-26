package arrays.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a function that takes in an n * m two-dimensional array (that can be square-shaped when n == m) and returns a onw-dimensional array of all the array's elements in spiral order.
 * Spiral order starts at the top left corner of the two-dimensional array, goes to the right, and proceeds in a spiral pattern all the way until every element has been visited.
 */
public class SpiralTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        if (array.length == 0) return new ArrayList<Integer>();
        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;

        List<Integer> output = new ArrayList<>();

        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col <= endCol; col++) output.add(array[startRow][col]);
            startRow++;
            for (int row = startRow; row <= endRow; row++) output.add(array[row][endCol]);
            endCol--;
            for (int col = endCol; col >= startCol && startRow <= endRow; col--) output.add(array[endRow][col]);
            endRow--;
            for (int row = endRow; row >= startRow && startCol <= endCol; row--) output.add(array[row][startCol]);
            startCol++;
        }

        return output;
    }
}
