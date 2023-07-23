public class NthPrimeDigit {
    public static int primeDigits(int n)
    {
        //Your code here
        int[] arr =new int[100];

        arr[0]=2;

        arr[1]=3;

        arr[2]=5;

        arr[3]=7;

        int k=0;

        for(int i=4;i<100;i+=4){

            for (int j=0;j<4;j++)

                arr[i+j]=arr[k]*10+arr[j];

            k++;

        }

        return arr[n-1];
    }

    public static void main(String[] args) {
        System.out.println(primeDigits(21));
    }
}
