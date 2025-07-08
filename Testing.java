package QuantumBookstore;

public class Testing {

    public static void main(String[] args) {
        Inventory Inv = new Inventory();

        Book paperBook = new paperBook("ISBN #1", "Fawry", 2018, 200, 10);
        Inv.Add(paperBook);
        Book eBook = new EBook("ISBN #2", "OOP", 2018, 50, "PDF");
        Inv.Add(eBook);
        Book demo = new demoBook("ISBN #3", "Algortims", 2010, 300);
        Inv.Add(demo);

        Inv.remove(3);
        Inv.Buy("ISBN #1", 5, "ezzeldinereda@gmail.com", "cairo-201");
        Inv.Buy("ISBN #2", 0, "ezzeldinereda@gmail.com", null);
        Inv.Buy("ISBN #3", 0, "ezzeldinereda@gmail.com", null);

    }

}
