package search.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindThreeLargestNumbersTest {
    @Test
    public void TestCase1() {
        int[] expected = {7, 8, 55};
        assertTrue(compare(FindThreeLargestNumbers.findThreeLargestNumbers(new int[] {55, 7, 8}), expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {11, 43, 55};
        assertTrue(
                compare(FindThreeLargestNumbers.findThreeLargestNumbers(new int[] {55, 43, 11, 3, -3, 10}), expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {11, 43, 55};
        assertTrue(
                compare(FindThreeLargestNumbers.findThreeLargestNumbers(new int[] {7, 8, 3, 11, 43, 55}), expected));
    }

    @Test
    public void TestCase4() {
        int[] expected = {11, 43, 55};
        assertTrue(
                compare(FindThreeLargestNumbers.findThreeLargestNumbers(new int[] {55, 7, 8, 3, 43, 11}), expected));
    }

    @Test
    public void TestCase5() {
        int[] expected = {7, 7, 7};
        assertTrue(
                compare(
                        FindThreeLargestNumbers.findThreeLargestNumbers(new int[] {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7}),
                        expected));
    }

    @Test
    public void TestCase6() {
        int[] expected = {7, 7, 8};
        assertTrue(
                compare(
                        FindThreeLargestNumbers.findThreeLargestNumbers(new int[] {7, 7, 7, 7, 7, 7, 8, 7, 7, 7, 7}),
                        expected));
    }

    @Test
    public void TestCase7() {
        int[] expected = {18, 141, 541};
        assertTrue(
                compare(
                        FindThreeLargestNumbers.findThreeLargestNumbers(new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}),
                        expected));
    }

    @Test
    public void TestCase8() {
        int[] expected = {-2, -1, 7};
        assertTrue(
                compare(
                        FindThreeLargestNumbers.findThreeLargestNumbers(
                                new int[] {-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7}),
                        expected));
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