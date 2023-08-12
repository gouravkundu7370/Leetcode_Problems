import java.util.*;

public class SCCTarjanAlgo {
    private int time = 0;

    public ArrayList<ArrayList<Integer>> tarjans(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // code here
        int disc[] = new int[V];
        int low[] = new int[V];
        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);

        boolean[] stackMember = new boolean[V];
        ArrayDeque<Integer> st = new ArrayDeque<>(V);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<V; i++){
            if(disc[i] == -1){
                SCCUtil(i, adj, disc, low, stackMember, st, list);
            }
        }

        // sorting lexicographically
        list.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                int res = 0;
                int l = Math.min(list1.size(), list2.size());
                for (int i = 0; i < l && res == 0; i++) {
                    res = list1.get(i).compareTo(list2.get(i));
                }

                if (res == 0) {
                    return -1;
                }

                return res;
            }
        });
        return list;
    }

    private void SCCUtil(int u, ArrayList<ArrayList<Integer>> adj, int []disc, int []low,
                         boolean []stackMember, ArrayDeque<Integer> st, ArrayList<ArrayList<Integer>> list){
        disc[u] = low[u] = time++;
        stackMember[u] = true;
        st.push(u);

        for(int v : adj.get(u)){
            if(disc[v] == -1){
                SCCUtil(v, adj, disc, low, stackMember, st, list);
                low[u] = Math.min(low[u], low[v]);
            }
            else if(stackMember[v]){
                low[u] = Math.min(low[u], disc[v]);
            }
        }

        int w = -1;
        ArrayList<Integer> cc = new ArrayList<>();
        if(low[u] == disc[u]){
            while(w != u){
                w = st.pop();
                cc.add(w);
                stackMember[w] = false;
            }
            Collections.sort(cc);
            list.add(cc);
        }
    }
}
