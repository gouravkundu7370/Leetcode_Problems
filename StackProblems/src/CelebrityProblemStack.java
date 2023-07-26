public class CelebrityProblemStack {
    public static void main(String[] args) {
        int N = 3;
        int[][] M = {{0 ,1 ,0},
            {0 ,0 ,0},
            {0 ,1, 0}};
        System.out.println(celebrity(M,N));
    }
    //Function to find if there is a celebrity in the party or not.
    public static int celebrity(int[][] M, int n)
    {
        // code here
        int celeb=0;
        for(int i=1;i<n;i++)
            if(M[celeb][i]==1)
                celeb=i;
        for(int i=0;i<n;i++)
            if(i!=celeb && (M[i][celeb]==0 || M[celeb][i]==1))
                return -1;


        return celeb;
    }
}
