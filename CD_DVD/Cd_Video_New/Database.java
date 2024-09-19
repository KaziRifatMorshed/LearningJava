package Cd_Video_New;
import java.util.*;
public class Database {
    private ArrayList<Item> items;

   public Database()  {
        items = new ArrayList<Item>();
    }

   public void addItem(Item theItem)  {
        items.add(theItem);
    }
   public void RemoveItem(int i)  {
        items.remove(i);
    }
   @Override
   public String toString() {
   String result = "";
        for(Item i:items)
            result += i.toString();
    
        return result;
    }
}
