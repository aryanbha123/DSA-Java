import java.util.ArrayList;
import java.util.List;

public class HappyString {
    public char[] ch = {'a', 'b', 'c'};
    public List<String> ls;
    StringBuilder sh;

    private void solve(int n, Character temp) {
        if (n == 0) {
            ls.add(sh.toString());  // Store in list instead of printing
            // System.out.println(sh);
            return;
        }
        for (char c : ch) {
            if (temp == null || temp != c) {  // Ensure no consecutive characters are the same
                sh.append(c);
                solve(n - 1, c);
                sh.deleteCharAt(sh.length() - 1);  // Remove last added character
            }
        }
    }

    private String getHappyString(int n, int k) {
        ls = new ArrayList<>();
        sh = new StringBuilder();
        solve(n, null);  // Start recursion with n instead of n-1
        return k < ls.size() ?ls.get(k - 1) : "";
    }

    public static void main(String[] args) {
        HappyString str = new HappyString();
        System.out.println();
        System.out.println(str.getHappyString(3, 9));  // Expected output: 'cab'
    }
}
