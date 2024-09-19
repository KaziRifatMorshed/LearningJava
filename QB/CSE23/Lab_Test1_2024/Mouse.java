package Lab_Test1_2024;

public class Mouse {
    String obj_name;
    public Mouse(String name){
    obj_name = name;
    }
    public String getObj_name(){
        return obj_name;
    }
    public void Catch(Cat a){
        //System.out.println(STR."\{this.obj_name} caught \{a.getObj_name()}.");
        System.out.println(this.obj_name + " caught " + a.getObj_name() + ".");
    }
    public String toString() {
        return "There is a mouse named " + obj_name + ".";
    }
}
