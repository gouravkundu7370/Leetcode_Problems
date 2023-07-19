import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args)
    {
        // Create a list of strings
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(20);

        // List is sorted in the natural order
        Collections.sort(list);

        // Displaying the sorted list
        System.out.println(list);

        // Sorting the list in reverse order
        Collections.sort(list, Collections.reverseOrder());

        // Let us print the sorted list
        System.out.println(list);

        List<Point> list1 = new ArrayList<Point>();
        list1.add(new Point(5, 10));
        list1.add(new Point(2, 20));
        list1.add(new Point(10, 30));

        // List is sorted in the natural order
        Collections.sort(list1);

        // Displaying the points
        for (Point p: list1)
            System.out.println(p.x + " " + p.y);
    }
    static class Point implements Comparable<Point>
    {
        int x, y;
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
            return this.x - P.x;
        }
    }
}
