package Lab_Test2_2024;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<Flower> fList = new ArrayList<>();
        fList.add(new Flower("SunFlower","Yellow"));
        fList.add(new Tulip("Red"));
        fList.add(new Rose("Pink"));
        fList.add(new Rose());
        fList.add(new Flower());
        for(Flower f:fList){
           System.out.println(f);
        }
    }
    
}