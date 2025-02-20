import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate the area of a triangle
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);

        // Convert a number (0-9) to a character
        System.out.print("Enter a number (0-9) to convert to a character: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 9) {
            char character = (char) (number + '0'); // Convert number to character
            System.out.println("The character representation is: " + character);
        } else {
            System.out.println("Invalid input! Please enter a number between 0 and 9.");
        }

        scanner.close();
    }
}
