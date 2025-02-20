
import java.util.HashMap; // yha se aai

// 3. Count the frequency of each character in a string and store in hashMap
public class Tut3 {
    public static void main(String[] args) {

        /* map : { key:val } */
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 1); // to add a key val
        map.containsKey(1); // to check a particular key exist in a map
        map.get(1); // to get the value of key

        int[] arr = { 1, 2, 3, 3, 3, 4 };
        /*
         * {
         * 1:1,
         * 2:1,
         * 3:1+1+1,
         * 4:1
         * }
         */

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (map.containsKey(key)) {
                int val = map.get(key);
                int newVal = val + 1;
                map.put(key, newVal);
            } else {
                map.put(key, 1);
            }
        }

        // foreach loop : new concept for you 
        // there are 4 types of loops in java 
        for (int key : map.keySet()) {
            int val = map.get(key);
            System.out.println(key + " : " + val);
        }
        // two sum

        /*
         * 
         * {
         * 1:1,
         * 2:1,
         * 3:1+1+1,
         * 5:1
         * }
         */

        // System.out.println(nityasmap.size()); // to get the size of the map
        // nityasmap.put(1,2); // we inserted a key
        // // System.out.println(nityasmap.size());
        // if(nityasmap.containsKey(1)){
        // System.out.println("Yes");
        // }else{
        // System.out.println("No");
        // }
        // System.out.println(nityasmap.get(2));

        // int[] nitya = { 1, 2, 3, 3, 3, 5 };
        // int n = nitya.length;
        // HashMap<Integer, Integer> nityasmap = new HashMap<>(); // yhi hai jo hai
        // for (int i = 0; i < n; i++) {
        // int key = nitya[i];
        // if (nityasmap.containsKey(key)) {
        // int val = nityasmap.get(key) + 1;
        // nityasmap.put(key, val);
        // } else {
        // nityasmap.put(key, 1);
        // }
        // }
        // // foreach loop
        // for(int key : nityasmap.keySet()){
        // int val = nityasmap.get(key);
        // System.out.println(key + " : " + val);
        // }
    }

}
