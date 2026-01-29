import java.util.Scanner;

class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalBill = itemTotal - discount;
        System.out.println("Final Bill Amount: " + finalBill);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double discountAmount = (itemTotal * discountPercent) / 100;
        double finalBill = itemTotal - discountAmount;
        System.out.println("Final Bill Amount: " + finalBill);
    }

    public static void main(String[] args) {
        BillGenerator bg = new BillGenerator();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Item Total: ");
            int total = sc.nextInt();

            System.out.println("Select Customer Type:");
            System.out.println("1. Regular Customer");
            System.out.println("2. Privileged Customer");
            System.out.println("3. Festive Offer");
            int choice = sc.nextInt();

            if (choice == 1) {
                bg.generateBill(total);
            } else if (choice == 2) {
                System.out.print("Enter Flat Discount: ");
                int flatDisc = sc.nextInt();
                bg.generateBill(total, flatDisc);
            } else if (choice == 3) {
                System.out.print("Enter Discount Percentage: ");
                double percDisc = sc.nextDouble();
                bg.generateBill(total, percDisc);
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}