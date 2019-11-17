package stack.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Stack;

/*
 * Write a Min max Stack class.
 * The class should support pushing and popping values on and off the stack,
 * peeking at values at the top of the stack,
 * and getting both the minimum and the maximum values in the stacks.
 * All class methods, when considered independently, should run in constant time and with constant space
 */
public class MinMaxStackConstruction {

    static class MinMaxStack {
        Stack<Integer> stack = new Stack<>();
        ArrayList<HashMap<String, Integer>> minMaxStack = new ArrayList<>();
        int index = -1;

        public Integer peek() {
            if (index < 0) throw new NoSuchElementException();
            return stack.peek();
        }

        public Integer pop() {
            if (index < 0) throw new NoSuchElementException();
            minMaxStack.remove(index--);
            return stack.pop();
        }

        public void push(Integer number) {
            int currentMin = Integer.MAX_VALUE;
            int currentMax = Integer.MIN_VALUE;
            if (index >= 0) {
                currentMin = getMin();
                currentMax = getMax();
            }
            if (number < currentMin) currentMin = number;
            if (number > currentMax) currentMax = number;

            stack.push(number);
            index++;

            HashMap<String, Integer> currentMinMax = new HashMap<>();
            currentMinMax.put("min", currentMin);
            currentMinMax.put("max", currentMax);
            minMaxStack.add(currentMinMax);
        }

        public Integer getMin() {
            if (index < 0) throw new NoSuchElementException();
            return minMaxStack.get(index).get("min");
        }

        public Integer getMax() {
            if (index < 0) throw new NoSuchElementException();
            return minMaxStack.get(index).get("max");
        }
    }
}
