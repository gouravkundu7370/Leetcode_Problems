public class GrayToBinaryEquivalent {
    public static void main(String[] args) {
        System.out.println(grayToBinary(4));
    }
    public static int grayToBinary(int n) {

        // Your code here
        int res = 0;
        while(n > 0){
            res = res^n;
            n = n >> 1;
        }
        return res;
    }
}
