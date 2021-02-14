import java.util.LinkedList;

/**
 * <a href="https://leetcode.com/problems/is-graph-bipartite/">785. Is Graph Bipartite?</a>
 */

public class _785 {

    public static class Solution {
        public boolean isBipartite(int[][] graph) {
            int color1 = 1;
            int color2 = 2;
            int[] color = new int[graph.length];
            LinkedList<Integer> queue = new LinkedList<>();

            for (int i = 0; i < graph.length; ++i) {
                if (graph[i].length == 0 || color[i] > 0) {
                    continue;
                }
                queue.add(i);
                color[i] = color1;
                while (!queue.isEmpty()) {
                    Integer node = queue.poll();
                    for (Integer neighbor : graph[node]) {
                        if (color[neighbor] == 0) {
                            queue.add(neighbor);
                            color[neighbor] = color[node] == color1 ? color2 : color1;
                        }
                        else if (color[neighbor] == color[node]) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
