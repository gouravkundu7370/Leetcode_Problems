public class DigitsInFactorial {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(120));

    }
    public static int digitsInFactorial(int N){
        // code here
        double digits = 0;
        if( N <= 0){
            return 1;
        }

        for(int i = 2 ; i <= N ; i++){
            digits+= Math.log10(i);
        }
        return (int)Math.floor(digits) + 1;
    }
}
