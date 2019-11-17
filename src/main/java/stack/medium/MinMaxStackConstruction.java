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

        public Integer peek() {
            if (stack.size() <= 0) throw new NoSuchElementException();
            return stack.peek();
        }

        public Integer pop() {
            if (stack.size() <= 0) throw new NoSuchElementException();
            minMaxStack.remove(stack.size() - 1);
            return stack.pop();
        }

        public void push(Integer number) {
            int currentMin = number;
            int currentMax = number;
            if (stack.size() > 0) {
                currentMin = Math.min(getMin(), currentMin);
                currentMax = Math.max(getMax(), currentMax);
            }

            stack.push(number);

            HashMap<String, Integer> currentMinMax = new HashMap<>();
            currentMinMax.put("min", currentMin);
            currentMinMax.put("max", currentMax);
            minMaxStack.add(currentMinMax);
        }

        public Integer getMin() {
            if (stack.size() <= 0) throw new NoSuchElementException();
            return minMaxStack.get(stack.size() - 1).get("min");
        }

        public Integer getMax() {
            if (stack.size() <= 0) throw new NoSuchElementException();
            return minMaxStack.get(stack.size() - 1).get("max");
        }
    }
}
