public class ChocolateGame {
    public static void main(String[] args) {
        System.out.println(game(1,3));
    }
    public static boolean game(int a, int b){
        // Code Here
        if(a > b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        int k = b - a;
        double d = 1 + Math.sqrt(5);
        d /= 2;
        d *= k;
        int temp  = (int)d;
        return temp != a;
    }
}
