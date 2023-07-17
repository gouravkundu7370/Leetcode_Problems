public class CheckSortedandRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        System.out.println(checkRotatedAndSorted(arr,4));
    }
    public static boolean checkRotatedAndSorted(int[] arr, int num){

        // Your code here
        //Check if the array is sorted in increasing order.
        //If yes, then return false.
        int flag1 = 0;
        for(int i = 1; i < num; i ++) {
            if(arr[i - 1] > arr[i]) {
                flag1 = 1;
                break;
            }
        }
        if(flag1 == 0) {
            return false;
        }

        //Check if the array is sorted in decreasing order.
        //If yes, then return false.

        int flag2 = 0;
        for(int i = 1; i < num; i ++) {
            if(arr[i - 1] < arr[i]) {
                flag2 = 1;
                break;
            }
        }
        if(flag2 == 0) {
            return false;
        }

        //The intution/logic :

        //The array is sorted in increasing order and rotated
        //at the same time only if "arr[i - 1] > arr[i]" once.
        //i.e count = 1;

        //The array is sorted in decreasing order and rotated
        //at the same time only if "arr[i - 1] > arr[i]" "num - 1" times.
        //i.e count = num - 1;

        //If all the elements of the array are same we must return true
        //i.e count = 0;

        int count = 0;
        for(int i = 1; i < num; i ++) {
            if(arr[i - 1] > arr[i]) {
                count ++;
            }
        }

        if(arr[num - 1] > arr[0]) {
            count ++;
        }

        if(count <= 1 || count == num - 1) {
            return true;
        }

        return false;

    }
}
