package Inventory_Management;

/*
* Q1.You are tasked with creating a simple inventory management system for a bookstore.
The system should be able to handle different types of items
such as books, magazines, and CDs. Each item has a unique ID, title, and price.

Note: Create an interface Discountable and Both Book and CD should implement this interface.
* */

public class main_class {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding items to inventory
        manager.addItem(new Book(1, "Java Programming", 20.0, "John Doe"));
        manager.addItem(new Magazine(2, "Tech Today", 5.0, 25));
        manager.addItem(new CD(3, "Greatest Hits", 15.0, "The Beatles"));

        // Displaying all items in inventory
        System.out.println("Inventory:");
        manager.displayInventory();

        // Calculating total price with discount
        double totalPrice = manager.calculateTotalPrice(10); // 10% discount
        System.out.println("Total price after 10% discount: $" + totalPrice);
    }
}
/*
* Inventory:
Book - ID: 1, Title: Java Programming, Author: John Doe, Price: $20.0
Magazine - ID: 2, Title: Tech Today, Issue Number: 25, Price: $5.0
CD - ID: 3, Title: Greatest Hits, Artist: The Beatles, Price: $15.0
Total price after 10% discount: $36.0
* */
