import java.util.ArrayList;

public class QuadraticRoots {
    public static void main(String[] args) {

        System.out.println(quadraticRoots(1,-7,12));


    }
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();

        double d= ((b * b) - (4 * a * c));

        if(d<0) {
            list.add(-1);
            return list;
        }

        double PositiveResult = ((-b + Math.sqrt(d)) / (2 * a));
        double NegativeResult = ((-b - Math.sqrt(d))/(2*a));

        if(PositiveResult>NegativeResult)
        {
            list.add((int)Math.floor(PositiveResult));
            list.add((int)Math.floor(NegativeResult));
        }
        else{
            list.add((int)Math.floor(NegativeResult));
            list.add((int)Math.floor(PositiveResult));
        }
        return list;
    }
}
