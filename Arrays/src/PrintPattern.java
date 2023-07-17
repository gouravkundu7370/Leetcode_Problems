import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
    public static void main(String[] args) {

        System.out.println(pattern(16));
    }
    static List<Integer> solve(int N, List<Integer> ans)
    {
        if(N<1)
        {
            ans.add(N);
            return ans;
        }

        ans.add(N);
        solve(N-5, ans);
        ans.add(N);

        return ans;
    }

    static List<Integer> pattern(int N)
    {
        List<Integer> ans=new ArrayList<>();
        return solve(N, ans);
    }
}
