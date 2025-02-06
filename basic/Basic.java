class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(){
        
    }
    public BankAccount(String Owner, double balance) {
        this.accountHolderName = Owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount{
    private double interestRate;
}
public class Basic {
    public static void main(String[] args) {
        System.out.println("Code begins");
        BankAccount account = new BankAccount("Aryan, Doe", 1000);

    }
}
