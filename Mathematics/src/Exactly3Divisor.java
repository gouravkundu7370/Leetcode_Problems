public class Exactly3Divisor {
    public static void main(String[] args) {
        System.out.println(exactly3Divisors(25));
    }
    public static int exactly3Divisors(int N)
    {
        //Your code here
        int count = 0;
        for(int i=2; i*i <= N; i++) {
            if(isPrime(i))
                count++;
        }
        return count;
    }
    public static boolean isPrime(int n) {
        if(n == 2 || n == 3) {
            return true;
        }
        else if((n%2 == 0) || (n%3 == 0)) {
            return false;
        }
        else {
            for(int i=5; i*i <= n; i+=6) {
                if((n%i == 0) || (n%(i+2) == 0))
                    return false;
            }
            return true;
        }
    }
}
