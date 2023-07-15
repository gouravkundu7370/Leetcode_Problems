public class CheckPowof2 {
    public static boolean isPow2(int n) {
        if (n == 0)
            return true;

        return ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println(isPow2(4));
    }
}
