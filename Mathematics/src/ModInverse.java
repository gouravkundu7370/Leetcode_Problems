public class ModInverse {
    public static void main(String[] args) {
        System.out.println(modInverse(3,11));
    }
    public static int modInverse(int a, int m)
    {
        //Your code here
        for(int i=1;i<m;i++){
            if((i*a)%m==1){
                return i;
            }
        }
        return -1;
    }
}
