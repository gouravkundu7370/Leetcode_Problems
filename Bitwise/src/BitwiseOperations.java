public class BitwiseOperations {
    public static void main(String[] args) {
        int x = 3, y = 6;

        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);

         x = 1;
        System.out.println(~ x);

         x = 3;

        System.out.println(x << 1);

        System.out.println(x << 2);

         y = 4;

        int z = (x << y);

        System.out.println(z);
        x = -1;

        System.out.println(x << 1);

        x = 33;

        System.out.println(x >> 1);
        System.out.println(x >> 2);
        x =-2;
        System.out.println(x >> 1);
        System.out.println(x >>> 1);
    }
}
