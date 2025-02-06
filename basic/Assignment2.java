// 1)	Write a program to find area of triangle.
// 2)	Write a program to find simple interest. 
// 3)	Write a program to implement a command line calculator. (Try for Add sub Mul in same program for 2 digits.) 
// (Hint: Integer.parseInt will be used) For e.g. java calc 20 + 30 Output should be Sum of 20 and 30 is 50.
// 4)	Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.             
// 5)	Create a program that accepts three integers and determines the greatest among them using nested if-else statements. 
// 6)	Create a program that accepts a number (1–7) and displays the corresponding day of the week using a switch statement.                       

class Triangle {
    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            double area = 0;
            double semiPerameter = (side1 + side2 + side3) / 2;
            area = Math.sqrt(
                    semiPerameter * (semiPerameter - side1) * (semiPerameter - side2) * (semiPerameter - side3));
            return area;
        } else {
            System.out.println("Not a valid triangle");
            return -1;
        }

    }
}

public class Assignment2 {

    public static double interestCalc(double principal, double rate, int time) {
        double interest = (principal * rate * time) / 100;
        return interest;
    }

    public static void commandLineCalc(int num1, int num2) {
        System.out.println("Addition is : " + (num1 + num2));
        System.out.println("Subtraction is : " + (num1 - num2));
        System.out.println("Multiplication is : " + (num1 * num2));
        System.out.println("Division is : " + (num1 / num2));
    }

    public String numChecker(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public double largest(double num1, double num2, double num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public String sendWeek(int num) {
        switch (num) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                break;
        }
        return "Invalid num";
    }

    public static void main(String[] args) {
        int nums[];
        nums = new int[2];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        if (args.length != 2) {
            System.out.println("Please enter 3 numbers");
            // System.exit(0);
        }
        // commandLineCalc(nums[0], nums[1]);
        Triangle tr = new Triangle(5, 4, 3);
        System.out.println(tr.area());
        System.out.println(interestCalc(12000,12,1));

    }
}