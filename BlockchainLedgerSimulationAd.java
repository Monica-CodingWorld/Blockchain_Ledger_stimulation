import java.security.MessageDigest;
import java.util.Date;

class Block {
    int index;
    String data;
    String previousHash;
    String hash;
    Block next;
    long timestamp;
    int nonce;

    Block(int index, String data, String previousHash) {
        this.index = index;
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
        this.nonce = 0;

        // Mine block (difficulty = 3)
        this.hash = mineBlock(3);
        this.next = null;
    }

    // SHA-256 Hash
    String generateHash() {
        try {
            String input = index + data + previousHash + timestamp + nonce;

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();

            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Mining
    String mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');

        do {
            nonce++;
            hash = generateHash();
        } while (!hash.substring(0, difficulty).equals(target));

        System.out.println("Block Mined! Hash: " + hash);
        return hash;
    }
}

class Blockchain {

    Block head;

    Blockchain() {
        head = null;
    }

    void addBlock(int index, String data) {

        if (head == null) {
            System.out.println("Creating Genesis Block...");
            head = new Block(index, data, "0");
        } else {
            Block temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            Block newBlock = new Block(index, data, temp.hash);
            temp.next = newBlock;
        }
    }

    void displayBlockchain() {

        Block temp = head;

        while (temp != null) {
            System.out.println("\nBlock Index: " + temp.index);
            System.out.println("Transaction Data: " + temp.data);
            System.out.println("Previous Hash: " + temp.previousHash);
            System.out.println("Current Hash: " + temp.hash);
            System.out.println("Nonce: " + temp.nonce);
            System.out.println("Timestamp: " + new Date(temp.timestamp));
            System.out.println("----------------------------------");

            temp = temp.next;
        }
    }

    void verifyChain() {
        Block temp = head;

        while (temp.next != null) {

            if (!temp.hash.equals(temp.generateHash())) {
                System.out.println("Blockchain is INVALID at Block " + temp.index);
                return;
            }

            // Check link
            if (!temp.next.previousHash.equals(temp.hash)) {
                System.out.println("Blockchain link broken at Block " + temp.index);
                return;
            }

            temp = temp.next;
        }

        System.out.println("\nBlockchain is VALID");
    }
}

public class BlockchainLedgerSimulationAd {

    public static void main(String[] args) {

        Blockchain blockchain = new Blockchain();

        blockchain.addBlock(1, "Monica -> Anu : 10 coins");
        blockchain.addBlock(2, "Anu -> Rahul : 5 coins");
        blockchain.addBlock(3, "Rahul -> Sneha : 2 coins");

        System.out.println("\n===== BLOCKCHAIN LEDGER =====");
        blockchain.displayBlockchain();

        System.out.println("\n===== VERIFICATION =====");
        blockchain.verifyChain();
    }
}