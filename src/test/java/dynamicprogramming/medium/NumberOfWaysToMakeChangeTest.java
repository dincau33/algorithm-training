package dynamicprogramming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfWaysToMakeChangeTest {
	@Test
	public void TestCase1() {
		int[] input = {2, 3, 4, 7};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(0, input) == 1);
	}

	@Test
	public void TestCase2() {
		int[] input = {5};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(9, input) == 0);
	}

	@Test
	public void TestCase3() {
		int[] input = {2, 4};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(7, input) == 0);
	}

	@Test
	public void TestCase4() {
		int[] input = {1, 5};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(6, input) == 2);
	}

	@Test
	public void TestCase5() {
		int[] input = {1, 5, 10, 25};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(4, input) == 1);
	}

	@Test
	public void TestCase6() {
		int[] input = {1, 5, 10, 25};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(5, input) == 2);
	}

	@Test
	public void TestCase7() {
		int[] input = {1, 5, 10, 25};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(10, input) == 4);
	}

	@Test
	public void TestCase8() {
		int[] input = {1, 5, 10, 25};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(25, input) == 13);
	}

	@Test
	public void TestCase9() {
		int[] input = {2, 3, 7};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(12, input) == 4);
	}

	@Test
	public void TestCase10() {
		int[] input = {2, 3, 4, 7};
		assertTrue(NumberOfWaysToMakeChange.numberOfWaysToMakeChange(7, input) == 3);
	}
}