# Fawry-Internship-Second-Task-Book-Store-System


Welcome to **Quantum Bookstore** — a console-based simulation of an online bookstore designed as part of the Fawry Full Stack Internship technical task.

This system demonstrates **object-oriented design**, proper **inheritance and polymorphism**, and a flexible, extensible structure to handle different types of books and their delivery logic.

---

## 📌 Features

- ✅ Add books with unique ISBNs to inventory
- 🚫 Reject duplicate ISBNs
- ⏳ Filter out books older than 10 years and move them to a separate collection
- 💳 Simulate buying books with custom delivery logic depending on book type
- 🚚 Ship paper books to physical addresses
- 📧 Send eBooks via email
- 👀 Mark demo books as not for sale
- 📦 Stock management for paper books

---

## 🏗️ Design Overview

### Book Types
- **PaperBook**: Has stock and requires a shipping address
- **Ebook**: Delivered via email
- **DemoBook**: Not available for purchase

### Main Classes
| Class | Description |
|-------|-------------|
| `Book` | Abstract base class with shared attributes (ISBN, title, year, etc.) |
| `PaperBook`, `Ebook`, `DemoBook` | Extend `Book`, override the `deliver()` method |
| `Inventory` | Holds books, manages stock, adds/removes books |
| `DeliverData` | Wrapper for email or shipping address |
| `Logging` | Unified logging with "Quantum Book Store" prefix |
| `QuantumBookstoreFullTest` | Demo class with working test cases |

---

## 📂 Folder Structure
src/
└── Main/
├── Book.java
├── PaperBook.java
├── Ebook.java
├── DemoBook.java
├── Inventory.java
├── DeliverData.java
├── Logging.java
└── QuantumBookstoreFullTest.java

---

## 🔧 How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/YOUR_USERNAME/YOUR_REPO_NAME.git
   cd YOUR_REPO_NAME```
2. Open the project in IntelliJ IDEA or any Java IDE

3. Run the QuantumBookstoreFullTest class — it includes pre-defined test cases
```
Quantum Book Store: Book has been added to inventory
Quantum Book Store: 10 years or more have passed since publish year , Book has been added to Old Books inventory
Quantum Book Store: there is already a book with the same ISBN
Quantum Book Store: Book has been shipped to address :Cairo
Quantum Book Store: Book is out of stock
Quantum Book Store: this book dose not exist
```

## secreenshoots from the app

![image](https://github.com/user-attachments/assets/81ff24a7-d91a-4715-9359-95989ddc6ac0)





