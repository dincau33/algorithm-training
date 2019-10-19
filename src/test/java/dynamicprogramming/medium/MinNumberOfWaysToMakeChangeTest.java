package dynamicprogramming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinNumberOfWaysToMakeChangeTest {
	@Test
	public void TestCase1() {
		int[] input = {1, 2, 3};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(0, input) == 0);
	}

	@Test
	public void TestCase2() {
		int[] input = {2, 1};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(3, input) == 2);
	}

	@Test
	public void TestCase3() {
		int[] input = {1, 5, 10};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(4, input) == 4);
	}

	@Test
	public void TestCase4() {
		int[] input = {1, 5, 10};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(7, input) == 3);
	}

	@Test
	public void TestCase5() {
		int[] input = {1, 5, 10};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(10, input) == 1);
	}

	@Test
	public void TestCase6() {
		int[] input = {1, 5, 10};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(11, input) == 2);
	}

	@Test
	public void TestCase7() {
		int[] input = {1, 5, 10};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(24, input) == 6);
	}

	@Test
	public void TestCase8() {
		int[] input = {1, 5, 10};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(25, input) == 3);
	}

	@Test
	public void TestCase9() {
		int[] input = {2, 4};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(7, input) == -1);
	}

	@Test
	public void TestCase10() {
		int[] input = {3, 7};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(7, input) == 1);
	}

	@Test
	public void TestCase11() {
		int[] input = {3, 5};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(9, input) == 3);
	}

	@Test
	public void TestCase12() {
		int[] input = {3, 4, 5};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(9, input) == 2);
	}

	@Test
	public void TestCase13() {
		int[] input = {39, 45, 130, 40, 4, 1};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(135, input) == 3);
	}

	@Test
	public void TestCase14() {
		int[] input = {39, 45, 130, 40, 4, 1, 60, 75};
		assertTrue(MinNumberOfWaysToMakeChange.minNumberOfCoinsForChange(135, input) == 2);
	}
}