
class Student {
    int age;
    String name;

    Student() {
        this.name = "Aryan";
        this.age = 19;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class BankAccount {
    private double balance;

    BankAccount() {
        this.balance = 0;
    }

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    protected void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            this.balance -= amount;
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + this.balance);
    }
}

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class University {
    static String universityName = "UPES";
    String studentName;

    University(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }
}

public class Main {
    public static void main(String[] args) {
      

        University.displayUniversityName();
        University student1 = new University("Daksh");
        University student2 = new University("Ayush");
        student1.displayStudent();
        student2.displayStudent();

    }
}
