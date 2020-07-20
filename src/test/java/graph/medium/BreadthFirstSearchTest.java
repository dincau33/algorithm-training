package graph.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstSearchTest {
	BreadthFirstSearch.Node test1;
	BreadthFirstSearch.Node test2;
	BreadthFirstSearch.Node test3;
	BreadthFirstSearch.Node test4;
	BreadthFirstSearch.Node test5;

	public BreadthFirstSearchTest() {
		test1 = new BreadthFirstSearch.Node("A");
		test1.addChild("B").addChild("C");
		test1.children.get(0).addChild("D");

		test2 = new BreadthFirstSearch.Node("A");
		test2.addChild("B").addChild("C").addChild("D").addChild("E");
		test2.children.get(1).addChild("F");

		test3 = new BreadthFirstSearch.Node("A");
		test3.addChild("B");
		test3.children.get(0).addChild("C");
		test3.children.get(0).children.get(0).addChild("D").addChild("E");
		test3.children.get(0).children.get(0).children.get(0).addChild("F");

		test4 = new BreadthFirstSearch.Node("A");
		test4.addChild("B").addChild("C").addChild("D");
		test4.children.get(0).addChild("E").addChild("F");
		test4.children.get(2).addChild("G").addChild("H");
		test4.children.get(0).children.get(1).addChild("I").addChild("J");
		test4.children.get(2).children.get(0).addChild("K");

		test5 = new BreadthFirstSearch.Node("A");
		test5.addChild("B").addChild("C").addChild("D").addChild("L").addChild("M");
		test5.children.get(0).addChild("E").addChild("F").addChild("O");
		test5.children.get(1).addChild("P");
		test5.children.get(2).addChild("G").addChild("H");
		test5.children.get(0).children.get(0).addChild("Q").addChild("R");
		test5.children.get(0).children.get(1).addChild("I").addChild("J");
		test5.children.get(2).children.get(0).addChild("K");
		test5.children.get(4).addChild("S").addChild("T").addChild("U").addChild("V");
		test5.children.get(4).children.get(0).addChild("W").addChild("X");
		test5.children.get(4).children.get(0).children.get(1).addChild("Y").addChild("Z");
	}

	@Test
	public void TestCase1() {
		String[] expected = {"A", "B", "C", "D"};
		List<String> inputArray = new ArrayList<String>();
		assertTrue(compare(test1.breadthFirstSearch(inputArray), expected));
	}

	@Test
	public void TestCase2() {
		String[] expected = {"A", "B", "C", "D", "E", "F"};
		List<String> inputArray = new ArrayList<String>();
		assertTrue(compare(test2.breadthFirstSearch(inputArray), expected));
	}

	@Test
	public void TestCase3() {
		String[] expected = {"A", "B", "C", "D", "E", "F"};
		List<String> inputArray = new ArrayList<String>();
		assertTrue(compare(test3.breadthFirstSearch(inputArray), expected));
	}

	@Test
	public void TestCase4() {
		String[] expected = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
		List<String> inputArray = new ArrayList<String>();
		assertTrue(compare(test4.breadthFirstSearch(inputArray), expected));
	}

	@Test
	public void TestCase5() {
		String[] expected = {
				"A", "B", "C", "D", "L", "M", "E", "F", "O", "P", "G", "H", "S", "T", "U", "V", "Q", "R", "I",
				"J", "K", "W", "X", "Y", "Z"
		};
		List<String> inputArray = new ArrayList<String>();
		assertTrue(compare(test5.breadthFirstSearch(inputArray), expected));
	}

	public static boolean compare(List<String> arr1, String[] arr2) {
		if (arr1.size() != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.size(); i++) {
			if (!arr1.get(i).equals(arr2[i])) {
				return false;
			}
		}
		return true;
	}

}