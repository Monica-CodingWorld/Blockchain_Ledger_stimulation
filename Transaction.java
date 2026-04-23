class Transaction {
    String sender;
    String receiver;
    double amount;

    Transaction(String sender, String receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public String toString() {
        return sender + " -> " + receiver + " : " + amount + " coins";
    }
}