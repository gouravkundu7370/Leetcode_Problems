public class BinaryToGreyConverter {
    public static void main(String[] args) {
        System.out.println(greyConverter(7));
    }
    public static int greyConverter(int n) {

        // Your code here
        return n ^ (n >> 1);
    }
}
