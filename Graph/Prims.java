import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int key;
    int val;

    Pair(int key, int val) {
        this.key = key;
        this.val = val;
    }

    @Override
    public int compareTo(Pair o) {
        return this.val - o.val;
    }
}

public class Prims {


    class Pair{
        int weight;
        int vertex;
        Pair(int w,int v){
            this.weight = w;
            this.vertex = v;
        }
    }
    int[][] graphs;
    int v;

    Prims(int v) {
        this.v = v;
        this.graphs = new int[v][v];
    }
    

    void mstViaPrims() {
        boolean[] visited = new boolean[v];
        int[] cost = new int[v];
        int[] parent = new int[v];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);
        pq.add(new Pair(0, 0));
        Arrays.fill(cost, 0 );
        Arrays.fill(visited, false);
        Arrays.fill(parent, -1);
        cost[0] = 0;
        parent[0] = -1;
        visited[0] = true;
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            for(int i = 0 ; i < v ; i++){
                int u = graphs[curr.vertex][i];
                if(!visited[i] && cost[i] < u && u != 0){
                    visited[i] = true;
                    cost[i] = u;
                    parent[i] = curr.vertex;
                    pq.add(new Pair(u, i));
                }
            }
        }
        for(int i = 1 ; i < v ; i++){
            
            System.out.println(parent[i] + " -> " + i + " " + cost[i]);
        }
        
    
    }

    public static void main(String[] args) {
        Prims graph = new Prims(6);
        graph.graphs = new int[][] {
            //    0  1  2  3  4  5
                { 0, 2, 1, 0, 0, 0 },
                { 2, 0, 7, 0, 4, 0 },
                { 1, 7, 0, 2, 3, 0 },
                { 0, 0, 2, 0, 2, 4 },
                { 0, 4, 3, 2, 0, 0 },
                { 0, 5, 0, 4, 0, 0 }
        };
        
        

        // // graph.mstViaPrims();
        // HashMap<Integer ,Integer> map  = new HashMap<>();
        // map.put(1, 1);
        // // System.out.println(map.get(1));
        // map.put(1, map.get(1) + 1);
        // // System.out.println(map.get(1));
        // // 
        // System.out.println(map.size());
        // map.remove(1);
        // System.out.println(map.size());
        // HashSet <Integer> set = new HashSet<>();
        // set.add(1);
        // // Map<Integer,Integer> m = new Map<>();
        // double a = 1/1;
        // System.out.println(Math.abs(a));
        int []ar = {1,2,34};
        int []ar2 = Arrays.copyOf(ar, 2);
        ar2[0] = 2;
        System.out.println(ar[0]);
        System.out.println(ar2[1]);
        // Integer.MIN_VALUE
    }
}
