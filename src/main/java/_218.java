import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * <a href="https://leetcode.com/problems/the-skyline-problem/">218. The Skyline Problem</a>
 */

public class _218 {

    public static class Solution1 {

        public List<List<Integer>> getSkyline(int[][] buildings) {
            // Convert buildings in poinst (start and end point for every building)
            List<Point> listOfPoints = new ArrayList<>();
            for(int i = 0; i < buildings.length; ++i) {
                // Start point
                listOfPoints.add(new Point(buildings[i][0], buildings[i][2], true));
                // End point
                listOfPoints.add(new Point(buildings[i][1], buildings[i][2], false));
            }
            Collections.sort(listOfPoints);

            TreeMap<Integer, Integer> queue = new TreeMap<>();
            queue.put(0, 1);
            int prevMaxHeight = 0;
            List<List<Integer>> results = new ArrayList<>();
            for(Point point : listOfPoints) {
                if (point.isStart()) {
                    queue.compute(point.getHeight(), (key, value) -> {
                        if (value != null) {
                            return ++value;
                        }
                        return 1;
                    });
                }
                else {
                    queue.compute(point.getHeight(), (key, value) -> {
                        if (value == 1) {
                            return null;
                        }
                        return --value;
                    });
                }
                int currentMaxHeight = queue.lastKey();
                if (prevMaxHeight != currentMaxHeight) {
                    List<Integer> resultPoint = new ArrayList<>();
                    resultPoint.add(point.getX());
                    resultPoint.add(currentMaxHeight);
                    results.add(resultPoint);
                    prevMaxHeight = currentMaxHeight;
                }
            }
            return results;
        }
    }

    static class Point implements Comparable<Point> {
        private int x;
        private int height;
        private boolean start;

        public Point(int x, int height, boolean start) {
            this.x = x;
            this.height = height;
            this.start = start;
        }

        public boolean isStart() {
            return start;
        }

        public int getHeight() {
            return height;
        }

        public int getX() {
            return x;
        }

        @Override
        public int compareTo(Point otherPoint) {
            if (this.x != otherPoint.x) {
                return this.x - otherPoint.x;
            } else {
                return (this.start ? -this.height : this.height) -
                        (otherPoint.start ? -otherPoint.height : otherPoint.height);
            }
        }
    }
}

