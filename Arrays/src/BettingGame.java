public class BettingGame {

    public static void main(String[] args) {
        System.out.println(betBalance("WLWWWLW"));
    }
    public static int betBalance(String result)
    {
        // code here
        int sum = 4;

        int initial = 1;

        for(int i = 0; i < result.length(); i++){

            if(sum >= initial){

                if(result.charAt(i) == 'W'){

                    sum += initial;

                    initial = 1;

                }else{

                    sum -= initial;

                    initial *= 2;

                }

            }else{

                return -1;

            }

        }

        return sum;
    }
}
