package recursion.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NthFibonacciTest {
	@Test
	public void TestCase1() {
		assertTrue(NthFibonacci.getNthFib(1) == 0);
	}

	@Test
	public void TestCase2() {
		assertTrue(NthFibonacci.getNthFib(2) == 1);
	}

	@Test
	public void TestCase3() {
		assertTrue(NthFibonacci.getNthFib(3) == 1);
	}

	@Test
	public void TestCase4() {
		assertTrue(NthFibonacci.getNthFib(4) == 2);
	}

	@Test
	public void TestCase5() {
		assertTrue(NthFibonacci.getNthFib(5) == 3);
	}

	@Test
	public void TestCase6() {
		assertTrue(NthFibonacci.getNthFib(6) == 5);
	}

	@Test
	public void TestCase7() {
		assertTrue(NthFibonacci.getNthFib(7) == 8);
	}

	@Test
	public void TestCase8() {
		assertTrue(NthFibonacci.getNthFib(8) == 13);
	}

	@Test
	public void TestCase9() {
		assertTrue(NthFibonacci.getNthFib(9) == 21);
	}

	@Test
	public void TestCase10() {
		assertTrue(NthFibonacci.getNthFib(10) == 34);
	}

	@Test
	public void TestCase11() {
		assertTrue(NthFibonacci.getNthFib(11) == 55);
	}

	@Test
	public void TestCase12() {
		assertTrue(NthFibonacci.getNthFib(12) == 89);
	}

	@Test
	public void TestCase13() {
		assertTrue(NthFibonacci.getNthFib(13) == 144);
	}

	@Test
	public void TestCase14() {
		assertTrue(NthFibonacci.getNthFib(14) == 233);
	}

	@Test
	public void TestCase15() {
		assertTrue(NthFibonacci.getNthFib(15) == 377);
	}

	@Test
	public void TestCase16() {
		assertTrue(NthFibonacci.getNthFib(16) == 610);
	}

	@Test
	public void TestCase17() {
		assertTrue(NthFibonacci.getNthFib(17) == 987);
	}

	@Test
	public void TestCase18() {
		assertTrue(NthFibonacci.getNthFib(18) == 1597);
	}

}