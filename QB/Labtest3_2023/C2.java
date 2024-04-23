package Labtest3_2023;

public class C2 extends C1 {

    public C2(String text) {
        super(text);
    }
    public void print(){
        System.out.println(STR."From print Method of C2 class: \{text}");
    }

    @Override
    public String toString() {
        return STR."C2{\{super.toString()}\{'}'}";
    }
    
}
