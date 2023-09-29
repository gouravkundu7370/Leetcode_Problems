import java.util.Arrays;

public class MColoringProblem {
    public static void main(String[] args) {

        boolean[][] graph = {{false,true,true,true},
                {true,false,true,false},
                {true,true,false,true},
                {true,false,true,false}};
        System.out.println(graphColoring(graph,3,4));

    }
    public static boolean graphColoring(boolean[][] graph, int m, int n) {
        // Your code here
        int[] color = new int[n];
        Arrays.fill(color,0);
        return fillColorNodes(0, graph, m, n, color);
    }
    public static boolean isSafe(boolean[] graph, int fill, int[] color)
    {
        for(int i=0;i<graph.length;i++)
        {
            if(graph[i] && color[i]==fill)
                return false;
        }

        return true;
    }
    public static boolean fillColorNodes(int curr, boolean[][] graph, int m, int n, int[] color){
        if(curr==n)
            return true;
        for(int i=1;i<=m;i++)
        {
            if(isSafe(graph[curr],i,color)){
                color[curr] = i;
                if(fillColorNodes(curr+1,graph,m,n,color))
                    return true;
                color[curr] = 0;
            }
        }
        return false;
    }
}
