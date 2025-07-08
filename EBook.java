package QuantumBookstore;

public class EBook extends Book {
    String file_type;

    public EBook(String ISBN, String title, int publish_year, double price, String file_type) {
        super(ISBN, title, publish_year, price);
        this.file_type = file_type;

    }


    public void Buy(String ISBN, int quantity, String email, String address) {
        System.out.println(
                "We sent the Book to ur Email at " + email + " \nthe total amount is  " + this.get_price());
    }
}
