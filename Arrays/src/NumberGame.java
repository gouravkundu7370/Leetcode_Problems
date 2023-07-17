public class NumberGame {
    public static void main(String[] args) {
        System.out.println(numGame((long)4));
    }
    static Long numGame(Long n) {
        // code here
        if(n == 1){
            return (long)1;
        }
        long res = 1;
        for(long i = 2; i<=n; ++i){
            long hcf = gcd(i,res);
            res = (res*i/hcf)%1000000007;
        }
        return res;
    }
    static Long gcd(Long a, Long b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
