import java.util.HashSet;

public class IntersectionUnsorted {
    public static void intersect(int[] a, int[] b, int m, int n) {
        HashSet<Integer> s = new HashSet<>();

        for (int num : b) {
            s.add(num);
        }

        for (int i = 0; i < m; i++) {
            if (s.contains(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 20,30};
        int[] arr2 = {30,20,10 };
        int m = arr1.length;
        int n = arr2.length;

        intersect(arr1, arr2, m, n);
    }
}
