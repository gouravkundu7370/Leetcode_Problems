import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOFNodes {
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
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,5);


        System.out.println(nodeLevel(V,adj,4));

    }
     //Function to find the level of node X.
     static class Pair
    {
        int value = 0;
        int level = 0;
        Pair(int value, int level)
        {
            this.value = value;
            this.level = level;
        }
    }
    //Function to find the level of node X.
    static int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        Queue<Pair> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        queue.add(new Pair(0,0));
        while(!queue.isEmpty())
        {
            Pair curr = queue.poll();
            int v = curr.value;
            int l = curr.level;
            visited[v] = true;
            if(v == X)  return l;
            for(int item : adj.get(v))
            {
                if(!visited[item])
                {
                    queue.add(new Pair(item,l+1));
                }
            }
        }
        return -1;
    }

}

