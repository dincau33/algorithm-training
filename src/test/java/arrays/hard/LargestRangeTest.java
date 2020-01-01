package arrays.hard;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestRangeTest {

    @Test
    public void TestCase1() {
        int[] expected = {1, 1};
        assertTrue(Arrays.equals(LargestRange.largestRange(new int[] {1}), expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {1, 2};
        assertTrue(Arrays.equals(LargestRange.largestRange(new int[] {1, 2}), expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {1, 4};
        assertTrue(Arrays.equals(LargestRange.largestRange(new int[] {4, 2, 1, 3}), expected));
    }

    @Test
    public void TestCase4() {
        int[] expected = {1, 4};
        assertTrue(Arrays.equals(LargestRange.largestRange(new int[] {4, 2, 1, 3, 6}), expected));
    }

    @Test
    public void TestCase5() {
        int[] expected = {6, 10};
        assertTrue(
                Arrays.equals(LargestRange.largestRange(new int[] {8, 4, 2, 10, 3, 6, 7, 9, 1}), expected));
    }

    @Test
    public void TestCase6() {
        int[] expected = {0, 7};
        assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}), expected));
    }

    @Test
    public void TestCase7() {
        int[] expected = {10, 19};
        assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(
                                new int[] {
                                        19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14
                                }),
                        expected));
    }

    @Test
    public void TestCase8() {
        int[] expected = {-1, 19};
        assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(
                                new int[] {
                                        0, 9, 19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6,
                                        13, 14
                                }),
                        expected));
    }

    @Test
    public void TestCase9() {
        int[] expected = {-7, 7};
        assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(
                                new int[] {
                                        0, -5, 9, 19, -1, 18, 17, 2, -4, -3, 10, 3, 12, 5, 16, 4, 11, 7, -6, -7, 6, 15,
                                        12, 12, 2, 1, 6, 13, 14, -2
                                }),
                        expected));
    }

    @Test
    public void TestCase10() {
        int[] expected = {-7, 7};
        assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(
                                new int[] {
                                        0, -5, 9, 19, -1, 18, 17, 2, -4, -3, 10, 3, 12, 5, 16, 4, 11, 7, -6, -7, 6, 15,
                                        12, 12, 2, 1, 6, 13, 14, -2
                                }),
                        expected));
    }

    @Test
    public void TestCase11() {
        int[] expected = {-8, 19};
        assertTrue(
                Arrays.equals(
                        LargestRange.largestRange(
                                new int[] {
                                        -7, -7, -7, -7, 8, -8, 0, 9, 19, -1, -3, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, -6,
                                        8, 7, 6, 15, 12, 12, -5, 2, 1, 6, 13, 14, -4, -2
                                }),
                        expected));
    }
}