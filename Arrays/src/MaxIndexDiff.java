public class MaxIndexDiff {
    public static void main(String[] args) {
        int[] arr ={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n =9;
        System.out.println(maxIndexDiff(arr,n));
    }
    static int maxIndexDiff(int[] A, int N) {

        // Your code here
        int max = 0;

        for(int i = 0; i < N; i++){

            int j = N-1;

            int count = 0;

            while(j > i){

                if(A[j] >= A[i]){

                    count = j - i;

                    break;

                }

                j--;

            }

            max = Math.max(max, count);

        }
        return max;

    }
}
