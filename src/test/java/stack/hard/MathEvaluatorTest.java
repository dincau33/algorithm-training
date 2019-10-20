package stack.hard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathEvaluatorTest {
	@Test
	public void testAddition() {
		assertEquals(new MathEvaluator().calculate("1+1"), 2d, 0.01);
	}

	@Test
	public void testSubtraction1() {
		assertEquals(new MathEvaluator().calculate("1 - 1"), 0d, 0.01);
	}

	@Test
	public void testSubtraction2() {
		assertEquals(new MathEvaluator().calculate("(1) - (1)"), 0d, 0.01);
	}

	@Test
	public void testSubtraction3() {
		assertEquals(new MathEvaluator().calculate("(1) - 1"), 0d, 0.01);
	}

	@Test
	public void testMultiplication() {
		assertEquals(new MathEvaluator().calculate("1* 1"), 1d, 0.01);
	}

	@Test
	public void testDivision() {
		assertEquals(new MathEvaluator().calculate("1 /1"), 1d, 0.01);
	}

	@Test
	public void testNegative1() {
		assertEquals(new MathEvaluator().calculate("-123"), -123d, 0.01);
	}

	@Test
	public void testNegative2() {
		assertEquals(new MathEvaluator().calculate("-(123)"), -123d, 0.01);
	}

	@Test
	public void testNegative3() {
		assertEquals(new MathEvaluator().calculate("-(4 - 123)"), 119d, 0.01);
	}

	@Test
	public void testLiteral1() {
		assertEquals(new MathEvaluator().calculate("123"), 123d, 0.01);
	}

	@Test
	public void testLiteral2() {
		assertEquals(new MathEvaluator().calculate("(123)"), 123d, 0.01);
	}

	@Test
	public void testExpression() {
		assertEquals(new MathEvaluator().calculate("2 /2+3 * 4.75- -6"), 21.25, 0.01);
	}

	@Test
	public void testSimple() {
		assertEquals(new MathEvaluator().calculate("12* 123"), 1476d, 0.01);
	}

	@Test
	public void testComplex1() {
		assertEquals(new MathEvaluator().calculate("2 / (2 + 3) * 4.33 - -6"), 7.732, 0.01);
	}

	@Test
	public void testComplex2() {
		assertEquals(new MathEvaluator().calculate("-(2 + 60) / (2 + 3) * 4.33 - -6"), -47.692, 0.01);
	}

	@Test
	public void testComplex3() {
		assertEquals(new MathEvaluator().calculate("-(2 + 60) / -(2 + 3) * 4.33 - -6"), 59.692, 0.01);
	}

	@Test
	public void testDoubleParenthesis1() {
		assertEquals(new MathEvaluator().calculate("((2))"), 2, 0.01);
	}

	@Test
	public void testDoubleParenthesis2() {
		assertEquals(new MathEvaluator().calculate("((2 + -3))"), -1, 0.01);
	}

	@Test
	public void testDoubleParenthesis3() {
		assertEquals(new MathEvaluator().calculate("6 / (2 * (-3 + 6))"), 1, 0.01);
	}

}