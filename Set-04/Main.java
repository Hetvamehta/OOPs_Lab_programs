public class Main {
    public static void main(String[] args) {
        System.out.println("Hetva-25");

        SavingAccount savings = new SavingAccount("SA-101", "Alice", 1000.0, 0.04);
        savings.openAccount();
        savings.deposit(500.0);
        savings.calculateInterest();

        System.out.println("------------------------------");

        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD-202", "Bob", 5000.0, 0.07, 3);
        fixedDeposit.openAccount();
        fixedDeposit.maturityAmount();
    }
}

class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void openAccount() {
        System.out.println("Account successfully opened for " + accountHolderName + ".");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double checkBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
        return balance;
    }
}

class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        double interest = balance * interestRate;
        System.out.printf("Calculated Interest: $%.2f%n", interest);
        return interest;
    }
}

class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int termYears;

    public FixedDepositAccount(String accountNumber, String accountHolderName, double balance, double interestRate, int termYears) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
        this.termYears = termYears;
    }

    public double maturityAmount() {
        double amount = balance * Math.pow((1 + interestRate), termYears);
        System.out.printf("Maturity Amount after %d years: $%.2f%n", termYears, amount);
        return amount;
    }
}