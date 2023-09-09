import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleDirectedGraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V)
    {
        int[] in_degree = new int[V];

        for (int u = 0; u < V; u++) {
            for (int x:adj.get(u))
                in_degree[x]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < V; i++)
            if (in_degree[i] == 0)
                q.add(i);

        int count=0;
        while (!q.isEmpty()) {
            int u = q.poll();


            for (int x: adj.get(u))
                if (--in_degree[x] == 0)
                    q.add(x);

            count++;
        }
        if (count != V) {
            System.out.println("There exists a cycle in the graph");
        }
        else{
            System.out.println("There exists no cycle in the graph");
        }
    }
    private static boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathVis) {
        vis[node] = 1;
        pathVis[node] = 1;

        // traverse for adjacent nodes
        for(int it : adj.get(node)) {
            // when the node is not visited
            if(vis[it] == 0) {
                if(dfsCheck(it, adj, vis, pathVis))
                    return true;
            }
            // if the node has been previously visited
            // but it has to be visited on the same path
            else if(pathVis[it] == 1) {
                return true;
            }
        }

        pathVis[node] = 0;
        return false;
    }

    // Function to detect cycle in a directed graph.
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];
        int[] pathVis = new int[V];

        for(int i = 0;i<V;i++) {
            if(vis[i] == 0) {
                if(dfsCheck(i, adj, vis, pathVis)) return true;
            }
        }
        return false;
    }


    public static void main(String[] args)
    {
        int V = 10;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 1);
        addEdge(adj,6, 4);
        addEdge(adj,1, 2);
        addEdge(adj,2, 3);
        addEdge(adj,3, 4);
        addEdge(adj,2, 6);
        addEdge(adj,4, 5);
        addEdge(adj,7, 1);
        addEdge(adj,7, 8);
        addEdge(adj,8, 9);
        addEdge(adj,9, 7);

        topologicalSort(adj,V);
        System.out.println(isCyclic(V,adj));
    }
}
