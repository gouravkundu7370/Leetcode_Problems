import java.util.ArrayList;
import java.util.Stack;

public class KosarajuSCC {
    public static void main(String[] args) {

    }
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        Stack<Integer> st = new Stack<>();
        boolean [] visit = new boolean[V];

        //Step 1: Get the node in the Stack (topological sort)
        for(int i=0; i<V; i++){
            if(!visit[i]){
                topoSort(adj, visit, i, st);
            }
        }
        //Step 2: transpose the graph
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<V; i++){
            visit[i] = false;
            transpose.add(new ArrayList<Integer>());
        }

        for(int i=0; i<V; i++){
            for(int j=0; j<adj.get(i).size();j++){
                int dest = adj.get(i).get(j);
                transpose.get(dest).add(i);
            }
        }

        int scc = 0;
        //Step 3: do the DFS on Stack element
        while(!st.isEmpty()){
            int curr = st.pop();
            if(!visit[curr]){
                dfs(transpose, visit, curr);
                scc++;
            }
        }
        return scc;
    }

    public void topoSort(ArrayList<ArrayList<Integer>> adj, boolean[] visit, int curr, Stack<Integer> st){
        visit[curr] = true;
        for(int i=0; i<adj.get(curr).size();i++){
            if(!visit[adj.get(curr).get(i)]){
                topoSort(adj, visit, adj.get(curr).get(i), st);
            }
        }

        st.push(curr);
    }

    public void dfs(ArrayList<ArrayList<Integer>> transpose, boolean[] visit, int curr){
        visit[curr] = true;
        for(int i=0; i<transpose.get(curr).size(); i++){
            if(!visit[transpose.get(curr).get(i)]){
                dfs(transpose, visit, transpose.get(curr).get(i));
            }
        }
    }
}
