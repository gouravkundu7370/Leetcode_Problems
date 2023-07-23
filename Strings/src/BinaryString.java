public class BinaryString {
    public static void main(String[] args) {

        int N =  5;
        String str = "01101";
        System.out.println(binarySubstring(N,str));
    }
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int count = 0;
        int res = 0;
        for(int i = 0;i<a;i++){
            if(str.charAt(i) == '1'){
                count++;
                if(count > 1){
                    res += count -1;
                }
            }
        }
        return res;
    }
}
