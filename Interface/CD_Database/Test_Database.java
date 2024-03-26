package Interface.CD_Database;

public class Test_Database {
    public static void main(String[] args) {
        CD c1 = new CD("Pagol Bondhu", "Sakib Khan", 7, 30);
        CD c2 = new CD("Roshik Bondhu", "Durjoy", 5, 60);
        Video v1 = new Video("Kaka, the Uncle", "অনন্ত Jolil", 180);
        Video v2 = new Video("Shami keno Ashami", "Jayed Khan", 30);
        Database d = new Database();
        d.addItem(c1);
        d.addItem(v1);
        d.addItem(v2);
        d.addItem(c2);
        d.Sort();
        System.out.println(d);
    }
}
/*
Video : Ashami Keno Shami (30 mins)
    director: Alice
CD : Pagol Bondhu (30 mins)
    artist: Mumtaj
    number of tracks: 7
CD : Roshik Bondhu (60 mins)
    artist: Durjoy
    number of tracks: 5
Video : Kaka Keno Neka (180 mins)
    director: Razeeb
*/