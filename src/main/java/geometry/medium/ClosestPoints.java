package geometry.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * Given a number of points on a plane, your task is to find two points with the smallest distance between them in linearithmic O(n log n) time.
 */
public class ClosestPoints {
    // O(n * log(n)) time
    public static List<Point> closestPair(List<Point> points) {
        for (Point p : points) {
            if (p == null) throw new IllegalArgumentException();
        }

        points.sort(new SortPairByX());

        // If there are 2 or 3 points use brute force approach
        if (points.size() <= 3) return bruteForce(points);

        // 1 - If there are more than 3 points, divide subset in 2: left and right subset.
        // The middle point is the midPoint.
        int mid = points.size() / 2;
        List<Point> leftPoints = new ArrayList<>(points.subList(0, mid));
        List<Point> rightPoints = new ArrayList<>(points.subList(mid, points.size()));

        // 2 - Recursively find the closest pair of each subset (Respectively leftPair and rightPair).
        List<Point> leftPair = closestPair(leftPoints);
        List<Point> rightPair = closestPair(rightPoints);

        // 3 - The closest pair is the pair among leftPair and rightPair that has the shortest distance.
        List<Point> closest = norm(leftPair.get(0), leftPair.get(1)) <= norm(rightPair.get(0), rightPair.get(1)) ? leftPair : rightPair;
        Double shortestDistance = norm(closest.get(0), closest.get(1));

        // 4 - Strip the points that are between the mid point and the shortest distance.
        List<Point> stripPoints = getStripPoints(points, points.get(mid), shortestDistance);

        // 5 - Find the shortest distance and closest pair among the stripped points.
        List<Point> stripPair = getClosestStripPoints(stripPoints, shortestDistance);

        // 6 - The closest pair is the pair among leftPair, rightPair and stripPair that has the shortest distance
        if (stripPair.size() >= 2)
            closest = norm(closest.get(0), closest.get(1)) <= norm(stripPair.get(0), stripPair.get(1)) ? closest : stripPair;

        return closest;
    }

    public static List<Point> bruteForce(List<Point> points) {
        List<Point> closest = new ArrayList<>();
        Double shortestDistance = Double.POSITIVE_INFINITY;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            for (int j = i + 1; j < points.size(); j++) {
                Point p2 = points.get(j);
                Double currentDistance = norm(p1, p2);
                if (currentDistance < shortestDistance) {
                    closest = new ArrayList<>();
                    closest.add(p1);
                    closest.add(p2);
                    shortestDistance = currentDistance;
                }
            }
        }
        return closest;
    }

    public static List<Point> getStripPoints(List<Point> points, Point midPoint, Double distance) {
        List<Point> stripPoints = new ArrayList<>();
        for (Point p : points) {
            if (Math.abs(midPoint.x - p.x) < distance) stripPoints.add(p);
        }
        return stripPoints;
    }

    public static List<Point> getClosestStripPoints(List<Point> points, Double distance) {
        points.sort(new SortPairByY());
        List<Point> closest = new ArrayList<>();
        Double shortestDistance = Double.POSITIVE_INFINITY;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            for (int j = i + 1; j < points.size() && Math.abs(p1.y - points.get(j).y) < distance; j++) {
                Point p2 = points.get(j);
                Double currentDistance = norm(p1, p2);
                if (currentDistance < shortestDistance) {
                    closest = new ArrayList<>();
                    closest.add(p1);
                    closest.add(p2);
                    shortestDistance = currentDistance;
                }
            }
        }
        return closest;
    }

    public static double norm(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    public static class SortPairByX implements Comparator<Point> {
        public int compare(Point p1, Point p2) {
            if (p1.x < p2.x) return -1;
            if (p1.x == p2.x) return 0;
            return 1;
        }
    }

    public static class SortPairByY implements Comparator<Point> {
        public int compare(Point p1, Point p2) {
            if (p1.y < p2.y) return -1;
            if (p1.y == p2.y) return 0;
            return 1;
        }
    }
}


