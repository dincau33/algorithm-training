package stack.medium;

import java.util.HashMap;
import java.util.Stack;

/*
 * Write a function that takes in a string made up of brackets ("(","[","{",")","],"}") and other optional characters. The function should return a boolean representing whether or not the string isa balanced in regards to brackets. A string is said to be balanced if it has many opening brackets of a given type as it has closing brackets of that type and if no bracket is unmatched. Not that a closing bracket cannot match a corresponding opening bracket that comes after it. Similarly, brackets cannot overlap each other as in "[(])".
 */
public class BalancedBrackets {
    public static boolean balancedBrackets(String str) {
        HashMap<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put(']', '[');
        matchingBrackets.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.size() == 0) return false;
                if (stack.peek() != matchingBrackets.get(c)) return false;
                else stack.pop();
            }
        }

        if (stack.size() != 0) return false;

        return true;
    }
}
