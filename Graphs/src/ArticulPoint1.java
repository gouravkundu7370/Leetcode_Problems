import java.util.ArrayList;

public class ArticulPoint1 {
    public static void main(String[] args) {

    }
    static int time;
    void APUtil(ArrayList<ArrayList<Integer>> adj, int u, boolean[] visited, int[] disc, int[] low, int parent, boolean[] isAP)
    {
        int children = 0;

        visited[u] = true;

        disc[u] = low[u] = ++time;

        for(Integer v : adj.get(u))
        {
            if(!visited[v])
            {
                children++;
                APUtil(adj, v, visited, disc, low, u, isAP);

                low[u] = Math.min(low[u], low[v]);

                if(parent != -1 && low[v] >= disc[u])
                    isAP[u] = true;
            }
            else if(v != parent)
                low[u] = Math.min(low[u], disc[v]);
        }

        if(parent == -1 && children > 1)
            isAP[u] = true;
    }

    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> articulationPoints(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();

        int[] disc = new int[V], low = new int[V];
        boolean[] visited = new boolean[V], isAP = new boolean[V];
        int par = -1;
        time = 0;

        APUtil(adj, 0, visited, disc, low, par, isAP);

        for(int u = 0; u < V; u++)
            if(isAP[u])
                ans.add(u);

        if(ans.isEmpty())
            ans.add(-1);

        return ans;
    }
}
