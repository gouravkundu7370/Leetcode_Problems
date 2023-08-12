import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArticulPoint2 {
    static int time;
    public int[] articulationPoints(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] disc = new int[V];
        int[] low = new int[V];
        boolean[] vis = new boolean[V];
        int[] parent = new int[V];
        boolean[] ap = new boolean[V];
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.fill(parent, -1);

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                ArticulationPoint(i, adj, disc, low, vis, parent, ap);
            }
        }
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                list.add(i);
            }
        }

        int[] res;
        if (list.isEmpty()) {
            res = new int[1];
            res[0] = -1;
            return res;
        }
        Collections.sort(list);
        res = new int[list.size()];
        int j = 0;
        for (int i : list) {
            res[j++] = i;
        }
        return res;
    }

    private void ArticulationPoint(int u, ArrayList<ArrayList<Integer>> adj, int[] disc, int[] low,
                                   boolean[] vis, int[] parent, boolean[] ap) {
        vis[u] = true;
        disc[u] = low[u] = time++;
        int children = 0;
        for (int v : adj.get(u)) {
            if (!vis[v]) {
                children++;
                parent[v] = u;

                ArticulationPoint(v, adj, disc, low, vis, parent, ap);
                low[u] = Math.min(low[u], low[v]);
                if (parent[u] == -1 && children > 1) {
                    ap[u] = true;
                } else if (parent[u] != -1 && low[v] >= disc[u]) {
                    ap[u] = true;
                }
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
