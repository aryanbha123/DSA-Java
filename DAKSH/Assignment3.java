import java.util.Scanner;

public class Assignment3 {

    // Task 1: Sum of integers divisible by both 6 and 9 between 10 and 950
    public static int sumDivisibleBy6And9() {
        int sum = 0;
        for (int i = 10; i <= 950; i++) {
            if (i % 6 == 0 && i % 9 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Task 2: Sum of digits of an integer
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Task 3: Fibonacci series up to N terms
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Task 4: Count and display prime numbers between 1 and 1000
    public static int countPrimes() {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Task 5: Count occurrences of a number in an array
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    // Task 6: Find the second largest element without sorting
    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    // Task 7: Print the given pattern
    public static void printPattern() {
        int[] patternRows = {1, 3, 5, 7, 9};

        for (int i = 0; i < patternRows.length; i++) {
            for (int j = 0; j < patternRows[i]; j++) {
                if (i % 2 == 0) {
                    System.out.print("? ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.println("Sum of numbers divisible by both 6 and 9 between 10 and 950: " + sumDivisibleBy6And9());

        // Task 2
        System.out.print("Enter a number to find sum of its digits: ");
        int num = scanner.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(num));

        // Task 3
        System.out.print("Enter the number of Fibonacci terms to display: ");
        int n = scanner.nextInt();
        fibonacciSeries(n);

        // Task 4
        System.out.println("Total number of prime numbers between 1 and 1000: " + countPrimes());

        // Task 5
        int[] arr = {2, 3, 2, 5, 2, 6};
        int target = 2;
        System.out.println("The number " + target + " appears " + countOccurrences(arr, target) + " times in the array.");

        // Task 6
        int[] array = {10, 20, 5, 15, 30, 25};
        System.out.println("Second largest element: " + secondLargest(array));

        // Task 7
        System.out.println("\nPattern:");
        printPattern();

        scanner.close();
    }
}
