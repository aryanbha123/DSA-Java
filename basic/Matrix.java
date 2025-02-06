import java.util.HashSet;

public class Matrix {

    public static void main(String[] args) {
        int []mat = new int[]{
            1,2,3,4,5
        };
        int[] mat2 = new int[mat.length];
        for(int i = 0 ; i  < mat2.length ; i++){
            mat2[i] = mat[i];
        }
        HashSet<Integer> s = new HashSet<>();
        s.isEmpty();

        mat2[0] = 999;
        System.out.println(mat2[0]);
        System.out.println(mat[0]);
    }
}