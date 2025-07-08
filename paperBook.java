package QuantumBookstore;

public class paperBook extends Book {
    int stock;

    public paperBook(String ISBN, String title, int publish_year, double price, int stock) {
        super(ISBN, title, publish_year, price);
        this.stock = stock;
    }

    public void Buy(String ISBN, int quantity, String email, String address) {
        if (this.stock >= quantity) {
            System.out.println("Paper book shipped to " + address +
                    "\nTotal amount: " + (this.get_price() * quantity));
            this.stock -= quantity;
        } else {
            System.out.println(" Not enough stock for ISBN " + ISBN);
        }
    }
}
