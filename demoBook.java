package QuantumBookstore;

public class demoBook extends Book {

    public demoBook(String ISBN, String title, int publish_year, double price) {
        super(ISBN, title, publish_year, price);
    }

   
    public void Buy(String ISBN, int quantity, String email, String address) {
        System.out.println("Demo books are not for sale !!");
    }

}
