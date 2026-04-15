import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    protected int orderId;
    protected String itemName;
    protected int quantity;
    protected boolean isCancelled;

    @Override
    public void placeOrder(String item, int qty) {
        this.orderId = (int) (Math.random() * 10000);
        this.itemName = item;
        this.quantity = qty;
        this.isCancelled = false;
        System.out.println("\n✅ Order placed successfully!");
        System.out.println("📦 Order ID: " + this.orderId);
    }
}

class FinalOrder extends PartialOrder {
    private static final double PRICE_PER_UNIT = 25.50; 

    @Override
    public void cancelOrder(int inputOrderId) {
        if (this.orderId == inputOrderId) {
            this.isCancelled = true;
            System.out.println("\n🚫 Order ID " + this.orderId + " has been cancelled.");
        } else {
            System.out.println("\n❌ Error: Invalid Order ID provided.");
        }
    }

    @Override
    public void generateBill() {
        if (this.isCancelled) {
            System.out.println("\n⚠️ Cannot generate a bill for a cancelled order.");
            return;
        }
        
        double totalAmount = this.quantity * PRICE_PER_UNIT;
        
        System.out.println("\n=============================");
        System.out.println("          INVOICE            ");
        System.out.println("=============================");
        System.out.println("Order ID     : " + this.orderId);
        System.out.println("Item Name    : " + this.itemName);
        System.out.println("Quantity     : " + this.quantity);
        System.out.println("Unit Price   : $" + PRICE_PER_UNIT);
        System.out.println("-----------------------------");
        System.out.println("Total Amount : $" + String.format("%.2f", totalAmount));
        System.out.println("=============================\n");
    }
}

public class OnlineOrderSystem {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        Scanner scanner = new Scanner(System.in);
        FinalOrder myOrder = new FinalOrder();

        System.out.println("--- Welcome to the Online Order System ---");
        
        System.out.print("Enter the item you want to order: ");
        String item = scanner.nextLine();
        
        System.out.print("Enter the quantity: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid number for quantity: ");
            scanner.next(); 
        }
        int qty = scanner.nextInt();

        myOrder.placeOrder(item, qty);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nWhat would you like to do next?");
            System.out.println("1. Generate Bill");
            System.out.println("2. Cancel Order");
            System.out.println("3. Exit System");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myOrder.generateBill();
                    exit = true; 
                    break;
                case 2:
                    System.out.print("Please enter your Order ID to confirm cancellation: ");
                    int idToCancel = scanner.nextInt();
                    myOrder.cancelOrder(idToCancel);
                    exit = true; 
                    break;
                case 3:
                    System.out.println("Exiting the system. Thank you!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}