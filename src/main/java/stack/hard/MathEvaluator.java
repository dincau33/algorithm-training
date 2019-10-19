package stack.hard;

import java.util.Stack;

public class MathEvaluator {

	public double calculate(String expression) {
		return parse(expression).evaluate();
	}

	private ExpressionTree parse(String Expression) {
		ExpressionTree tree = null;
		return tree;
	}

	protected class ExpressionTree {
		public ExpressionTree left;
		public ExpressionTree right;
		private Object value;

		protected ExpressionTree(Object value) {
			this.value = value;
		}

		protected double evaluate() {
			if (this == null) throw new NullPointerException();
			if (this.value instanceof Double) return (Double) this.value;
			if (this.value instanceof Operator) return ((Operator) this.value).apply(this.left, this.right);
			return -1;
		}
	}

	protected interface Operator {
		double apply(ExpressionTree left, ExpressionTree right);
	}

	protected class AddOperator implements Operator {
		static final char symbol = '+';

		public double apply(ExpressionTree left, ExpressionTree right) {
			return left.evaluate() + right.evaluate();
		}
	}

	protected class SubstractOperator implements Operator {
		static final char symbol = '-';

		public double apply(ExpressionTree left, ExpressionTree right) {
			if (left == null) return -right.evaluate();
			return left.evaluate() - right.evaluate();
		}
	}

	protected class MultiplyOperator implements Operator {
		static final char symbol = '*';

		public double apply(ExpressionTree left, ExpressionTree right) {
			return left.evaluate() * right.evaluate();
		}
	}

	protected class DivideOperator implements Operator {
		static final char symbol = '+';

		public double apply(ExpressionTree left, ExpressionTree right) {
			return left.evaluate() / right.evaluate();
		}
	}

}
