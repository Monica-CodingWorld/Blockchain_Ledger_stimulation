class Blockchain {

    Block head;

    Blockchain() {
        head = null;
    }

    public void addBlock(Transaction tx) {

        String data = tx.toString();

        if (head == null) {
            System.out.println("Creating Genesis Block...");
            head = new Block(1, data, "0");
        } else {
            Block temp = head;
            int index = 1;

            while (temp.next != null) {
                temp = temp.next;
                index++;
            }

            Block newBlock = new Block(index + 1, data, temp.hash);
            temp.next = newBlock;
        }
    }

    public void displayBlockchain() {

        Block temp = head;

        while (temp != null) {
            System.out.println("\nBlock Index: " + temp.index);
            System.out.println("Transaction Data: " + temp.data);
            System.out.println("Previous Hash: " + temp.previousHash);
            System.out.println("Current Hash: " + temp.hash);
            System.out.println("Nonce: " + temp.nonce);
            System.out.println("Timestamp: " + new java.util.Date(temp.timestamp));
            System.out.println("----------------------------------");

            temp = temp.next;
        }
    }

    public void verifyChain() {
        Block temp = head;

        while (temp.next != null) {

            if (!temp.hash.equals(temp.generateHash())) {
                System.out.println(" Blockchain INVALID at Block " + temp.index);
                return;
            }

            if (!temp.next.previousHash.equals(temp.hash)) {
                System.out.println(" Chain Broken at Block " + temp.index);
                return;
            }

            temp = temp.next;
        }

        System.out.println("\n Blockchain is VALID");
    }

}