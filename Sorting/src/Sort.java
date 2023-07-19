import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args)
    {
        // Our arr contains 8 elements
        int[] arr1 = {5, 20, 12, 30};
        char[] arr2 = {'B', 'B', 'A', 'C', 'A'};

        // Sorting the first array
        Arrays.sort(arr1);

        // Displaying the first array
        System.out.println(Arrays.toString(arr1));

        // Sorting the second array
        Arrays.sort(arr2);

        // Displaying the second array
        System.out.println(Arrays.toString(arr2));

        int[] arr = new int[]{5, 30, 20, 10, 8};

        // Sort subarray from index 1 to 3, i.e., 
        // only sort subarray {30, 20, 10} and 
        // keep other elements as it is. 
        Arrays.sort(arr, 1, 4);

        System.out.println(Arrays.toString(arr));

        Point[] ar = {
                new Point(10, 20),
                new Point(3, 12),
                new Point(5, 7) };

        // Sorting the object containing array
        Arrays.sort(ar);
        for(int i = 0; i < ar.length; i++)
            System.out.println(
                    ar[i].x + " " + ar[i].y);


        Integer[] arr5 = {5, 20, 10, 12};

        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Arrays.sort(arr5, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr5));


        Integer[] arr6 = {5, 20, 10, 3, 12};

        // Sorting arrays by passing
        // arr and MyCmp object
        Arrays.sort(arr6, new MyCmp());

        // Displaying the sorted array
        System.out.println(Arrays.toString(arr6));
    }
    static class Point implements Comparable<Point>
    {
        int x, y;

        // Constructor initialising x & y
        Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        // compareTo() function defining the
        // nature of sorting i.e., according to
        // x-coordinate
        public int compareTo(Point P)
        {
            // Comparing two objects by
            // Subtracting the passed object
            // from current object
            return this.x - P.x;
        }
    }
    // Comparator interface to compare
    static class MyCmp implements Comparator<Integer>
    {
        // Sorts the Integers
        public int compare(Integer a, Integer b)
        {
            return a%2 - b%2;
        }
    }

}
