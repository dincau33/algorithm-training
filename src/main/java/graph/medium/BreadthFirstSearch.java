package graph.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * You are given a Node class that has a name and an array of optional children Nodes.
 * When put together, Nodes form a simple tree-like structure.
 * Implement the breadthFirstSearch method on the Node class, which takes in an empty array, traverses the tree using the Breadth-first Search approach (specifically navigating the tree from left to right), stores all of the Nodes' names in the input array, and returns it.
 */

public class BreadthFirstSearch {
    // Do not edit the class below except
    // for the breadthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        // O(V + E) time | O (V) space
        public List<String> breadthFirstSearch(List<String> array) {
            LinkedList<Node> queue = new LinkedList<>();

            queue.add(this);
            while (!queue.isEmpty()) {
                Node node = queue.remove();
                array.add(node.name);
                for (Node child : node.children) {
                    queue.add(child);
                }
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
