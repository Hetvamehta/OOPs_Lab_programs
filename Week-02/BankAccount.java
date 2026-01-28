class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }

    static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean found = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("Account Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account with ID " + searchId + " not found.");
        }
    }

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
        }

        accounts[0].assignValues("ACC001", "Amit Sharma", 5000.0);
        accounts[1].assignValues("ACC002", "Rahul Verma", 12000.50);
        accounts[2].assignValues("ACC003", "Priya Patel", 7500.0);
        accounts[3].assignValues("ACC004", "Sneha Singh", 3000.25);
        accounts[4].assignValues("ACC005", "Vikram Das", 15000.0);

        System.out.println("--- All Account Details ---");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }

        System.out.println("--- Search Results ---");
        searchAccount(accounts, "ACC003");
        searchAccount(accounts, "ACC010");
    }
}