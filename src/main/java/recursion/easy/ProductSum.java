package recursion.easy;

import java.util.ArrayList;

/*
 * Write a function that takes in a "special" array and returns its product sum.
 * A "special" array is a no-empty array that contains wither integers or other "special" arrays. The product sum of a "special" array is the sum of its elements, where "special" arrays inside it should be summed themselves and then multiplied by their level of depth. For example, the product sum of [x, y] is x + y; the product sum of [x, [y, z]] is x + 2y + 2z.
 */
public class ProductSum {
    // O(n) time | O(d) space
    // n is the total number of element including sub-element
    // d is the max depth
    public static int productSum(ArrayList<Object> array) {
        return productSum(array, 0);
    }

    private static int productSum(ArrayList<Object> array, int depth) {
        int sum = 0;
        depth++;
        for (Object i : array) {
            if (i instanceof Integer) sum += (int) i;
            else {
                sum += productSum((ArrayList<Object>) i, depth);
            }
        }
        return depth * sum;
    }
}
