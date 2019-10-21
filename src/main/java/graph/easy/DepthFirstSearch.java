package graph.easy;

import java.util.ArrayList;

public class DepthFirstSearch {
	// Do not edit the class below except
	// for the depthFirstSearch method.
	// Feel free to add new properties
	// and methods to the class.
	static class Node {
		String name;
		ArrayList<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}

		public ArrayList<String> depthFirstSearch(ArrayList<String> array) {
			// O(V + E) time / O(V) space
			array.add(this.name);
			for (Node child:children) child.depthFirstSearch(array);
			return array;
		}

		public Node addChild(String name) {
			Node child = new Node(name);
			children.add(child);
			return this;
		}
	}
}
