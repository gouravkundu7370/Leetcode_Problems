import java.util.ArrayDeque;

public class RemoveConsecPairDup {
    //Function to remove pair of duplicates from given string using Stack.

    public static String removePair(String str)
    {
        ArrayDeque<Character> s = new ArrayDeque<>();

        String res = "";
        for(int i =0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(s.isEmpty() || !check(s.peek(), ch)){
                s.push(ch);

            }
            else if(check(s.peek(), ch)){
                s.pop();
            }
        }
        while(!s.isEmpty()){
            res = s.pop() + res;
        }
        return res ;
    }
    static boolean check(char a , char b){
        return (a == b);
    }

    public static void main(String[] args) {
        String arr = "aaabbaaccd";
        System.out.println(removePair(arr));
    }
}
