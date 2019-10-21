package graph.medium;

import java.util.ArrayList;
import java.util.LinkedList;

public class BreadthFirstSearch {
	// Do not edit the class below except
	// for the breadthFirstSearch method.
	// Feel free to add new properties
	// and methods to the class.
	static class Node {
		String name;
		ArrayList<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}

		// O(V + E) time | O (V) space
		public ArrayList<String> breadthFirstSearch(ArrayList<String> array) {
			LinkedList<Node> queue = new LinkedList<>();

			queue.add(this);
			while(!queue.isEmpty()) {
				Node node = queue.remove();
				array.add(node.name);
				for(Node child:node.children) {
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
