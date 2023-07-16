import java.util.ArrayList;

public class PossiblePhoneDigRec {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int N = 3;
        System.out.println(possibleWords(arr,N));

    }
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int[] a, int N)
    {
        // your code here
        String[] words = {"0","0", "abc", "def","ghi","jkl", "mno","pqrs", "tuv", "wxyz"};
        ArrayList<String> res = new ArrayList<>();
        fun(a,words,res,0,"");
        return res;
    }
    static void fun(int[] a, String[] words, ArrayList<String> res, int digit, String str)
    {
        if(digit == a.length){
            res.add(str);
            return;
        }
        String keyWord  = words[a[digit]];
        for(int i = 0;i < keyWord.length();i++)
            fun(a,words,res,digit+1,str + keyWord.charAt(i));
    }


}
