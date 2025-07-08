package QuantumBookstore;

abstract class Book {
    String ISBN;
    String title;
    int publish_year;
    double price;

    public Book(String ISBN, String title, int publish_year, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.publish_year = publish_year;
        this.price = price;
    }

    public int get_pub_year() {
        return this.publish_year;
    }

    public double get_price() {
        return this.price;
    }

    public String get_ISBN() {
        return this.ISBN;
    }

    abstract void Buy(String ISBN, int quantity, String email, String address);

}
