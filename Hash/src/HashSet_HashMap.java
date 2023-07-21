import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashSet_HashMap {
    public static void main(String[]args)
    {
        HashSet<String> h = new HashSet<String>();


        h.add("gfg");
        h.add("courses");
        h.add("ide");


        System.out.println(h);


        System.out.println(h.contains("ide"));


        Iterator<String> i = h.iterator();

        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }



        System.out.println(h.size());

        h.remove("ide");
        System.out.println(h.size());

        for(String s: h)
        {
            System.out.print(s+" ");
        }



        System.out.println("\n"+h.isEmpty());

        HashMap<String, Integer> m  = new HashMap<>();

        // Add elements to the map
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);

        // Print size and content
        System.out.println(m);
        System.out.println(m.size());

        // Iterating over HashMap
        for(Map.Entry<String, Integer>e : m.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        // Check for a key
        if (m.containsKey("ide"))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Remove key "ide"
        // and returns the associated value 15
        m.remove("ide");
        System.out.println(m.size());
        m.put("ide", 15);

        // Check for a Value
        if (m.containsValue(15))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Get value corresponding to passed key
        // <"ide", 15>
        System.out.println(m.get("ide"));

        // The given key is absent
        System.out.println(m.get("practice"));


    }
}
