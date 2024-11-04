package Inventory_Management;

public class CD extends Item implements discountable {
    protected String artist;

    public CD(int id, String title, double price, String artist) {
        super(id, title, price);
        this.artist = artist;
        is_discountable = true;
    }

    public String toString() {
        return "CD - ID: " + id + ", Title: " + title + ", Artist: " + artist + ", Price: $" + price;
    }

    @Override
    public double discount_it(double percent) {
        return price - (percent * price / 100);
    }

    @Override
    public double getPrice(double d) {
        return discount_it(d);
    }
}
