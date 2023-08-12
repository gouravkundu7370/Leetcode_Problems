import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {
    public static void main(String[] args) {


    }
    static class Pair implements Comparable<Pair>{
        int v;
        int wt;

        Pair(int v,int wt){
            this.v=v;
            this.wt=wt;
        }
        public int compareTo(Pair p2){
            return this.wt-p2.wt;
        }

    }
    static int spanningTree(int V, int E, int[][] edges){
        // Code Here.
        ArrayList<ArrayList<Pair>>  list=new ArrayList<ArrayList<Pair>>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<Pair>());
        }
        for(int i=0;i<E;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];

            list.get(u).add(new Pair(v,wt));
            list.get(v).add(new Pair(u,wt));
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        boolean[] vis =new boolean[V];
        int s=0;
        while(!pq.isEmpty()){
            Pair node=pq.poll();
            int v=node.v;
            int wt=node.wt;
            if(vis[v])
                continue;

            s+=wt;
            vis[v]=true;
            for(Pair it:list.get(v)){
                if(!vis[it.v])
                    pq.add(new Pair(it.v,it.wt));
            }
        }
        return s;
    }
}
