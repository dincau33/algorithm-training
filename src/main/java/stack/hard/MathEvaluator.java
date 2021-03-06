package stack.hard;

import java.util.*;

public class MathEvaluator {

    private enum Operator {
        ADD(1), SUBTRACT(2), MULTIPLY(3), DIVIDE(4), MINUS(5);
        final int precedence;

        Operator(int p) {
            precedence = p;
        }
    }

    private static Map<String, Operator> operators = new HashMap<String, Operator>() {{
        put("+", Operator.ADD);
        put("-", Operator.SUBTRACT);
        put("*", Operator.MULTIPLY);
        put("/", Operator.DIVIDE);
        put("minus", Operator.MINUS);
    }};

    private static boolean isHigherPrecedence(String op1, String op2) {
        if (isLeftParenthesis(op2)) return false;
        if (!operators.containsKey(op1) || !operators.containsKey(op2)) throw new NoSuchElementException();
        return operators.get(op2).precedence >= operators.get(op1).precedence;
    }

    private static boolean isLeftParenthesis(String s) {
        return s.equals("(");
    }

    private static boolean isRightParenthesis(String s) {
        return s.equals(")");
    }

    private static boolean isDouble(char c) {
        return (c >= '0' && c <= '9') || c == '.';
    }

    public double calculate(String expression) {
        if (expression.isEmpty()) return 0;

        Stack<Double> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        ArrayList<String> tokens = parse(expression);

        for (String token : tokens) {
            if (operators.containsKey(token)) {
                // if operator has a lower precedence than top operator
                // apply top operator to the 2 top operands
                while (!operator.isEmpty() && isHigherPrecedence(token, operator.peek()))
                    operand.push(applyOperator(operator, operand));
                operator.push(token);
            } else if (isLeftParenthesis(token)) {
                operator.push(token);
            } else if (isRightParenthesis(token)) {
                // if closing parenthesis apply top operator to the 2 top operands
                // as long opening parenthesis is not reached.
                while (!isLeftParenthesis(operator.peek()))
                    operand.push(applyOperator(operator, operand));
                operator.pop(); // remove left parenthesis
            } else {
                operand.push(Double.parseDouble(token));
            }
        }

        while (!operator.isEmpty()) {
            operand.push(applyOperator(operator, operand));
        }

        return operand.pop();
    }

    private ArrayList<String> parse(String expression) {
        char[] tokens = expression.replaceAll("\\s", "").toCharArray();
        ArrayList<String> decomposedExpression = new ArrayList<>();
        String previous = "";
        for (int i = 0; i < tokens.length; i++) {
            // Literal
            if (isDouble(tokens[i])) {
                StringBuffer sbuf = new StringBuffer();
                while (i < tokens.length && isDouble(tokens[i]))
                    sbuf.append(tokens[i++]);
                previous = sbuf.toString();
                decomposedExpression.add(previous);
                i--;
            } else {
                // Negative literal
                // isNegative if - is prefixed by nothing -1
                // isNegative if - is prefixed by another operator
                // isNegative if - is prefixed by left parenthesis
                if (tokens[i] == '-' && (previous.isEmpty() || operators.containsKey(previous) || isLeftParenthesis(previous))) {
                    previous = "minus";
                    decomposedExpression.add(previous);
                } else {
                    // Operator
                    previous = Character.toString(tokens[i]);
                    decomposedExpression.add(previous);
                }
            }
        }
        return decomposedExpression;
    }

    private double applyOperator(Stack<String> operator, Stack<Double> operand) {
        double rightOperand = operand.pop();
        switch (operators.get(operator.pop())) {
            case MINUS:
                return -rightOperand;
            case ADD:
                return operand.pop() + rightOperand;
            case SUBTRACT:
                return operand.pop() - rightOperand;
            case MULTIPLY:
                return operand.pop() * rightOperand;
            case DIVIDE:
                if (rightOperand == 0) throw new UnsupportedOperationException();
                return operand.pop() / rightOperand;
        }
        return 0;
    }

}
