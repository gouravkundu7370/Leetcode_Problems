import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DecodeHuffmanData {
    static HashMap<Character, String> codes = new HashMap<>();
    static HashMap<Character, Integer> freq = new HashMap<>();
    static class MinHeapNode
    {
        char data;
        int freq;
        MinHeapNode left, right, top;
        MinHeapNode(char c, int freq)
        {
            left = right = null;
            this.data = c;
            this.freq = freq;
        }
    }
    static class MyComparator implements Comparator<MinHeapNode> {
        public int compare(MinHeapNode x, MinHeapNode y)
        {

            return x.freq - y.freq;
        }
    }
    static String decodeHuffmanData(MinHeapNode root, String binaryString)
    {

        // add your code here
        StringBuilder result = new StringBuilder();
        MinHeapNode current = root;

        for (int i = 0; i < binaryString.length(); i++) {
            char bit = binaryString.charAt(i);
            if (bit == '0') {
                current = current.left;
            } else {
                current = current.right;
            }

            if (current.data != '$') {
                result.append(current.data);
                current = root;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            String str = read.readLine();
            StringBuilder encodedString = new StringBuilder();
            String decodedString="";
            calcFreq(str, str.length());
            HuffmanCodes(str.length());
            for (int i = 0; i < str.length(); i++)
                encodedString.append(codes.get(str.charAt(i)));
            //cout<<encodedString<<endl;
            decodedString = decodeHuffmanData(minHeap.peek(), encodedString.toString());
            System.out.println(decodedString);
        }
    }
    static void calcFreq(String str, int n)
    {
        for (int i=0; i<str.length(); i++)
        {
            char key = str.charAt(i);
            if(freq.containsKey(key))
            {
                int fq = freq.get(key);
                freq.put(key, fq+1);
            }else freq.put(key, 1);
        }
    }

    // creating a priority queue q.
    // makes a min-priority queue(min-heap).
    static PriorityQueue<MinHeapNode> minHeap
            = new PriorityQueue<MinHeapNode>(new MyComparator());

    static void HuffmanCodes(int size)
    {
        MinHeapNode left, right, top;
        // 	for (map<char, int>::iterator v=freq.begin(); v!=freq.end(); v++)
        // 		minHeap.push(new MinHeapNode(v->first, v->second));
        for(Map.Entry<Character, Integer> hm: freq.entrySet())
        {
            char ch = hm.getKey();
            int val = hm.getValue();
            minHeap.add(new MinHeapNode(ch, val));
        }
        while (minHeap.size() != 1)
        {
            left = minHeap.peek();
            minHeap.poll();
            right = minHeap.peek();
            minHeap.poll();
            top = new MinHeapNode('$', left.freq + right.freq);
            top.left = left;
            top.right = right;
            minHeap.add(top);
        }
        storeCodes(minHeap.peek(), "");
    }

    static void storeCodes(MinHeapNode root, String str)
    {
        if (root==null)
            return;
        if (root.data != '$')
            codes.put(root.data, str);
        storeCodes(root.left, str + "0");
        storeCodes(root.right, str + "1");
    }
}
