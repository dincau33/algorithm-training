package recursion.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NthFibonacciTest {
	@Test
	public void TestCase1() {
		assertTrue(NthFibonacci.getNthFibMemo(1) == 0);
	}

	@Test
	public void TestCase2() {
		assertTrue(NthFibonacci.getNthFibMemo(2) == 1);
	}

	@Test
	public void TestCase3() {
		assertTrue(NthFibonacci.getNthFibMemo(3) == 1);
	}

	@Test
	public void TestCase4() {
		assertTrue(NthFibonacci.getNthFibMemo(4) == 2);
	}

	@Test
	public void TestCase5() {
		assertTrue(NthFibonacci.getNthFibMemo(5) == 3);
	}

	@Test
	public void TestCase6() {
		assertTrue(NthFibonacci.getNthFibMemo(6) == 5);
	}

	@Test
	public void TestCase7() {
		assertTrue(NthFibonacci.getNthFibMemo(7) == 8);
	}

	@Test
	public void TestCase8() {
		assertTrue(NthFibonacci.getNthFibMemo(8) == 13);
	}

	@Test
	public void TestCase9() {
		assertTrue(NthFibonacci.getNthFibMemo(9) == 21);
	}

	@Test
	public void TestCase10() {
		assertTrue(NthFibonacci.getNthFibMemo(10) == 34);
	}

	@Test
	public void TestCase11() {
		assertTrue(NthFibonacci.getNthFibMemo(11) == 55);
	}

	@Test
	public void TestCase12() {
		assertTrue(NthFibonacci.getNthFibMemo(12) == 89);
	}

	@Test
	public void TestCase13() {
		assertTrue(NthFibonacci.getNthFibMemo(13) == 144);
	}

	@Test
	public void TestCase14() {
		assertTrue(NthFibonacci.getNthFibMemo(14) == 233);
	}

	@Test
	public void TestCase15() {
		assertTrue(NthFibonacci.getNthFibMemo(15) == 377);
	}

	@Test
	public void TestCase16() {
		assertTrue(NthFibonacci.getNthFibMemo(16) == 610);
	}

	@Test
	public void TestCase17() {
		assertTrue(NthFibonacci.getNthFibMemo(17) == 987);
	}

	@Test
	public void TestCase18() {
		assertTrue(NthFibonacci.getNthFibMemo(18) == 1597);
	}

}