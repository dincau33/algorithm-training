package dynamicprogramming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LevenshteinDistanceTest {
	@Test
	public void TestCase1() {
		assertTrue(LevenshteinDistance.levenshteinDistance("", "") == 0);
	}

	@Test
	public void TestCase2() {
		assertTrue(LevenshteinDistance.levenshteinDistance("", "abc") == 3);
	}

	@Test
	public void TestCase3() {
		assertTrue(LevenshteinDistance.levenshteinDistance("abc", "abc") == 0);
	}

	@Test
	public void TestCase4() {
		assertTrue(LevenshteinDistance.levenshteinDistance("abc", "abx") == 1);
	}

	@Test
	public void TestCase5() {
		assertTrue(LevenshteinDistance.levenshteinDistance("abc", "abcx") == 1);
	}

	@Test
	public void TestCase6() {
		assertTrue(LevenshteinDistance.levenshteinDistance("abc", "yabcx") == 2);
	}

	@Test
	public void TestCase7() {
		assertTrue(LevenshteinDistance.levenshteinDistance("algoexpert", "algozexpert") == 1);
	}

	@Test
	public void TestCase8() {
		assertTrue(LevenshteinDistance.levenshteinDistance("abcdefghij", "1234567890") == 10);
	}

	@Test
	public void TestCase9() {
		assertTrue(LevenshteinDistance.levenshteinDistance("abcdefghij", "a234567890") == 9);
	}

	@Test
	public void TestCase10() {
		assertTrue(LevenshteinDistance.levenshteinDistance("biting", "mitten") == 4);
	}

	@Test
	public void TestCase11() {
		assertTrue(LevenshteinDistance.levenshteinDistance("cereal", "saturday") == 6);
	}

	@Test
	public void TestCase12() {
		assertTrue(LevenshteinDistance.levenshteinDistance("cereal", "saturdzz") == 7);
	}

	@Test
	public void TestCase13() {
		assertTrue(LevenshteinDistance.levenshteinDistance("abbbbbbbbb", "bbbbbbbbba") == 2);
	}

	@Test
	public void TestCase14() {
		assertTrue(LevenshteinDistance.levenshteinDistance("abc", "yabd") == 2);
	}

	@Test
	public void TestCase15() {
		assertTrue(LevenshteinDistance.levenshteinDistance("xabc", "abcx") == 2);
	}
}