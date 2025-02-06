package learning;

public class Demo {
    //  [1,23,4,]
    // ["1","2","Nitya"]

    public static void calc(int num1 , int mum2){
        int sum = num1 + mum2;
        System.out.println(sum);
    }

    // typecasting 
    // parInt : converts any datatype other than integer to integer 
    public static void main(String[] args) {
        
       calc(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}
