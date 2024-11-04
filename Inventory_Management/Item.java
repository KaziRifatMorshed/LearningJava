package Inventory_Management;

public class Item {
    protected int id;
    protected String title;
    protected double price;
    boolean is_discountable = false;

    public Item(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public double getPrice(double d) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
