import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    private String accountHolderName;
    private BigDecimal balance;
    private static BigDecimal interestRate = new BigDecimal("0.03");

    public BankAccount(String accountHolderName, BigDecimal initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public BigDecimal calculateInterest() {
        return this.balance.multiply(interestRate).setScale(2, RoundingMode.HALF_UP);
    }

    public void displayInterestEarned() {
        BigDecimal interest = calculateInterest();
        System.out.printf("Account: %s | Interest Earned: $%s%n", this.accountHolderName, interest.toPlainString());
    }

    public static void updateInterestRate(BigDecimal newRate) {
        interestRate = newRate;
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        BankAccount account1 = new BankAccount("Alice Smith", new BigDecimal("1000.00"));
        account1.displayInterestEarned();

        BankAccount.updateInterestRate(new BigDecimal("0.05"));

        BankAccount account2 = new BankAccount("Bob Jones", new BigDecimal("1000.00"));
        account2.displayInterestEarned();
        
        account1.displayInterestEarned();
    }
}