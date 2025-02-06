import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijastra {

    int v;
    int[][] graph;

    Dijastra(int v) {
        this.v = 0;
        this.graph = new int[v][v];
    }

    public void SingleSourceShortestPath(int start) {
        int[] cost = new int[v];
        boolean[] visited = new boolean[v]; // spt
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        Arrays.fill(cost, Integer.MAX_VALUE);
        Arrays.fill(visited, false);

        cost[start] = 0; 
        q.add(new int[] { 0, start }); 

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int u = current[1]; 

            if (visited[u])
                continue;
            visited[u] = true; 
            for (int i = 0; i < v; i++) {

                if (graph[u][i] != 0 && !visited[i]) {
                  
                    int newCost = cost[u] + graph[u][i];
                    if (newCost < cost[i]) {
                        cost[i] = newCost;
                        q.add(new int[] { newCost, i }); 
                    }
                }
            }
        }

        System.out.println("Shortest distances from start node " + start + ": " + Arrays.toString(cost));
    }

    public static void main(String[] args) {
        Dijastra graph = new Dijastra(9);
        graph.graph = new int[][] {
                { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
        };
        graph.SingleSourceShortestPath(0);
    }
}
