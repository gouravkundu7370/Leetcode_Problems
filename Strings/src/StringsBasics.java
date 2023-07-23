public class StringsBasics {
    public static void main(String[] args)
    {
        // Creates a string literal
        String str = "geeks";

        // Returns the number of
        // characters in the String.
        System.out.println(str.length());

        // Returns the character at ith index.
        System.out.println(str.charAt(3));

        // Return the substring from the
        // ith  index character
        // to end of string
        System.out.println(str.substring(2));

        // Returns the substring from i to j-1 index.
        System.out.println(str.substring(2,5));

        String s1 = "geeksforgeeks";
        String s2 = "eeks";

        // Returns the first occurrence of
        // s2 in s1 after index 1
        System.out.println(s1.indexOf(s2));
        int res = s1.compareTo(s2);

        if(res == 0)
            System.out.println("Same");

        if(res > 0)
            System.out.println("s1 is Greater");

        if(res < 0)
            System.out.println("s1 is Smaller");
        // Whether s2 equal to s1
        System.out.println(s1.equals(s2));
        // Whether s2 is present in s1 or not
        // true
        System.out.println(s1.contains(s2));




        // Creating two string literals
        String s3 = "geeks";
        String s4 = "geeks";

        // Checking if both point to the
        // same object or not
        if(s3 == s4)
            System.out.println("Yes");
        else
            System.out.println("No");

        // Creating a string using
        // new operator
        String s5 = new String("geeks");

        // Checking if both point to the
        // same object or not
        if(s3 == s5)
            System.out.println("Yes");
        else
            System.out.println("No");


        // Creating two string literals
        String s6 = "geeks";
        String s7 = s6;

        // Creates a new object "geeksforgeeks"
        // Now s1 points to this new string
        s6 = s6 + "forgeeks";
        // or
        // s1 = s1.concat("forgeeks");

        System.out.println(s6);

        // Since s2 is still pointing
        // to initial "geeks"
        // and s1 is pointing to a new
        // object "geeksforgeeks"
        System.out.println(s6 == s7);
    }
}
