package recursion.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NthFibonacciTest {
	@Test
	public void TestCase1() {
		assertTrue(NthFibonacci.getNthFibBottomUp(1) == 0);
	}

	@Test
	public void TestCase2() {
		assertTrue(NthFibonacci.getNthFibBottomUp(2) == 1);
	}

	@Test
	public void TestCase3() {
		assertTrue(NthFibonacci.getNthFibBottomUp(3) == 1);
	}

	@Test
	public void TestCase4() {
		assertTrue(NthFibonacci.getNthFibBottomUp(4) == 2);
	}

	@Test
	public void TestCase5() {
		assertTrue(NthFibonacci.getNthFibBottomUp(5) == 3);
	}

	@Test
	public void TestCase6() {
		assertTrue(NthFibonacci.getNthFibBottomUp(6) == 5);
	}

	@Test
	public void TestCase7() {
		assertTrue(NthFibonacci.getNthFibBottomUp(7) == 8);
	}

	@Test
	public void TestCase8() {
		assertTrue(NthFibonacci.getNthFibBottomUp(8) == 13);
	}

	@Test
	public void TestCase9() {
		assertTrue(NthFibonacci.getNthFibBottomUp(9) == 21);
	}

	@Test
	public void TestCase10() {
		assertTrue(NthFibonacci.getNthFibBottomUp(10) == 34);
	}

	@Test
	public void TestCase11() {
		assertTrue(NthFibonacci.getNthFibBottomUp(11) == 55);
	}

	@Test
	public void TestCase12() {
		assertTrue(NthFibonacci.getNthFibBottomUp(12) == 89);
	}

	@Test
	public void TestCase13() {
		assertTrue(NthFibonacci.getNthFibBottomUp(13) == 144);
	}

	@Test
	public void TestCase14() {
		assertTrue(NthFibonacci.getNthFibBottomUp(14) == 233);
	}

	@Test
	public void TestCase15() {
		assertTrue(NthFibonacci.getNthFibBottomUp(15) == 377);
	}

	@Test
	public void TestCase16() {
		assertTrue(NthFibonacci.getNthFibBottomUp(16) == 610);
	}

	@Test
	public void TestCase17() {
		assertTrue(NthFibonacci.getNthFibBottomUp(17) == 987);
	}

	@Test
	public void TestCase18() {
		assertTrue(NthFibonacci.getNthFibBottomUp(18) == 1597);
	}

}