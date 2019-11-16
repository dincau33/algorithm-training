package search.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInSortedMatrixTest {
    public int[][] matrix = {
            {1, 4, 7, 12, 15, 1000},
            {2, 5, 19, 31, 32, 1001},
            {3, 8, 24, 33, 35, 1002},
            {40, 41, 42, 44, 45, 1003},
            {99, 100, 103, 106, 128, 1004},
    };

    @Test
    public void TestCase1() {
        int[] expected = {0, 0};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 1);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {1, 0};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 2);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {0, 1};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 4);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase4() {
        int[] expected = {0, 4};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 15);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase5() {
        int[] expected = {0, 3};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 12);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase6() {
        int[] expected = {1, 4};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 32);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase7() {
        int[] expected = {4, 0};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 99);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase8() {
        int[] expected = {4, 1};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 100);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase9() {
        int[] expected = {3, 0};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 40);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase10() {
        int[] expected = {4, 4};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 128);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase11() {
        int[] expected = {4, 3};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 106);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase12() {
        int[] expected = {3, 4};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 45);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase13() {
        int[] expected = {2, 2};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 24);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase14() {
        int[] expected = {3, 3};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 44);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase15() {
        int[] expected = {-1, -1};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 43);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase16() {
        int[] expected = {-1, -1};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, -1);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase17() {
        int[] expected = {0, 5};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 1000);
        assertTrue(compare(output, expected));
    }

    @Test
    public void TestCase18() {
        int[] expected = {4, 5};
        int[] output = SearchInSortedMatrix.searchInSortedMatrix(matrix, 1004);
        assertTrue(compare(output, expected));
    }

    public boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}