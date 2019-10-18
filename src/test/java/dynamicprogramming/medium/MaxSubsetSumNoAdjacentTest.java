package dynamicprogramming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxSubsetSumNoAdjacentTest {
	@Test
	public void TestCase1() {
		int[] input = {};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 0);
	}

	@Test
	public void TestCase2() {
		int[] input = {1};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 1);
	}

	@Test
	public void TestCase3() {
		int[] input = {1, 2};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 2);
	}

	@Test
	public void TestCase4() {
		int[] input = {1, 2, 3};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 4);
	}

	@Test
	public void TestCase5() {
		int[] input = {1, 15, 3};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 15);
	}

	@Test
	public void TestCase6() {
		int[] input = {7, 10, 12, 7, 9, 14};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 33);
	}

	@Test
	public void TestCase7() {
		int[] input = {4, 3, 5, 200, 5, 3};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 207);
	}

	@Test
	public void TestCase8() {
		int[] input = {10, 5, 20, 25, 15, 5, 5, 15};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 60);
	}

	@Test
	public void TestCase9() {
		int[] input = {10, 5, 20, 25, 15, 5, 5, 15, 3, 15, 5, 5, 15};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 90);
	}

	@Test
	public void TestCase10() {
		int[] input = {125, 21, 250, 120, 150, 300};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 675);
	}

	@Test
	public void TestCase11() {
		int[] input = {30, 25, 50, 55, 100};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 180);
	}

	@Test
	public void TestCase12() {
		int[] input = {30, 25, 50, 55, 100, 120};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 205);
	}

	@Test
	public void TestCase13() {
		int[] input = {7, 10, 12, 7, 9, 14, 15, 16, 25, 20, 4};
		assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 72);
	}
}