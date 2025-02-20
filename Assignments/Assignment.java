import java.util.Scanner;

// 1. Demonstrating private member in superclass
class SuperClass {
    private int privateVar = 10; 

    public int getPrivateVar() {
        return privateVar; 
    }
}

class SubClass extends SuperClass {
    void show() {
        System.out.println("Private variable accessed using method: " + getPrivateVar());
    }
}

// 2. Player Class and Subclasses
class Player {
    String name;
    int age;
    String position;

    Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    void play() {
        System.out.println(name + " is playing.");
    }

    void train() {
        System.out.println(name + " is training.");
    }
}

class Cricket_Player extends Player {
    Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is batting/bowling in cricket.");
    }
}

class Football_Player extends Player {
    Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is playing as a " + position + " in football.");
    }
}

class Hockey_Player extends Player {
    Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is playing hockey in position: " + position);
    }
}

// 3. Worker and Subclasses
class Worker {
    String name;
    double salaryRate;

    Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    double computePay(int hours) {
        return hours * salaryRate;
    }
}

class DailyWorker extends Worker {
    DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        int days = hours / 8;
        return days * salaryRate;
    }
}

class SalariedWorker extends Worker {
    SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        return 40 * salaryRate;
    }
}

// 4. Trunk Call Charges
class TrunkCall {
    double duration;

    TrunkCall(double duration) {
        this.duration = duration;
    }

    double calculateCharge() {
        return 0;
    }
}

class OrdinaryCall extends TrunkCall {
    OrdinaryCall(double duration) {
        super(duration);
    }

    @Override
    double calculateCharge() {
        return duration * 1.5;
    }
}

class UrgentCall extends TrunkCall {
    UrgentCall(double duration) {
        super(duration);
    }

    @Override
    double calculateCharge() {
        return duration * 2.5;
    }
}

class LightningCall extends TrunkCall {
    LightningCall(double duration) {
        super(duration);
    }

    @Override
    double calculateCharge() {
        return duration * 4.0;
    }
}

// 5. Employee and Manager
class Employee {
    String name;
    int empid;
    double salary;

    Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    String getDepartment() {
        return department;
    }
}

public class Assignment {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.show();

        System.out.println("\n=== 2. Player Demonstration ===");
        Cricket_Player cp = new Cricket_Player("Virat Kohli", 35, "Batsman");
        Football_Player fp = new Football_Player("Lionel Messi", 36, "Forward");
        Hockey_Player hp = new Hockey_Player("Manpreet Singh", 33, "Midfielder");

        cp.play();
        fp.play();
        hp.play();

        System.out.println("\n=== 3. Worker Salary Calculation ===");
        Worker dw = new DailyWorker("John", 500);
        Worker sw = new SalariedWorker("Alice", 1000);

        System.out.println("Daily Worker Pay (40 hours): ₹" + dw.computePay(40));
        System.out.println("Salaried Worker Pay (40 hours): ₹" + sw.computePay(40));

        System.out.println("\n=== 4. Trunk Call Charges ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter call duration (in minutes): ");
        double duration = sc.nextDouble();

        System.out.print("Enter type of call (Ordinary, Urgent, Lightning): ");
        String type = sc.next();

        TrunkCall call;
        switch (type.toLowerCase()) {
            case "ordinary":
                call = new OrdinaryCall(duration);
                break;
            case "urgent":
                call = new UrgentCall(duration);
                break;
            case "lightning":
                call = new LightningCall(duration);
                break;
            default:
                System.out.println("Invalid type. Exiting...");
                sc.close();
                return;
        }

        System.out.println("Total charge: ₹" + call.calculateCharge());

        System.out.println("\n=== 5. Employee & Manager ===");
        Employee e1 = new Employee("John Doe", 101, 50000);
        Manager m1 = new Manager("Alice Smith", 102, 70000, "HR");

        System.out.println("Employee: " + e1.getName() + ", Salary: ₹" + e1.getSalary());
        System.out.println("Manager: " + m1.getName() + ", Department: " + m1.getDepartment() + ", Salary: ₹" + m1.getSalary());

        e1.increaseSalary(10);
        m1.increaseSalary(15);

        System.out.println("After Salary Increase:");
        System.out.println("Employee Salary: ₹" + e1.getSalary());
        System.out.println("Manager Salary: ₹" + m1.getSalary());

        sc.close();
    }
}
