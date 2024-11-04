package Inventory_Management;

public class Book extends Item implements discountable {
    protected String author;


    public Book(int id, String title, double price, String author) {
        super(id, title, price);
        this.author = author;
        is_discountable = true;
    }

    @Override
    public double discount_it(double percent) {
        return price - (percent * price / 100);
    }

    @Override
    public double getPrice(double d) {
        return discount_it(d);
    }

    public String toString() {
        return "Book - ID: " + this.id + ", Title: " + this.title + ", Author: " + this.author + ", Price: $" + this.price;
    }



}
