package Labtest3_2023;

public class C1 implements Printable{
    String text;

    public C1(String text) {
        this.text = text;
    }
    @Override
    public void print(){
        System.out.println(STR."From print Method of C1 class: \{text}");
    }
    @Override
    public String toString() {
        return STR."C1{text=\{text}\{'}'}";
    }
    
}