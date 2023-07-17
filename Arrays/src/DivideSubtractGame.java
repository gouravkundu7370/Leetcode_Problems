public class DivideSubtractGame {
    public static void main(String[] args) {
        System.out.println(divAndSub(3));
    }
    static String divAndSub(int N) {
        // code here
        // code here

        // ye kuchh recursion ki tarah work karega

        // agar N=13 h, to ham sare possible mov me  dekhenge

        // Ki konsa move jitne layk h

        // is tarah ham N ki har value ke lie solution tyyar kar lenge

        if(N == 1){
            return "Arya";
        }
        if(N < 6){
            return "Jon";
        }
        int[] arr = new int[N+1]; // 1 se n ke lie


        int i = 1;
        arr[0] = 0;// isme jon har jayega

        // agar jiki baari h vo us move par jitega, to ham 1 kar denge, nhi to 0
        while(i < 6 && i <= N){// 1-5 me to John hi jitega, minus use krke
            arr[i] = 1;

            i++;
        }
        i = 6;

        while(i<=N)

        {

            // agar jon ki baari h to vo dekhege ki kya aisa koi move h

            // jisko choose krne se, there is a chance for him to win,

            // mtlb agar arr[something] = 0 tk vo pahucha de, to vo jeet jayega

            // aise hi arya ki baari pe vo koi aisa move sochegi, ki jisko chlne se,

            // arr[something] = 0 ho or vo jeet jaye



            //cout<<arr[i-1]<<" ";
            if(arr[i/2] == 0 || arr[i/4]==0 || arr[i/3]==0 || arr[i/5] == 0)

            {

                // iska mtlb the person doing the move can win

                arr[i] = 1;

            }

            else if(arr[i-2]==0 || arr[i-3]==0 || arr[i-4]==0 || arr[i-5]==0)

            {

                // iska mtlb the person doing the move can win

                arr[i] = 1;

            }

            else

            {

                // aisa nhi h to arya will win

                arr[i] = 0;



            }

            i++;



        }

        if(arr[N]==1)

            return "Jon";

        else

            return "Arya";
    }
}
