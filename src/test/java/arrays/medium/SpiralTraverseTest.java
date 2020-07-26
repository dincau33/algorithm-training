package arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralTraverseTest {
    private int[] actual;

    @Test
    public void TestCase1() {
        int[][] input =
                new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<Integer> actual = SpiralTraverse.spiralTraverse(input);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestCase2() {
        int[][] input = new int[][] {{}};
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = SpiralTraverse.spiralTraverse(input);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestCase3() {
        int[][] input = new int[][] {{1, 2, 3, 4}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        List<Integer> actual = SpiralTraverse.spiralTraverse(input);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestCase4() {
        int[][] input = new int[][] {{1}, {2}, {3}, {4}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        List<Integer> actual = SpiralTraverse.spiralTraverse(input);
        assertTrue(expected.equals(actual));
    }
}
