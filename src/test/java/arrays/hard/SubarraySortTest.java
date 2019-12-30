package arrays.hard;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubarraySortTest {

	@Test
	public void TestCase1() {
		int[] expected = {-1, -1};
		assertTrue(Arrays.equals(SubarraySort.subarraySort(new int[] {1, 2}), expected));
	}

	@Test
	public void TestCase2() {
		int[] expected = {0, 1};
		assertTrue(Arrays.equals(SubarraySort.subarraySort(new int[] {2, 1}), expected));
	}

	@Test
	public void TestCase3() {
		int[] expected = {3, 9};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(new int[] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}),
						expected));
	}

	@Test
	public void TestCase4() {
		int[] expected = {4, 9};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(new int[] {1, 2, 4, 7, 10, 11, 7, 12, 7, 7, 16, 18, 19}),
						expected));
	}

	@Test
	public void TestCase5() {
		int[] expected = {4, 6};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(new int[] {1, 2, 4, 7, 10, 11, 7, 12, 13, 14, 16, 18, 19}),
						expected));
	}

	@Test
	public void TestCase6() {
		int[] expected = {2, 4};
		assertTrue(Arrays.equals(SubarraySort.subarraySort(new int[] {1, 2, 8, 4, 5}), expected));
	}

	@Test
	public void TestCase7() {
		int[] expected = {0, 12};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(new int[] {4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7}),
						expected));
	}

	@Test
	public void TestCase8() {
		int[] expected = {0, 11};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(new int[] {4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57}),
						expected));
	}

	@Test
	public void TestCase9() {
		int[] expected = {1, 11};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(new int[] {-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57}),
						expected));
	}

	@Test
	public void TestCase10() {
		int[] expected = {1, 12};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(new int[] {-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7}),
						expected));
	}

	@Test
	public void TestCase11() {
		int[] expected = {6, 7};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(new int[] {1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11}), expected));
	}

	@Test
	public void TestCase12() {
		int[] expected = {6, 16};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(
								new int[] {1, 2, 3, 4, 5, 6, 18, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19}),
						expected));
	}

	@Test
	public void TestCase13() {
		int[] expected = {4, 24};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(
								new int[] {
										1, 2, 3, 4, 5, 6, 18, 21, 22, 7, 14, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 4, 14,
										11, 6, 33, 35, 41, 55
								}),
						expected));
	}

	@Test
	public void TestCase14() {
		int[] expected = {2, 19};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(
								new int[] {1, 2, 20, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}),
						expected));
	}

	@Test
	public void TestCase15() {
		int[] expected = {2, 19};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(
								new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2}),
						expected));
	}

	@Test
	public void TestCase16() {
		int[] expected = {-1, -1};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(
								new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}),
						expected));
	}

	@Test
	public void TestCase17() {
		int[] expected = {-1, -1};
		assertTrue(
				Arrays.equals(
						SubarraySort.subarraySort(new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89}), expected));
	}
}