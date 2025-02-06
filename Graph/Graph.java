import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

    int v;
    int[][] graph;

    Graph(int v) {
        this.v = v;
        this.graph = new int[v][v];
    }

    void dfs(int start) {
        boolean[] visited = new boolean[v];
        ArrayList<Integer> q = new ArrayList<>();
        java.util.Arrays.fill(visited, false);
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int current = q.get(0);
            System.out.print(current + " ");
            q.remove(q.get(0));
            for (int i = 0; i < v; i++) {
                if(!visited[i] && graph[current][i] == 1){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    void bfs(int start){
        boolean[] visited = new boolean[v];
        Arrays.fill(visited, false);
        bfsUtil(start,visited);
    }

    void bfsUtil(int start , boolean[] visited){

    }

    public static void main(String[] args) {

        Graph graph = new Graph(7);
        graph.graph = new int[][] {
                { 0, 0, 1, 0, 0, 1, 1 },
                { 0, 1, 0, 0, 1, 0, 0 },
                { 0, 1, 0, 1, 0, 1, 0 },
                { 0, 1, 1, 0, 0, 1, 0 },
                { 0, 1, 0, 1, 0, 1, 0 },
                { 0, 1, 0, 0, 1, 1, 0 },
                { 0, 1, 0, 1, 0, 1, 0 }
        };

        graph.bfs(0);
    }
}
