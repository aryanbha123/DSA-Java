import java.util.Scanner;

public class Assignment1 {
    
    static class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello World");
        }
    }

    static class DisplayNameAddress {
        public static void main(String[] args) {
            System.out.println("Name: Aryan Bhandari");
            System.out.println("Address: Dehradun, Uttarakhand, India");
        }
    }

    static class GradeSheet {
        public static void main(String[] args) {
            System.out.println("*******************************");
            System.out.println("*        Grade Sheet          *");
            System.out.println("*******************************");
            System.out.println("* Name  : Aryan Bhandari      *");
            System.out.println("* SAP ID: 500123456           *");
            System.out.println("* Result: Pass                *");
            System.out.println("*******************************");
        }
    }
    static class EvenOdd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num % 2 == 0)
                System.out.println(num + " is Even");
            else
                System.out.println(num + " is Odd");

            sc.close();
        }
    }

    static class Factorial {
        public static void main(String[] args) {
            int n = 45;

            long  factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}
