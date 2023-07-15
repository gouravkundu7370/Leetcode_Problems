public class gcd {
    static int gcd_eucl(int a, int b)
    {
        if(b==0)
            return a;

        return gcd_eucl(b, a % b);
    }

    public static void main (String[] args) {

        int a = 12, b = 15;

        System.out.println(gcd_eucl(a, b));

    }
}
