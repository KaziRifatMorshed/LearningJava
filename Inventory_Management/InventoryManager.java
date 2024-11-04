package Inventory_Management;

import java.util.ArrayList;
import java.util.Iterator;

public class InventoryManager {
    protected ArrayList<Item> items = null;

    public InventoryManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item i) {
        items.add(i);
    }

    public Item getItem(int i) {
        return items.get(i);
    }

    public void displayInventory() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }

    public double calculateTotalPrice(double percentage) {
        double finalPrice = 0;
        for (int i = 0; i < items.size(); i++) {
            Item iii = items.get(i);
            if (iii.is_discountable == true) {
                finalPrice += iii.getPrice(percentage);
            } else {
                finalPrice += iii.getPrice();
            }

        }

        return finalPrice;
    }

}
