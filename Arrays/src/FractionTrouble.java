import java.util.Arrays;

public class FractionTrouble {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(LargestFraction(1,8)));
    }

    public static int[] LargestFraction(int n, int d) {
        // code here
        int num = -1;
        int den = 1;
        for (int y = 10000; y >= 2; --y) {
            int x = (n * y - 1) / d;
            if ((gcd(x, y) == 1) && x * den >= y * num) {
                num = x;
                den = y;
            }
        }
        int[] ans = {num, den};
        return ans;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b,a%b);
    }
}
