package graph.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCycleCheckTest {
	@Test
	public void TestCase1() {
		assertTrue(SimpleCycleCheck.hasSingleCycle(new int[] {2, 2, -1}));
	}

	@Test
	public void TestCase2() {
		assertTrue(SimpleCycleCheck.hasSingleCycle(new int[] {2, 2, 2}));
	}

	@Test
	public void TestCase3() {
		assertTrue(SimpleCycleCheck.hasSingleCycle(new int[] {1, 1, 1, 1, 1}));
	}

	@Test
	public void TestCase4() {
		assertTrue(SimpleCycleCheck.hasSingleCycle(new int[] {-1, 2, 2}));
	}

	@Test
	public void TestCase5() {
		assertFalse(SimpleCycleCheck.hasSingleCycle(new int[] {0, 1, 1, 1, 1}));
	}

	@Test
	public void TestCase6() {
		assertFalse(SimpleCycleCheck.hasSingleCycle(new int[] {1, 1, 0, 1, 1}));
	}

	@Test
	public void TestCase7() {
		assertFalse(SimpleCycleCheck.hasSingleCycle(new int[] {1, 1, 1, 1, 2}));
	}

	@Test
	public void TestCase8() {
		assertTrue(
				SimpleCycleCheck.hasSingleCycle(
						new int[] {3, 5, 6, -5, -2, -5, -12, -2, -1, 2, -6, 1, 1, 2, -5, 2}));
	}

	@Test
	public void TestCase9() {
		assertFalse(
				SimpleCycleCheck.hasSingleCycle(
						new int[] {3, 5, 5, -5, -2, -5, -12, -2, -1, 2, -6, 1, 1, 2, -5, 2}));
	}

	@Test
	public void TestCase10() {
		assertTrue(SimpleCycleCheck.hasSingleCycle(new int[] {1, 2, 3, 4, -2, 3, 7, 8, 1}));
	}

	@Test
	public void TestCase11() {
		assertTrue(SimpleCycleCheck.hasSingleCycle(new int[] {1, 2, 3, 4, -2, 3, 7, 8, -8}));
	}

	@Test
	public void TestCase12() {
		assertTrue(SimpleCycleCheck.hasSingleCycle(new int[] {1, 2, 3, 4, -2, 3, 7, 8, -26}));
	}

	@Test
	public void TestCase13() {
		assertTrue(SimpleCycleCheck.hasSingleCycle(new int[] {10, 11, -6, -23, -2, 3, 88, 908, -26}));
	}

	@Test
	public void TestCase14() {
		assertFalse(SimpleCycleCheck.hasSingleCycle(new int[] {10, 11, -6, -23, -2, 3, 88, 909, -26}));
	}

	@Test
	public void TestCase15() {
		assertTrue(SimpleCycleCheck.hasSingleCycle(new int[] {2, 3, 1, -4, -4, 2}));
	}

	@Test
	public void TestCase16() {
		assertFalse(SimpleCycleCheck.hasSingleCycle(new int[] {1, -1, 1, -1}));
	}
}