// Assignment 4 - Object Oriented Programming Lab

// Task 1: Student Class with Constructors
class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

// Task 2: BankAccount with different access modifiers
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Protected method to withdraw
    protected void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Default-access method to check balance
    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Task 3: Calculator with method overloading
class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Task 4: University class demonstrating static and non-static members
class University {
    static String universityName = "Global University";
    String studentName;

    public University(String studentName) {
        this.studentName = studentName;
    }

    // Static method to display university name
    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
    }
}

// Task 5: Course class using 'this' keyword
class Course {
    String courseName;
    String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + this.courseName + ", Course Code: " + this.courseCode);
    }
}

// Main class to test all functionalities
public class Assignment4 {
    public static void main(String[] args) {
        // Task 1: Student Objects
        System.out.println("TASK 1 : ");

        Student s1 = new Student();
        Student s2 = new Student("Aryan", 21);
        s1.display();
        s2.display();
        System.out.println("TASK 2 : ");

        // Task 2: BankAccount demonstration
        BankAccount account = new BankAccount(5000);
        account.deposit(2000);
        account.withdraw(1500);
        account.checkBalance();

        // Task 3: Calculator method overloading
        System.out.println("TASK 3 : ");
        
        Calculator calc = new Calculator();
        System.out.println("Sum (int, int): " + calc.add(5, 10));
        System.out.println("Sum (double, double): " + calc.add(5.5, 2.3));
        System.out.println("Sum (int, int, int): " + calc.add(1, 2, 3));

        // Task 4: Static & Non-Static demonstration
        System.out.println("TASK 4 : ");
        University.displayUniversityName();
        University student1 = new University("Rahul");
        University student2 = new University("Priya");
        student1.displayStudentInfo();
        student2.displayStudentInfo();

        System.out.println("TASK 5 : ");

        // Task 5: Course class using 'this' keyword
        Course course = new Course("Java Programming", "CS101");
        course.displayCourse();
    }
}
