package stack.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinMaxStackConstructionTest {

    public void testMinMaxPeek(Integer min, Integer max, Integer peek, MinMaxStackConstruction.MinMaxStack stack) {
        assertTrue(stack.getMin() == min);
        assertTrue(stack.getMax() == max);
        assertTrue(stack.peek() == peek);
    }

    @Test
    public void TestCase1() {
        MinMaxStackConstruction.MinMaxStack stack = new MinMaxStackConstruction.MinMaxStack();
        stack.push(2);
        testMinMaxPeek(2, 2, 2, stack);
        stack.push(7);
        testMinMaxPeek(2, 7, 7, stack);
        stack.push(1);
        testMinMaxPeek(1, 7, 1, stack);
        stack.push(8);
        testMinMaxPeek(1, 8, 8, stack);
        stack.push(3);
        testMinMaxPeek(1, 8, 3, stack);
        stack.push(9);
        testMinMaxPeek(1, 9, 9, stack);
        assertTrue(stack.pop() == 9);
        testMinMaxPeek(1, 8, 3, stack);
        assertTrue(stack.pop() == 3);
        testMinMaxPeek(1, 8, 8, stack);
        assertTrue(stack.pop() == 8);
        testMinMaxPeek(1, 7, 1, stack);
        assertTrue(stack.pop() == 1);
        testMinMaxPeek(2, 7, 7, stack);
        assertTrue(stack.pop() == 7);
        testMinMaxPeek(2, 2, 2, stack);
        assertTrue(stack.pop() == 2);
    }

    @Test
    public void TestCase2() {
        MinMaxStackConstruction.MinMaxStack stack = new MinMaxStackConstruction.MinMaxStack();
        stack.push(5);
        testMinMaxPeek(5, 5, 5, stack);
        stack.push(5);
        testMinMaxPeek(5, 5, 5, stack);
        stack.push(5);
        testMinMaxPeek(5, 5, 5, stack);
        stack.push(5);
        testMinMaxPeek(5, 5, 5, stack);
        stack.push(8);
        testMinMaxPeek(5, 8, 8, stack);
        stack.push(8);
        testMinMaxPeek(5, 8, 8, stack);
        stack.push(0);
        testMinMaxPeek(0, 8, 0, stack);
        stack.push(8);
        testMinMaxPeek(0, 8, 8, stack);
        stack.push(9);
        testMinMaxPeek(0, 9, 9, stack);
        stack.push(5);
        testMinMaxPeek(0, 9, 5, stack);
        assertTrue(stack.pop() == 5);
        testMinMaxPeek(0, 9, 9, stack);
        assertTrue(stack.pop() == 9);
        testMinMaxPeek(0, 8, 8, stack);
        assertTrue(stack.pop() == 8);
        testMinMaxPeek(0, 8, 0, stack);
        assertTrue(stack.pop() == 0);
        testMinMaxPeek(5, 8, 8, stack);
        assertTrue(stack.pop() == 8);
        testMinMaxPeek(5, 8, 8, stack);
        assertTrue(stack.pop() == 8);
        testMinMaxPeek(5, 5, 5, stack);
        assertTrue(stack.pop() == 5);
        testMinMaxPeek(5, 5, 5, stack);
        assertTrue(stack.pop() == 5);
        testMinMaxPeek(5, 5, 5, stack);
        assertTrue(stack.pop() == 5);
        testMinMaxPeek(5, 5, 5, stack);
        assertTrue(stack.pop() == 5);
    }

    @Test
    public void TestCase3() {
        MinMaxStackConstruction.MinMaxStack stack = new MinMaxStackConstruction.MinMaxStack();
        stack.push(2);
        testMinMaxPeek(2, 2, 2, stack);
        stack.push(0);
        testMinMaxPeek(0, 2, 0, stack);
        stack.push(5);
        testMinMaxPeek(0, 5, 5, stack);
        stack.push(4);
        testMinMaxPeek(0, 5, 4, stack);
        assertTrue(stack.pop() == 4);
        testMinMaxPeek(0, 5, 5, stack);
        assertTrue(stack.pop() == 5);
        testMinMaxPeek(0, 2, 0, stack);
        stack.push(4);
        testMinMaxPeek(0, 4, 4, stack);
        stack.push(11);
        testMinMaxPeek(0, 11, 11, stack);
        stack.push(-11);
        testMinMaxPeek(-11, 11, -11, stack);
        assertTrue(stack.pop() == -11);
        testMinMaxPeek(0, 11, 11, stack);
        assertTrue(stack.pop() == 11);
        testMinMaxPeek(0, 4, 4, stack);
        assertTrue(stack.pop() == 4);
        testMinMaxPeek(0, 2, 0, stack);
        assertTrue(stack.pop() == 0);
        testMinMaxPeek(2, 2, 2, stack);
        assertTrue(stack.pop() == 2);
        stack.push(6);
        testMinMaxPeek(6, 6, 6, stack);
        assertTrue(stack.pop() == 6);
    }
}