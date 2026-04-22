# Blockchain Ledger Simulation (Using Advanced Data Structures)
Data Structure Mini project

## 📌 Overview

This project demonstrates a **Blockchain Ledger Simulation** built using core concepts of **advanced data structures such as hashing, linked structures, and tree-based verification mechanisms**. The goal is to simulate how blockchain systems maintain integrity, immutability, and secure transaction storage in a simplified academic environment.

Instead of relying on a full cryptocurrency framework, this project focuses on the **underlying data structure logic** that powers blockchain systems.

---

## 🚀 Features

* 🔗 Blockchain-like linked block structure
* 🔐 Hash-based data integrity (SHA / custom hashing logic)
* 🧾 Transaction ledger simulation
* 🧠 Efficient data handling using arrays / linked lists / hash maps
* 🔍 Tamper detection through hash validation
* ⛓️ Chain verification mechanism
* 📊 Simple visualization of block linkage (optional depending on implementation)

---

## 🏗️ Tech Stack / Concepts Used

* Java / C++ / Python (depending on implementation)
* Object-Oriented Programming (OOP)
* Hashing Techniques
* Linked List (for chain structure)
* Trees (optional for validation / Merkle-like structure)
* Arrays & Dynamic Data Structures

---

## 🧠 Core Idea

Each block in the blockchain contains:

* Transaction data
* Timestamp
* Previous block hash
* Current block hash

The **hashing mechanism ensures that even a small change in data will invalidate the entire chain**, simulating real-world blockchain immutability.

---

## 📦 Project Structure

```
Blockchain-Ledger-Simulation/
│
├── src/
│   ├── Block.java / block.cpp / block.py
│   ├── Blockchain.java
│   ├── HashUtil.java
│   ├── Transaction.java
│   └── Main.java
│
├── README.md
└── docs/
```

---

## ⚙️ How It Works

1. A transaction is created.
2. The transaction is added into a block.
3. Each block stores the hash of the previous block.
4. A new hash is generated using current block data.
5. Blocks are linked together forming a chain.
6. If any block is modified → hash mismatch → chain becomes invalid.

---

## 🔐 Hashing Concept

Hashing ensures data integrity:

* Input: Block data
* Output: Fixed-size hash
* Any modification → completely different hash

This makes blockchain secure and tamper-resistant.

---

## 🧪 Example Output

```
Block 1 -> Hash: abc123
Block 2 -> Hash: def456 (prev: abc123)
Block 3 -> Hash: ghi789 (prev: def456)

Chain Valid: TRUE
```

---

## 📊 Applications

* Understanding blockchain fundamentals
* Academic data structure projects
* Simulation of secure ledger systems
* Foundation for crypto / Web3 development

---

## 🎯 Future Enhancements

* Add Merkle Tree implementation
* GUI visualization of blockchain
* Proof-of-Work simulation
* Distributed node simulation
* Smart contract-like logic

---

## 👩‍💻 Author

Monica
Computer Science Student | AI/ML Enthusiast | DES PUNE UNIVERSITY

---

## 📜 License

This project is for educational purposes. You may modify and use it for learning and academic submissions.

---
⭐ If you like this project, consider starring the repo!


