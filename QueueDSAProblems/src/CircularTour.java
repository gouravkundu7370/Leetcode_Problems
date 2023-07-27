public class CircularTour {
    public static void main(String[] args) {
       int  N = 4;
        int[] Petrol = {4 ,6 ,7 ,4};
        int[] Distance = {6 ,5 ,3 ,5};
        System.out.println(tour(Petrol,Distance));
    }
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    public static int tour(int[] petrol, int[] distance)
    {
        // Your code here
        int deficit=0, start=0,cal=0;
        for(int i=0;i<petrol.length;i++){
            cal+=petrol[i]-distance[i];
            if(cal<0){
                start=i+1;
                deficit+=cal;
                cal=0;
            }
        }
        return (cal+deficit)>0 ? start :-1;
    }
}
