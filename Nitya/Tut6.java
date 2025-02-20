import java.util.HashMap;

public class Tut6 {
    public static void main(String[] args) {
        /*
         * 
         * {
         *  N:1,
         *  i:1,
         *  t:1,
         *  y:1,
         *  a:2,
         *  R:1,
         *   
         * }
         * 
         */
        String name = "NityaRajpal"; // done  character array
        HashMap<Character,Integer> freqMap = new HashMap<>(); // initialising map
        for(int i = 0 ; i < name.length(); i++){
            char temp = name.charAt(i); // name[i] -> name.charAt(index) // done ?????
            if(freqMap.containsKey(temp)){
                int val = freqMap.get(temp) + 1; // ye kya hai ???
                freqMap.put(temp, val);
            }else{
                freqMap.put(temp, 1);
            }
        }

        for(char key : freqMap.keySet()){
            int val = freqMap.get(key);
            System.out.println(key + " " + val);
        }

    }
}
