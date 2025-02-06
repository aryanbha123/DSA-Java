import java.util.HashMap;

public class DistinctSubstrings{

    public static long countDistinctSubstrings(String s){
        long count = 0 ;

        int window = 3;
        int n = s.length() /3;
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int i = 1 ; i < n ; i++){
            window = 3 * i;
            for(int k = 0 ; k < window ; k++){
                
            }
            for(int j = window ; j < s.length() ; j++){
                
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "ABACABA";
        System.out.println(countDistinctSubstrings(s));
    }
} 