public class countDigits {
    public static int count_Digits(int x)
    {
        int res = 0;

        while(x > 0)
        {
            x = x / 10;

            res++;
        }

        return res;
    }

    public static void main (String[] args) {

        int number = 789;

        System.out.println(count_Digits(number));

    }
}
