package graph.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given a Node class that has a name and a array of optional children Nodes.
 * When put together, Nodes form a simple tree-like structure.
 * Implement the depthFirstSearch method on the Node class, which takes in an empty array, traverses the tree using the Depth-first Search approach (specifically navigating the tree from left to right), stores all the of Nodes' names in the input array, and returns it.
 */
public class DepthFirstSearch {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // O(V + E) time / O(V) space
            array.add(this.name);
            for (Node child : children) child.depthFirstSearch(array);
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
