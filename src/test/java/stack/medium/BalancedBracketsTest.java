package stack.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void TestCase1() {
        String input = "()[]{}{";
        assertTrue(!BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase2() {
        String input = "(((((({{{{{[[[[[([)])]]]]]}}}}}))))))";
        assertTrue(!BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase3() {
        String input = "()()[{()})]";
        assertTrue(!BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase4() {
        String input = "(()())((()()()))";
        assertTrue(BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase5() {
        String input = "{}()";
        assertTrue(BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase6() {
        String input = "()([])";
        assertTrue(BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase7() {
        String input = "((){{{{[]}}}})";
        assertTrue(BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase8() {
        String input = "([])(){}(())()()";
        assertTrue(BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase9() {
        String input = "((({})()))";
        assertTrue(BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase10() {
        String input = "(([]()()){})";
        assertTrue(BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase11() {
        String input = "(((((([[[[[[{{{{{{{{{{{{()}}}}}}}}}}}}]]]]]]))))))((([])({})[])[])[]([]){}(())";
        assertTrue(BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase12() {
        String input = "{[[[[({(}))]]]]}";
        assertTrue(!BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase13() {
        String input = "[((([])([]){}){}){}([])[]((())";
        assertTrue(!BalancedBrackets.balancedBrackets(input));
    }

    @Test
    public void TestCase14() {
        String input = ")[]}";
        assertTrue(!BalancedBrackets.balancedBrackets(input));
    }
}