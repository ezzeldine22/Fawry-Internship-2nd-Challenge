# Quantum Bookstore

Quantum Bookstore is a simple Java-based simulation of an online bookstore.  
It uses Object-Oriented Programming (OOP) principles and supports multiple types of books with different buying behaviors.

---

## Features

- Add books to inventory
- Remove old books based on their publish year
- Buy books based on type:
  - PaperBook: physical books with stock and shipping
  - EBook: digital books sent via email
  - DemoBook: not for sale

---

## Project Structure

```
QuantumBookstore/
├── Book.java
├── paperBook.java
├── EBook.java
├── demoBook.java
├── Inventory.java
└── Testing.java
```

---

## Input Example (from Testing.java)

```java
Inventory Inv = new Inventory();

Book paperBook = new paperBook("ISBN #1", "Fawry", 2018, 200, 10);
Inv.Add(paperBook);

Book eBook = new EBook("ISBN #2", "OOP", 2018, 50, "PDF");
Inv.Add(eBook);

Book demo = new demoBook("ISBN #3", "Algorithms", 2010, 300);
Inv.Add(demo);

Inv.remove(3); // Removes books older than 3 years

Inv.Buy("ISBN #1", 5, "ezzeldinereda@gmail.com", "cairo-201");
Inv.Buy("ISBN #2", 0, "ezzeldinereda@gmail.com", null);
Inv.Buy("ISBN #3", 0, "ezzeldinereda@gmail.com", null);
```

---

## Expected Output

```
Paper book shipped to cairo-201
Total amount: 1000.0

We sent the Book to ur Email at ezzeldinereda@gmail.com 
the total amount is  50.0

Demo books are not for sale !!
```

---

## How to Run

1. Open a terminal in the parent folder of `QuantumBookstore/`
2. Compile all `.java` files:

```bash
javac QuantumBookstore/*.java
```

3. Run the main class:

```bash
java QuantumBookstore.Testing
```

---

## Class Summary

### Book (abstract)
- Base class with ISBN, title, publish year, price
- Abstract method: `Buy(...)`

### paperBook
- Has stock
- Can be shipped if stock is enough

### EBook
- Has a file type (e.g., PDF)
- Sent via email, no stock

### demoBook
- Cannot be bought
- Shows a warning message

### Inventory
- Holds a list of books
- Can add, remove, and buy books by ISBN

