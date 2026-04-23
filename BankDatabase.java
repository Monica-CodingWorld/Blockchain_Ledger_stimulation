import java.util.HashMap;

class BankDatabase {

    HashMap<String, Double> accounts = new HashMap<>();

    BankDatabase() {
        accounts.put("A101", 1000.0);
        accounts.put("A102", 800.0);
        accounts.put("A103", 500.0);
    }

    boolean accountExists(String accNo) {
        return accounts.containsKey(accNo);
    }

    boolean transfer(String sender, String receiver, double amount) {

        if (!accountExists(sender) || !accountExists(receiver)) {
            System.out.println("Account not found! Please check account number.");
            return false;
        }

        if (accounts.get(sender) < amount) {
            System.out.println("Insufficient balance!");
            return false;
        }

        accounts.put(sender, accounts.get(sender) - amount);
        accounts.put(receiver, accounts.get(receiver) + amount);

        System.out.println("Transaction Successful!");

        return true;
    }

    void displayBalances() {
        System.out.println("\n--- Bank Balances ---");
        for (String acc : accounts.keySet()) {
            System.out.println(acc + " : " + accounts.get(acc));
        }
    }
}