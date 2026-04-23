import java.util.Scanner;

public class BlockchainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Blockchain blockchain = new Blockchain();
        BankDatabase bank = new BankDatabase();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Make Transaction");
            System.out.println("2. View Blockchain");
            System.out.println("3. Verify Blockchain");
            System.out.println("4. Exit\n");
            System.out.print("Select option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Sender Account: ");
                    String sender = sc.next();

                    System.out.print("Enter Receiver Account: ");
                    String receiver = sc.next();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    if (bank.transfer(sender, receiver, amount)) {

                        Transaction tx = new Transaction(sender, receiver, amount);
                        blockchain.addBlock(tx);

                        // Send to other node (P2P simulation)
                        NodeClient.sendTransaction(tx.toString());

                        System.out.println("Transaction Added to Blockchain!");
                    }
                    break;

                case 2:
                    blockchain.displayBlockchain();
                    bank.displayBalances();
                    break;

                case 3:
                    blockchain.verifyChain();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}