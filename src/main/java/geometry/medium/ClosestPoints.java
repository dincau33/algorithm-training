package geometry.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClosestPoints {

	public static List<Point> closestPair(List<Point> points) {
		ArrayList<Point> closest = null;
		points.sort(new SortPair());
		Point previousPoint = null;
		Double shortestDistance = Double.MAX_VALUE;
		for(Point p: points) {
			if (previousPoint == null) previousPoint = p;
			else {
				Double currentDistance = norm(previousPoint, p);
				if (currentDistance < shortestDistance) {
					shortestDistance = currentDistance;
					closest = new ArrayList<>();
					closest.add(previousPoint);
					closest.add(p);
				}
			}
			previousPoint = p;
		}
		return closest;
	}

	public static double norm(Point p1, Point p2) {
		return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
	}

	public static class SortPair implements Comparator<Point> {
		public int compare(Point p1, Point p2) {
			if (p1.y < p2.y) return -1;
			if (p2.y == p1.y && p1.x < p2.x) return -1;
			if (p2.y == p1.y && p2.x == p1.x) return 0;
			return 1;
		}
	}
}


