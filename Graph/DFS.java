import java.util.Arrays;
import java.util.Stack;

public class DFS {

    int v;
    int[][] graph;

    DFS(int v) {
        this.v = v;
        this.graph = new int[v][v];
    }

    void dfsUtil(int start, boolean[] visited) {
        System.out.print(start + " ");
        visited[start] = true;
        for (int i = 0; i < v; i++) {
            if (graph[start][i] != 0 && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }

    void dfs() {
        boolean[] visited = new boolean[v];
        visited[0] = true;
        Arrays.fill(visited, false);
        dfsUtil(0, visited);
    }

    void dfsWithoutRecursion(){
        int start = 0;
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[v];
        st.push(start);
        while (st.size() != v) {
            int curr = st.peek();
            for(int i = 0 ; i < v ; i++){
                if(!visited[i] && graph[curr][i] != 0){
                    st.push(i);
                    visited[i] = true;
                }
            }
        }

        for(int i : st){
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        DFS gh = new DFS(5);

        gh.graph = new int[][] {
                { 0, 1, 1, 0, 0 },
                { 1, 0, 1, 1, 0 },
                { 1, 1, 0, 1, 0 },
                { 0, 1, 1, 0, 1 },
                { 0, 0, 0, 1, 0 },
        };
        gh.dfs();
        

    }
}
