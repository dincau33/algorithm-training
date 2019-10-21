package arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SmallestDifferenceTest {

	@Test
	public void TestCase1() {
		int[] expected = {20, 17};
		assertTrue(
				Arrays.equals(
						SmallestDifference.smallestDifference(
								new int[] {-1, 5, 10, 20, 3}, new int[] {26, 134, 135, 15, 17}),
						expected));
	}

	@Test
	public void TestCase2() {
		int[] expected = {28, 26};
		assertTrue(
				Arrays.equals(
						SmallestDifference.smallestDifference(
								new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}),
						expected));
	}

	@Test
	public void TestCase3() {
		int[] expected = {25, 1005};
		assertTrue(
				Arrays.equals(
						SmallestDifference.smallestDifference(
								new int[] {10, 0, 20, 25}, new int[] {1005, 1006, 1014, 1032, 1031}),
						expected));
	}

	@Test
	public void TestCase4() {
		int[] expected = {25, 1005};
		assertTrue(
				Arrays.equals(
						SmallestDifference.smallestDifference(
								new int[] {10, 0, 20, 25, 2200}, new int[] {1005, 1006, 1014, 1032, 1031}),
						expected));
	}

	@Test
	public void TestCase5() {
		int[] expected = {2000, 1032};
		assertTrue(
				Arrays.equals(
						SmallestDifference.smallestDifference(
								new int[] {10, 0, 20, 25, 2000}, new int[] {1005, 1006, 1014, 1032, 1031}),
						expected));
	}

	@Test
	public void TestCase6() {
		int[] expected = {954, 954};
		assertTrue(
				Arrays.equals(
						SmallestDifference.smallestDifference(
								new int[] {240, 124, 86, 111, 2, 84, 954, 27, 89}, new int[] {1, 3, 954, 19, 8}),
						expected));
	}

	@Test
	public void TestCase7() {
		int[] expected = {20, 21};
		assertTrue(
				Arrays.equals(SmallestDifference.smallestDifference(new int[] {0, 20}, new int[] {21, -2}), expected));
	}

	@Test
	public void TestCase8() {
		int[] expected = {1000, 1014};
		assertTrue(
				Arrays.equals(
						SmallestDifference.smallestDifference(
								new int[] {10, 1000}, new int[] {-1441, -124, -25, 1014, 1500, 660, 410, 245, 530}),
						expected));
	}

	@Test
	public void TestCase9() {
		int[] expected = {-123, -124};
		assertTrue(
				Arrays.equals(
						SmallestDifference.smallestDifference(
								new int[] {10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123},
								new int[] {-1441, -124, -25, 1014, 1500, 660, 410, 245, 530}),
						expected));
	}

	@Test
	public void TestCase10() {
		int[] expected = {530, 530};
		assertTrue(
				Arrays.equals(
						SmallestDifference.smallestDifference(
								new int[] {10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123, 530},
								new int[] {-1441, -124, -25, 1014, 1500, 660, 410, 245, 530}),
						expected));
	}
}