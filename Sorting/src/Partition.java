public class Partition {
    public static void main (String[] args)
    {
        int[] arr = new int[]{5,13,6,9,12,11,8};

        int n = arr.length;
        partition(arr,0,n-1,n-1);

        for(int x: arr)
            System.out.print(x+" ");


        int[] arr1 = new int[]{10,80,30,90,40,50,70};
        System.out.println();

        int n1 = arr.length;
        iPartition(arr1,0,n1-1);

        for(int x: arr1)
            System.out.print(x+" ");
        System.out.println();


        int[] arr2 = new int[]{5,3,8,4,2,7,1,10};

        int n2 = arr.length;
        lpartition(arr2,0,n2-1);

        for(int x: arr2)
            System.out.print(x+" ");
    }

    static void partition(int[] arr, int l, int h, int p)
    {
        int[] temp=new int[h-l+1];int index=0;
        for(int i=l;i<=h;i++)
            if(arr[i]<=arr[p] && i!= p)
            {
                temp[index]=arr[i];index++;
            }
        temp[index++] = arr[p];
        for(int i=l;i<=h;i++)
            if(arr[i]>arr[p])
            {
                temp[index]=arr[i];index++;
            }
        for(int i=l;i<=h;i++)
            arr[i]=temp[i-l];
    }
    static int iPartition(int[] arr, int l, int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    static int lpartition(int arr[], int l, int h)
    {
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
