import java.util.ArrayList;

public class DepthFirstSearch {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
    {
        visited[s]=true;
        System.out.print(s +" ");

        for(int u:adj.get(s)){
            if(!visited[u])
                DFSRec(adj,u,visited);
        }
    }

    static void DFS(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited=new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i])
                DFSRec(adj,i,visited);
        }
    }
    static int DFSConnectedComponents(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited=new boolean[V]; int count=0;

        for(int i=0;i<V;i++){
            if(!visited[i])
            {DFSRec(adj,i,visited);count++;}
        }
        return count;
    }

    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,3,4);

        System.out.println("Following is Depth First Traversal for disconnected graphs: ");
        DFS(adj,V);
        System.out.println();
        System.out.println("Number of connected components: "+DFSConnectedComponents(adj,V));
    }
}
