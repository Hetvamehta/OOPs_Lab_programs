import java.util.Scanner;

class Payment {
    public void processPayment(int amount) {
        System.out.println("Processing general payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done Using Credit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

public class OnlinePaymentApp {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Online Payment System ---");
        System.out.println("1. Credit Card Payment");
        System.out.println("2. UPI Payment");
        System.out.print("Select payment method (1/2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();

        Payment payment;

        if (choice == 1) {
            payment = new CreditCardPayment();
            payment.processPayment(amount);
        } else if (choice == 2) {
            payment = new UPIPayment();
            payment.processPayment(amount);
        } else {
            System.out.println("Invalid selection. Please try again.");
        }

        scanner.close();
    }
}