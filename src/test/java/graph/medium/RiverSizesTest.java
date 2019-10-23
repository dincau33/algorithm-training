package graph.medium;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RiverSizesTest {
	@Test
	public void TestCase1() {
		int[][] input = {{0}};
		int[] expected = {};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase2() {
		int[][] input = {{1}};
		int[] expected = {1};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase3() {
		int[][] input = {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0}};
		int[] expected = {1, 2, 3};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase4() {
		int[][] input = {
				{1, 0, 0, 1},
				{1, 0, 1, 0},
				{0, 0, 1, 0},
				{1, 0, 1, 0},
		};
		int[] expected = {1, 1, 2, 3};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase5() {
		int[][] input = {
				{1, 0, 0, 1, 0},
				{1, 0, 1, 0, 0},
				{0, 0, 1, 0, 1},
				{1, 0, 1, 0, 1},
				{1, 0, 1, 1, 0},
		};
		int[] expected = {1, 2, 2, 2, 5};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase6() {
		int[][] input = {
				{1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0},
				{1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0},
				{0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1},
				{1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0},
				{1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1},
		};
		int[] expected = {1, 1, 2, 2, 5, 21};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase7() {
		int[][] input = {
				{1, 0, 0, 0, 0, 0, 1},
				{0, 1, 0, 0, 0, 1, 0},
				{0, 0, 1, 0, 1, 0, 0},
				{0, 0, 0, 1, 0, 0, 0},
				{0, 0, 1, 0, 1, 0, 0},
				{0, 1, 0, 0, 0, 1, 0},
				{1, 0, 0, 0, 0, 0, 1},
		};
		int[] expected = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase8() {
		int[][] input = {
				{1, 0, 0, 0, 0, 0, 1},
				{0, 1, 0, 0, 0, 1, 0},
				{0, 0, 1, 0, 1, 0, 0},
				{0, 0, 1, 1, 1, 0, 0},
				{0, 0, 1, 0, 1, 0, 0},
				{0, 1, 0, 0, 0, 1, 0},
				{1, 0, 0, 0, 0, 0, 1},
		};
		int[] expected = {1, 1, 1, 1, 1, 1, 1, 1, 7};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase9() {
		int[][] input = {
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
		};
		int[] expected = {};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase10() {
		int[][] input = {
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1},
		};
		int[] expected = {49};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase11() {
		int[][] input = {
				{1, 1, 0, 0, 0, 0, 1, 1},
				{1, 0, 1, 1, 1, 1, 0, 1},
				{0, 1, 1, 0, 0, 0, 1, 1},
		};
		int[] expected = {3, 5, 6};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	@Test
	public void TestCase12() {
		int[][] input = {
				{1, 1, 0},
				{1, 0, 1},
				{1, 1, 1},
				{1, 1, 0},
				{1, 0, 1},
				{0, 1, 0},
				{1, 0, 0},
				{1, 0, 0},
				{0, 0, 0},
				{1, 0, 0},
				{1, 0, 1},
				{1, 1, 1},
		};
		int[] expected = {1, 1, 2, 6, 10};
		ArrayList<Integer> output = RiverSizes.riverSizes(input);
		Collections.sort(output);
		assertTrue(compare(output, expected));
	}

	public static boolean compare(ArrayList<Integer> arr1, int[] arr2) {
		if (arr1.size() != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.size(); i++) {
			if (arr1.get(i) != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}