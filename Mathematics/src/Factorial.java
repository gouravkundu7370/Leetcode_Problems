public class Factorial {
    public static int fact_rec(int n)
    {
        if(n==0)
            return 1;

        return n * fact_rec(n-1);
    }
    static int fact_iter(int n)
    {
        int res = 1;

        for(int i=2; i<=n; i++)
        {
            res = res * i;
        }
        return res;
    }

    public static void main (String[] args) {

        int number = 5;

        System.out.println(fact_rec(number));
        System.out.println(fact_iter(number));
    }
}
