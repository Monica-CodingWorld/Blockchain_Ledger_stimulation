# 🔗 Blockchain Ledger Simulation

A **Blockchain-based Ledger Simulation System** that demonstrates how secure, tamper-proof transactions are recorded using **hashing, proof-of-work mining, and linked data structures**.

This project simulates a **real-world financial transaction system** integrated with:

* 🏦 Bank account validation
* ⛏ Proof-of-Work mining
* 🔗 Immutable blockchain structure
* 🌐 Basic Peer-to-Peer (P2P) communication

---

## 🔐 Hashing Concept

Hashing ensures data integrity:

* Input: Block data
* Output: Fixed-size hash
* Any modification → completely different hash

This makes blockchain secure and tamper-resistant.

---

## 🧠 Core Idea

Each block in the blockchain contains:

* Transaction data
* Timestamp
* Previous block hash
* Current block hash

The **hashing mechanism ensures that even a small change in data will invalidate the entire chain**, simulating real-world blockchain immutability.

---

## 🚀 Features

* 🔐 **SHA-256 Hashing** for secure block generation
* ⛏ **Proof-of-Work Mining** (difficulty-based)
* 🔗 **Linked List Blockchain Structure**
* 🧾 **Transaction Management System**
* 🏦 **Bank Database Simulation** (account verification & balance updates)
* 🌐 **P2P Communication using Sockets**
* ✅ **Blockchain Integrity Verification**
* 💻 **Interactive Console-based UI**

---

## 🧠 How It Works

1. User initiates a transaction (sender → receiver, amount)
2. System verifies:

   * Account existence
   * Sufficient balance
3. Transaction is converted into a **block**
4. Block undergoes **mining (Proof-of-Work)**
5. Block is added to the **blockchain**
6. Transaction is optionally broadcasted to other nodes (P2P)
7. Blockchain integrity can be verified anytime

---

## 📁 Project Structure

```
Blockchain-Ledger-Simulation/
│
├── src/
│   ├── Block.java          # Block structure with hashing & mining
│   ├── Blockchain.java     # Blockchain logic (add, verify, display)
│   ├── Transaction.java    # Transaction model
│   ├── BankDatabase.java   # Account validation & balance handling
│   ├── NodeClient.java     # P2P sender (optional)
│   ├── NodeServer.java     # P2P receiver (optional)
│   └── BlockchainApp.java  # Main driver (user interaction)
│
├── README.md
└── docs/
```

---

## ⚙️ Technologies Used

* **Java**
* **Data Structures (Linked List)**
* **Cryptography (SHA-256)**
* **Socket Programming (P2P Simulation)**

---

## ▶️ How to Run

### 1️⃣ Compile the project

```
javac *.java
```

### 2️⃣ Run the application

```
java BlockchainApp
```

### 3️⃣ (Optional) Run P2P Node

In a separate terminal:

```
java NodeServer
```

---

## 📸 Sample Output

```
Creating Genesis Block...
⛏ Block Mined! Hash: 000768720865fc33...

Transaction Added to Blockchain!

--- Blockchain Ledger ---
Block Index: 1
Transaction: A101 -> A102 : 1000 coins

Blockchain is VALID
```

---

## 🔍 Key Concepts Demonstrated

* Blockchain fundamentals
* Hash-based immutability
* Proof-of-Work consensus
* Transaction validation
* Distributed communication (basic simulation)

---

## 🚧 Future Enhancements

* 🔐 Digital Signatures for secure authentication
* 🗄 Integration with MySQL database
* 🌍 Multi-node blockchain synchronization
* 🎨 GUI (JavaFX / Web Interface)
* 🧠 AI-based fraud detection

---

## 👩‍💻 Author

Monica
Computer Science Student | AI/ML Enthusiast | DES PUNE UNIVERSITY

---

## 📜 License

This project is for educational purposes.

---
⭐ If you like this project, consider starring the repo!


