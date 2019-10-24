package search.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    public void TestCase1() {
        assertTrue(BinarySearch.binarySearch(new int[] {1, 5, 23, 111}, 111) == 3);
    }

    @Test
    public void TestCase2() {
        assertTrue(BinarySearch.binarySearch(new int[] {1, 5, 23, 111}, 5) == 1);
    }

    @Test
    public void TestCase3() {
        assertTrue(BinarySearch.binarySearch(new int[] {1, 5, 23, 111}, 35) == -1);
    }

    @Test
    public void TestCase4() {
        assertTrue(
                BinarySearch.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33) == 3);
    }

    @Test
    public void TestCase5() {
        assertTrue(
                BinarySearch.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 72) == 8);
    }

    @Test
    public void TestCase6() {
        assertTrue(
                BinarySearch.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 73) == 9);
    }

    @Test
    public void TestCase7() {
        assertTrue(
                BinarySearch.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 70) == -1);
    }

    @Test
    public void TestCase8() {
        assertTrue(
                BinarySearch.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73, 355}, 355) == 10);
    }

    @Test
    public void TestCase9() {
        assertTrue(
                BinarySearch.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73, 355}, 354) == -1);
    }
}