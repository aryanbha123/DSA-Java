// Encapsulation and Abstraction
// package OOPS;
class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("BankAccount(owner=%s, balance=$%.2f)", owner, balance);
    }
}

// Inheritance
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String owner, double balance, double interestRate) {
        super(owner, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.printf("Added interest: $%.2f%n", interest);
    }
}

// Polymorphism
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String owner, double balance, double overdraftLimit) {
        super(owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("Alice", 1000);
        System.out.println(account1);
        account1.deposit(500);
        account1.withdraw(200);
        System.out.println(account1);

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("Bob", 1000, 0.02);
        System.out.println(savingsAccount);
        savingsAccount.addInterest();
        System.out.println(savingsAccount);

        // Creating a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("Charlie", 500, 200);
        System.out.println(checkingAccount);
        checkingAccount.withdraw(600);
        System.out.println(checkingAccount);
    }
}
