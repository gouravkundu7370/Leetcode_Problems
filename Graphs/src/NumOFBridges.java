import java.util.ArrayList;

public class NumOFBridges {
    static void addEdge(ArrayList<ArrayList<Integer> > adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);


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
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        // Adding edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 4, 3);
        printGraph(adj);
        System.out.println();
        System.out.println(isBridge(V,adj,3,0));

    }

        //Function to find if the given edge is a bridge in graph.
        public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] v, int i)
        {
            v[i]=true;
            for(int u:adj.get(i))
            {
                if(!v[u])
                    dfs(adj,v,u);
            }

        }
        static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
        {
            // code here
            boolean[] v =new boolean[V];
            int c1=0;
            for(int i=0;i<V;i++)
            {
                if(!v[i])
                {
                    c1++;
                    dfs(adj,v,i);
                }
            }

            adj.get(c).remove(Integer.valueOf(d));
            adj.get(d).remove(Integer.valueOf(c));

            int z=0;
            boolean[] v1 =new boolean[V];
            for(int i=0;i<V;i++)
            {
                if(!v1[i])
                {
                    z++;
                    dfs(adj,v1,i);
                }
            }
            return z>c1?1:0;

        }
    }

