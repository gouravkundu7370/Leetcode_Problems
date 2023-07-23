import java.util.Arrays;

public class CaseSpecificSorting {
    public static void main(String[] args) {
        System.out.println(caseSort("defRTSersUXI"));
    }
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        char[] lowerCase = new char[str.length()];

        Arrays.fill(lowerCase,'{');

        char[] upperCase = new char[str.length()];

        Arrays.fill(upperCase,'{');

        int index1=0, index2 = 0;



        for(int i=0;i<str.length();i++){

            if(str.charAt(i)>='a' && str.charAt(i)<='z')

                lowerCase[index1++]=str.charAt(i);

            if(str.charAt(i)>='A' && str.charAt(i)<='Z')

                upperCase[index2++] =str.charAt(i);



        }

        Arrays.sort(lowerCase);

        Arrays.sort(upperCase);



        int l = 0, u=0;



        char[] ch = str.toCharArray();

        for(int i=0;i<ch.length;i++){

            if(ch[i]>='a' && ch[i]<='z')

                ch[i] = lowerCase[l++];

            if(ch[i]>='A' && ch[i]<='Z')

                ch[i] = upperCase[u++];

        }



        return new String(ch);
    }
}
