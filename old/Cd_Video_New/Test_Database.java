package Cd_Video_New;
public class Test_Database{
  public static void main(String[] args){
    
    CD c1 = new CD("Pagol Bondhu", "Mumtaj", 7, 30);
    CD c2 = new CD("Roshik Bondhu", "Ripon", 5, 60);
    Video v1 = new Video("Kaka Keno Neka", "Aman", 180);
    Video v2 = new Video("Shami Keno Ashami", "Alokanonda", 150);
    
     Database d = new Database();
     d.addItem(c1);
     d.addItem(v1);
     d.addItem(v2);
     d.addItem(c2);
     
     System.out.println(d);
     d.RemoveItem(1);
     System.out.println(d);
    
  }

}