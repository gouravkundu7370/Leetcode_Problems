import java.util.ArrayList;

public class PossiblePathsBetweenVertices {
    static int count = 0;
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,0,4);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,4);
        addEdge(adj,3,2);
        printGraph(adj);
        System.out.println();
        System.out.println(countPaths(V,adj,0,4));
    }
    public static int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                          int destination) {

        // Code here
        dfs(adj,source,destination);
        return count;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int s,int d){
        if(s==d){
            count++;
        }
        for (int nbr:adj.get(s)){
            dfs(adj,nbr,d);
        }
    }
    static void addEdge(ArrayList<ArrayList<Integer> > adj, int u, int v)
    {
        adj.get(u).add(v);

    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
