import java.util.Scanner;

public class Tut2 {

    public static double operation(int x, int y, char op) {
        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return y / x;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter : \n1. to +\n2. to -\n3. to * \n4. to /");
            System.out.println("Enter operator (+,-,*,/)");
            char op = sc.next().charAt(0);
            System.out.println("Enter two numbers");
            int x = sc.nextInt();
            int y = sc.nextInt();
            double result = operation(x, y, op);
            if (result == -1) {
                System.out.println("Invalid operator");
            } else {
                System.out.println("Result is : " + result);
            }

        }
    }
}