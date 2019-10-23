package graph.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * You are given a two-dimensional array (matrix) of potentially unequal height and with containing only 0s and 1s.
 * Each 0 represents land, and each 1 represents part of a river.
 * A river consists of any number of 1s that are either horizontally or vertically adjacent (but not diagonally adjacent).
 * The number of adjacent 1s forming a river determine its size. Write a function that return an array of the sizes of all rivers represented in the input matrix.
 * Note that these sizes do no need to be in any particular order.
 */
public class RiverSizes {
	public static ArrayList<Integer> riverSizes(int[][] matrix) {
		int height = matrix.length;
		int width = matrix[0].length;

		int[] rivers = new int[height * width];
		Arrays.fill(rivers, -1);

		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				if (matrix[row][col] == 1) {
					int idx = getRiverIdx(row, col, height, width);
					ArrayList<Integer> surroundingRivers = getSurroundingRivers(matrix, row, col, height, width);
					if (!surroundingRivers.isEmpty()) {
						for (Integer r : surroundingRivers) {
							rivers = unionRiver(rivers, idx, r);
						}
					} else rivers[idx] = idx;
				}
			}
		}

		HashMap<Integer, Integer> riversSize = new HashMap<>();
		for (int r : rivers) {
			if (r != -1) {
				if (riversSize.containsKey(findRiverId(rivers, r))) {
					riversSize.replace(r, riversSize.get(r) + 1);
				} else {
					riversSize.put(r, 1);
				}
			}
		}

		ArrayList<Integer> riverSizeArray = new ArrayList<>();
		riversSize.forEach((k, v) -> {
			riverSizeArray.add(v);
		});

		return riverSizeArray;
	}

	private static int getRiverIdx(int row, int col, int height, int width) {
		validate(row, col, height, width);
		return row * width + col;
	}

	// validate if site (row, col) is in range or not
	private static void validate(int row, int col, int height, int width) {
		if (row < 0 || row > height)
			throw new IllegalArgumentException("row " + row + " is not between 1 and " + height);
		if (col < 0 || col > width) throw new IllegalArgumentException("col " + col + " is not between 1 and " + width);
	}

	private static ArrayList<Integer> getSurroundingRivers(int[][] matrix, int row, int col, int height, int width) {
		ArrayList<Integer> surroundingRivers = new ArrayList<>();
		if (row > 0 && matrix[row - 1][col] == 1) {
			surroundingRivers.add(getRiverIdx(row - 1, col, height, width));
		}
		if (col > 0 && matrix[row][col - 1] == 1) {
			surroundingRivers.add(getRiverIdx(row, col - 1, height, width));
		}
		return surroundingRivers;
	}

	private static int findRiverId(int[] rivers, int idx) {
		if (rivers[idx] == -1) return -1;
		while (rivers[idx] != idx) idx = rivers[idx];
		return idx;
	}

	private static int[] unionRiver(int[] rivers, int idx1, int idx2) {
		if (findRiverId(rivers, idx1) != findRiverId(rivers, idx2)) {
			int riverId1 = findRiverId(rivers, idx1);
			int riverId2 = findRiverId(rivers, idx2);
			rivers[idx1] = riverId2;
			for (int i = 0; i < rivers.length; i++) {
				if (rivers[i] == riverId1 && rivers[i] != -1) rivers[i] = riverId2;
			}
		}
		return rivers;
	}
}
