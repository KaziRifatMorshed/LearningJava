package Inventory_Management;

public class Magazine extends Item {
    protected int issueNum;

    public Magazine(int id, String title, double price, int issueNum) {
        super(id, title, price);
        this.issueNum = issueNum;
    }

    @Override
    public String toString() {
        return "Magazine - ID: " + id + ", Title: " + title + ", Issue Number: " + issueNum + ", Price: $" + price;
    }
}
