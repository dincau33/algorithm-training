package stack.hard;

import com.sun.source.tree.ExpressionTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathEvaluatorTest {
	@Test
	public void testLiteralEvaluation() {
		MathEvaluator calculator = new MathEvaluator();
		MathEvaluator.ExpressionTree tree = calculator.new ExpressionTree(3.0);
		assertEquals(3.0, tree.evaluate(), 0.01);
	}

	@Test
	public void testNegativeEvaluation() {
		MathEvaluator calculator = new MathEvaluator();
		MathEvaluator.ExpressionTree tree = calculator.new ExpressionTree(calculator.new SubstractOperator());
		tree.right = calculator.new ExpressionTree(3.0);
		assertEquals(-3.0, tree.evaluate(), 0.01);
	}

	@Test
	public void testAdditionEvaluation() {
		MathEvaluator calculator = new MathEvaluator();
		MathEvaluator.ExpressionTree tree = calculator.new ExpressionTree(calculator.new AddOperator());
		tree.left = calculator.new ExpressionTree(2.8);
		tree.right = calculator.new ExpressionTree(3.0);
		assertEquals(5.8, tree.evaluate(), 0.01);
	}

	@Test
	public void testSubtractionEvaluation() {
		MathEvaluator calculator = new MathEvaluator();
		MathEvaluator.ExpressionTree tree = calculator.new ExpressionTree(calculator.new SubstractOperator());
		tree.left = calculator.new ExpressionTree(2.8);
		tree.right = calculator.new ExpressionTree(3.0);
		assertEquals(-0.2, tree.evaluate(), 0.01);
	}

	@Test
	public void testMultiplyEvaluation() {
		MathEvaluator calculator = new MathEvaluator();
		MathEvaluator.ExpressionTree tree = calculator.new ExpressionTree(calculator.new MultiplyOperator());
		tree.left = calculator.new ExpressionTree(2.3);
		tree.right = calculator.new ExpressionTree(3.0);
		assertEquals(6.9, tree.evaluate(), 0.01);
	}

	@Test
	public void testDivideEvaluation() {
		MathEvaluator calculator = new MathEvaluator();
		MathEvaluator.ExpressionTree tree = calculator.new ExpressionTree(calculator.new DivideOperator());
		tree.left = calculator.new ExpressionTree(7.0);
		tree.right = calculator.new ExpressionTree(2.0);
		assertEquals(3.5, tree.evaluate(), 0.01);
	}
	//"2 /2+3 * 4.75- -6" 21.25

	@Test
	public void testExpressionEvaluation() {
		MathEvaluator calculator = new MathEvaluator();
		MathEvaluator.ExpressionTree tree1 = calculator.new ExpressionTree(calculator.new SubstractOperator());
		tree1.right = calculator.new ExpressionTree(6.0);
		MathEvaluator.ExpressionTree tree3 = calculator.new ExpressionTree(calculator.new MultiplyOperator());
		tree3.left = calculator.new ExpressionTree(3.0);
		tree3.right = calculator.new ExpressionTree(4.75);
		MathEvaluator.ExpressionTree tree2 = calculator.new ExpressionTree(calculator.new SubstractOperator());
		tree2.left = tree3;
		tree2.right = tree1;
		MathEvaluator.ExpressionTree tree4 = calculator.new ExpressionTree(calculator.new DivideOperator());
		tree4.left = calculator.new ExpressionTree(2.0);
		tree4.right = calculator.new ExpressionTree(2.0);
		MathEvaluator.ExpressionTree tree = calculator.new ExpressionTree(calculator.new AddOperator());
		tree.left = tree4;
		tree.right = tree2;
		assertEquals(21.25, tree.evaluate(), 0.01);
	}

	@Test
	public void testAddition() {
		assertEquals(new MathEvaluator().calculate("1+1"), 2d, 0.01);
	}

	@Test
	public void testSubtraction() {
		assertEquals(new MathEvaluator().calculate("1 - 1"), 0d, 0.01);
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
	public void testNegative() {
		assertEquals(new MathEvaluator().calculate("-123"), -123d, 0.01);
	}

	@Test
	public void testLiteral() {
		assertEquals(new MathEvaluator().calculate("123"), 123d, 0.01);
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
	public void testComplex() {
		assertEquals(new MathEvaluator().calculate("2 / (2 + 3) * 4.33 - -6"), 7.732, 0.01);
	}

}