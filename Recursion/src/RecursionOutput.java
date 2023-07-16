public class RecursionOutput {
    public static void fun(int n)
    {
        if(n == 0)
            return;

        System.out.println(n);

        fun(n - 1);

        System.out.println(n);
    }
    public static void main(String [] args)
    {
        fun(3);
        System.out.println();
        fun1(3);
        System.out.println();
        fun3(3);
        System.out.println();
        System.out.println(fun4(4));
    }
    static void fun1(int n)
    {
        if(n == 0)
            return;

        fun1(n - 1);

        System.out.println(n);

        fun1(n - 1);
    }
    static void fun3(int n)
    {
        if(n == 0)
            return;

        fun3(n / 2);

        System.out.println(n % 2);

    }
    static int fun4(int n)
    {
        if(n == 1)
            return 0;
        else
            return 1 + fun4(n / 2);
    }


}
