public class FirstSetBitPosition {
    public static void main(String[] args) {
        System.out.println(getFirstSetBit(8));
    }
    public static int getFirstSetBit(int n){

        // Your code here
        if(n == 0){
            return 0;
        }
        int pos = 1;
        while((n & 1) == 0){
            n = n>>1;
            pos++;
        }
        return pos;
    }
}
