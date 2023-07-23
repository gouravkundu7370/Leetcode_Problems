import java.util.HashMap;

public class SmallestWindowSubstring {
    public static void main(String[] args) {

        String S = "timetopractice";
       String  P = "toc";
        System.out.println(smallestWindow(S,P));
    }
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        HashMap<Character,Integer> map=new HashMap<>();

        int n=s.length();

        int m=p.length();

        for(int k=0;k<m;k++){

            map.put(p.charAt(k),map.getOrDefault(p.charAt(k),0)+1);

        }

        String ans="-1";

        int len=Integer.MAX_VALUE;

        int i=0,j=0;

        int count=map.size();

        while(j<n){

            if(map.get(s.charAt(j))!=null){

                map.put(s.charAt(j),map.get(s.charAt(j))-1);

                if(map.get(s.charAt(j))==0)

                    count--;

            }

            if(count==0){

                while(count==0){

                    if(len>j-i+1){

                        ans=s.substring(i,j+1);

                        len=j-i+1;

                    }

                    if(map.get(s.charAt(i))!=null){

                        map.put(s.charAt(i),map.get(s.charAt(i))+1);

                        if(map.get(s.charAt(i))==1)

                            count++;

                    }

                    i++;

                }

            }

            j++;

        }

        return ans;
    }
}
