import java.util.Scanner;

class Operation {
    int num1;
    int num2;

    Operation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        int ans = num1 + num2; 
        System.out.println("Addition is :  " + ans );
    }

    public void sub() {
        int ans = num2 - num1;
        System.out.println( "Subtarction is : " + ans);
    }

    public void mult() {
        int ans = num2 * num1;
        System.out.println( "Multiplication is : " + ans);
    }

    public void div() {
        int ans = num2 / num1;
        System.out.println("Division is : " + ans);
    }
}

public class Tut3 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter num 1");
        x = sc.nextInt();
        System.out.println("Enter num 2");
        y = sc.nextInt();
        Operation op = new Operation(x, y);
        op.add();
        op.sub();
        op.mult();
        op.div();
    }
}