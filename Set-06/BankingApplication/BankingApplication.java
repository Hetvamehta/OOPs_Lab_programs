class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    private static final double MIN_BALANCE = 1000.00;

    public BankAccount() {
        this.balance = 1000.00;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > (balance - MIN_BALANCE)) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        BankAccount account = new BankAccount();

        account.deposit(1000.00);

        try {
            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
