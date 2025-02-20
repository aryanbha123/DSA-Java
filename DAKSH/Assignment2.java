import java.util.Scanner;

public class Assignment2 {

    // a) Check number type (Zero, Positive Even/Odd, Negative Even/Odd)
    public static void a() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) System.out.println("Zero");
        else if (num > 0 && num % 2 == 0) System.out.println("Positive Even");
        else if (num > 0) System.out.println("Positive Odd");
        else if (num % 2 == 0) System.out.println("Negative Even");
        else System.out.println("Negative Odd");
    }

    // b) Print name and age using switch case
    public static void b() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Name: Daksh, Age: 20");
            case 2 -> System.out.println("Name: Puneths, Age: 22");
            case 3 -> System.out.println("Name: Ayush, Age: 25");
            default -> System.out.println("Invalid choice");
        }
    }

    // c) Check if a number is prime
    public static void c() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = num > 1;

        for (int i = 2; i <= Math.sqrt(num) && isPrime; i++) {
            if (num % i == 0) isPrime = false;
        }

        System.out.println(num + (isPrime ? " is" : " is not") + " a prime number.");
    }

    // d) Sum of digits
    public static void d() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }

    // e) Check if a number is palindrome
    public static void e() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), original = num, reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        System.out.println(original + (original == reversed ? " is" : " is not") + " a palindrome.");
    }

    // f) Factorial of a number
    public static void f() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= num; i++) fact *= i;

        System.out.println("Factorial: " + fact);
    }

    // g) Fibonacci series
    public static void g() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt(), a = 0, b = 1;

        System.out.print("Fibonacci: " + a + " " + b);
        for (int i = 2; i < terms; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // h) Read numbers until 0 and print sum, avg, max, min
    public static void h() {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, num;

        System.out.println("Enter numbers (0 to stop):");
        while ((num = sc.nextInt()) != 0) {
            sum += num;
            count++;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        if (count > 0) {
            System.out.println("Sum: " + sum);
            System.out.println("Avg: " + (sum / (double) count));
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        } else System.out.println("No numbers entered.");
    }

    // i) Count positive and negative numbers
    public static void i() {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, num;
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            if (num >= 0) pos++;
            else neg++;
        }
        System.out.println("Positive: " + pos + ", Negative: " + neg);
    }

    // j) Matrix with column sum
    public static void j() {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][4];

        System.out.println("Enter 16 integers:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = sc.nextInt();

        for (int j = 0; j < 4; j++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) sum += matrix[i][j];
            matrix[4][j] = sum;
        }

        System.out.println("Matrix with Column Sums:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Call any method by name, e.g., a(); b(); c();
        a();  // Check number type
        b();  // Print name and age using switch
        c();  // Check prime number
        d();  // Sum of digits
        e();  // Check palindrome
        f();  // Factorial
        g();  // Fibonacci series
        h();  // Read numbers until 0
        i();  // Count positive and negative numbers
        j();  // Matrix with column sum
    }
}
