public class PowOfNumbers {
    public static void main(String[] args) {

        System.out.println(power(12,21));
    }
    public static long power(long n,long r)
    {
        //Your code here
        if(r == 0){
            return 1;
        }
        long temp = power(n,r/2);
        long evenPower = (temp*temp)%1000000007;
        if(r%2 == 0){
            return evenPower;
        }
        return (n*evenPower)% 1000000007;
    }
}
