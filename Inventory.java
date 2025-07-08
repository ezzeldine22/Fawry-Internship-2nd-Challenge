package QuantumBookstore;

import java.time.LocalDate;
import java.util.ArrayList;

public class Inventory {

    ArrayList<Book> books = new ArrayList<>();

    public void Add(Book book) {
        books.add(book);
    }

    public void remove(int num) {
        books.removeIf(b -> LocalDate.now().getYear() - b.get_pub_year() >= num);
    }

    public void Buy(String ISBN, int quantity, String email, String address) {
        Book B = null;

        for (Book b : books) {
            if (b.get_ISBN().equals(ISBN)) {
                B = b;
                break;
            }
        }

        if (B == null) {
            System.out.println("The book is not available.");
        } else {
            B.Buy(ISBN, quantity, email, address);
        }
    }
}
